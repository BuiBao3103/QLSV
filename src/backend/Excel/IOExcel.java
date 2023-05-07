/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Excel;

import GUI.MainPanel.Schedule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author ASUS
 */
public class IOExcel {

    public static ArrayList<ArrayList<Object>> readExcel(int sheetIndex) throws IOException, InvalidFormatException {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.showOpenDialog(null);
        File savefile = jFileChooser.getSelectedFile();
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        File file = new File(savefile.getPath());
        if (!file.exists()) {
            throw new IOException("File not found: " + savefile.getPath());
        }
        try (FileInputStream fileInputStream = new FileInputStream(file); Workbook workbook = WorkbookFactory.create(fileInputStream)) {
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            for (Row row : sheet) {
                Iterator<Cell> cellIterator = row.cellIterator();
                ArrayList<Object> rowData = new ArrayList<>();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING ->
                            rowData.add(cell.getStringCellValue());
                        case Cell.CELL_TYPE_NUMERIC ->
                            rowData.add(String.valueOf(cell.getNumericCellValue()));
                        case Cell.CELL_TYPE_BOOLEAN ->
                            rowData.add(String.valueOf(cell.getBooleanCellValue()));
                        default ->
                            rowData.add("");
                    }
                }
                data.add(rowData);
            }
        }
        return data;
    }

    public static void writeExcel(JTable table, String header, String sheetName) {
        try {
            JFileChooser jfc = new JFileChooser();
            //hiển thị hộp thoại cho người dùng chọn nơi lưu tập tin
            jfc.showSaveDialog(table.getParent());
            File file = jfc.getSelectedFile();
            if (file == null) {
                JOptionPane.showMessageDialog(null, "Xuất File Excel thất bại");
                return;
            }
            file = new File(file.toString() + ".xlsx");
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet sheet = wb.createSheet(sheetName);
            Row row = sheet.createRow(0);
            CellStyle style = wb.createCellStyle();
            style.setAlignment(HorizontalAlignment.CENTER);
            XSSFFont font = wb.createFont();
            font.setBold(true);
            font.setFontHeightInPoints((short) 16);
            style.setFont(font);
            Cell cell = row.createCell(0);
            cell.setCellValue(header);
            cell.setCellStyle(style);
            //câu lệnh này dùng để các ô trong sheet thành 1 ô duy nhất
            sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, table.getColumnCount() - 1));
            style = wb.createCellStyle();
            style.setAlignment(HorizontalAlignment.CENTER);
            row = sheet.createRow(1);
            for (int i = 0; i < table.getColumnCount(); i++) {
                cell = row.createCell(i);
                cell.setCellValue(table.getColumnName(i));
                cell.setCellStyle(style);
            }
            style = wb.createCellStyle();
            style.setAlignment(HorizontalAlignment.CENTER);
            for (int i = 0; i < table.getRowCount(); i++) {
                row = sheet.createRow(i + 2);
                for (int j = 0; j < table.getColumnCount(); j++) {
                    cell = row.createCell(j);
                    Object value = table.getValueAt(i, j);
                    cell.setCellValue(value != null ? value.toString() : "");
                    cell.setCellStyle(style);
                }
            }
            //dùng để auto resize cho các cột dữ liệu
            for (int i = 0; i < table.getColumnCount(); i++) {
                sheet.autoSizeColumn(i);
            }
            try (FileOutputStream out = new FileOutputStream(file)) {
                wb.write(out);
            }
            JOptionPane.showMessageDialog(null, "Xuất File Excel thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xuất File Excel thất bại");
            e.printStackTrace();
        }
    }

}

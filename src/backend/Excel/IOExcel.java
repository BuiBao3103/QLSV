/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Excel;

import frontend.Schedule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author ASUS
 */
public class IOExcel {

    public static void readExcel(File file) {
        try {
            FileInputStream inputStream = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                    }
                }
                System.out.println();
            }
            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeExcel(JTable table, String header) {
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(table.getParent());
            File savefile = jFileChooser.getSelectedFile();
            if (savefile != null) {
                savefile = new File(savefile.toString() + ".xlsx");
                XSSFWorkbook wb = new XSSFWorkbook();
                XSSFSheet sheet = wb.createSheet("dssv");
                Row rowCol = sheet.createRow(0);

                // Set title
                CellStyle titleStyle = wb.createCellStyle();
                titleStyle.setAlignment(HorizontalAlignment.CENTER);
                XSSFFont font = wb.createFont();
                font.setBold(true);
                font.setFontHeightInPoints((short) 16);
                titleStyle.setFont(font);
                Cell titleCell = rowCol.createCell(0);
                titleCell.setCellValue(header);
                titleCell.setCellStyle(titleStyle);
                sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, table.getColumnCount() - 1));

                // Set header
                CellStyle headerStyle = wb.createCellStyle();
                headerStyle.setAlignment(HorizontalAlignment.CENTER);
                Row rowHeader = sheet.createRow(1);
                for (int i = 0; i < table.getColumnCount(); i++) {
                    Cell cell = rowHeader.createCell(i);
                    cell.setCellValue(table.getColumnName(i));
                    cell.setCellStyle(headerStyle);
                    if (i == 1) {
                        sheet.setColumnWidth(i, 9000);
                    } else {
                        sheet.setColumnWidth(i, 3000);

                    }
                }

                // Set data
                CellStyle dataStyle = wb.createCellStyle();
                dataStyle.setAlignment(HorizontalAlignment.CENTER);
                for (int j = 0; j < table.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 2);
                    for (int k = 0; k < table.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (table.getValueAt(j, k) != null) {
                            cell.setCellValue(table.getValueAt(j, k).toString());
                        }
                        cell.setCellStyle(dataStyle);
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(savefile.toString()));
                wb.write(out);
                out.close();
                JOptionPane.showMessageDialog(table, "Xuất File Excel thành công");

            } else {
                JOptionPane.showMessageDialog(table, "Xuất File Excel thất bại");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

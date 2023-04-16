/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaError;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ASUS
 */
public class TestExcel {

    public static void writeExcel() throws IOException {
        FileOutputStream file = new FileOutputStream("write.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet worksheet = workbook.createSheet("name");
        XSSFRow row;
        XSSFCell cellA;
        XSSFCell cellB;
        for (int i = 0; i < 10; i++) {
            row = worksheet.createRow((short) i);
            cellA = row.createCell((short) 0);
            cellA.setCellValue((i + 1));
            cellB = row.createCell((short) 1 );
            cellB.setCellValue((i + 2));
        }
        workbook.write(file);
        workbook.close();
        file.close();
    }

    public static void readExcel() throws IOException {
        File fileTest = new File("Book1.xlsx");
        if (fileTest.exists()) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
        FileInputStream file = new FileInputStream(fileTest);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        FormulaEvaluator formula = workbook.getCreationHelper().createFormulaEvaluator();
        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (formula.evaluateInCell(cell).getCellTypeEnum()) {
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        readExcel();
        writeExcel();
    }
}

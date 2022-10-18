package com.basics.KeywordDrivenTest;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OrangeHrmExcelUtilityFile {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void setExcelFile(String path, String sheetName) throws IOException { //to set path,workbook and sheet
        FileInputStream fis = new FileInputStream(path);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
    }
    public static String getCellData(int row, int col) { //to get cell data ie data in rows and cols
        Cell c = sheet.getRow(row).getCell(col); //fetch row and cell
        String cellData = c.getStringCellValue(); //fetch data within each cell
        return cellData;
    }
}

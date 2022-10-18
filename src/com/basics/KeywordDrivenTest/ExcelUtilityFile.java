package com.basics.KeywordDrivenTest;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtilityFile {
    static XSSFWorkbook workbook; //reading workbook
    static XSSFSheet sheet; //reading sheet name

    public static void setExcelFile(String path, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
    }

    public static String getCellData(int row, int col) {
        Cell cell = sheet.getRow(row).getCell(col);
        String cellData = cell.getStringCellValue();
        return cellData;
    }

}

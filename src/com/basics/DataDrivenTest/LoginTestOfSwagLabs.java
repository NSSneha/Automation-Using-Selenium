package com.basics.DataDrivenTest;

import com.basics.common.Setup;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginTestOfSwagLabs {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();

        int successFullLoginCount = 0; //default count to be 0
        int unSuccessfulLoginCount = 0; //same a abv
        //setting the path of the workbook
        FileInputStream filePath = new FileInputStream("C:\\Users\\Sneha\\IdeaProjects\\Automation\\resources\\Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        XSSFSheet sheet = workbook.getSheet("Sheet3"); //providing sheet name
        //to get no.of records ie no.of rows
        int rowsCount = sheet.getLastRowNum(); //19 cos row count starts from 0
        System.out.println("No.of records in the Excel sheet:" + rowsCount); //rows-1 because 1st row is heading we need data without heading

        for (int row = 1; row <= rowsCount; row++) {
            XSSFRow currentRow = sheet.getRow(row);
            String userName = currentRow.getCell(0).getStringCellValue(); //1st col
            String password = currentRow.getCell(1).getStringCellValue();

            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys(userName);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("login-button")).click();

            Thread.sleep(2000);

            String expectedUrl = "https://www.saucedemo.com/inventory.html";
            String actualUrl = driver.getCurrentUrl();

            System.out.println("Actual URL for record: " + row + " : " + actualUrl);
            System.out.println("Expected URL for record: " + row + " : " + expectedUrl);

            if(actualUrl.equalsIgnoreCase(expectedUrl)){
                System.out.println("Login successful for record : " + row);
                System.out.println(); //giving a lin after each o/p
                successFullLoginCount = successFullLoginCount + 1; // if successful increment the count

                driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
                Thread.sleep(2000);
                WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
                Actions act = new Actions(driver);
                act.moveToElement(logout).click().build().perform();
                Thread.sleep(2000);
            }
            else {
                System.out.println("Login Unsuccessful for record : " + row);
                System.out.println();
                unSuccessfulLoginCount = unSuccessfulLoginCount + 1;
            }
        }
        System.out.println("Data Driven Test Completed Successfully");
        System.out.println("Successful login count: " + successFullLoginCount);
        System.out.println("Unsuccessful Login count: " + unSuccessfulLoginCount);

        driver.quit();
        workbook.close();
        filePath.close();
    }
}

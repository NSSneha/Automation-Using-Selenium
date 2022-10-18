package com.basics.KeywordDrivenTest;

import com.beust.ah.A;

import java.io.IOException;

public class DriverScript {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
        String filePath = "./resources/Keywords.xlsx";
        ExcelUtilityFile.setExcelFile(filePath,"Sheet1" );

        for (int i = 0; i<7; i++) {
            String actionKeyword = ExcelUtilityFile.getCellData(i, 0); //only 1 col is there it starts with 0th index
            if(actionKeyword.equalsIgnoreCase("openBrowser")) {
                ActionKeywords.openBrowser(); //CLASS_NAME.METHOD_NAME because it is static no obj creation
            }
            else if (actionKeyword.equalsIgnoreCase("navigateToUrl")) {
                ActionKeywords.navigateToUrl();
            }
            else if (actionKeyword.equalsIgnoreCase("inputUserName"))  {
                ActionKeywords.inputUserName();
            }
            else if (actionKeyword.equalsIgnoreCase("inputPassword")) {
                ActionKeywords.inputPassword();
            }
            else if (actionKeyword.equalsIgnoreCase("clickLoginButton")) {
                ActionKeywords.clickLoginButton();
            }
            else if (actionKeyword.equalsIgnoreCase("closeBrowser")) {
                ActionKeywords.closeBrowser();
            }
        }
        System.out.println("Keyword driven test completed successfully");
    }
}

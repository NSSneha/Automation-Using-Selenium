package com.basics.KeywordDrivenTest;

import java.io.IOException;

public class OrangeHrmDriverScript {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        String filePath = "./resources/Keywords.xlsx";
        OrangeHrmExcelUtilityFile.setExcelFile(filePath, "Sheet2");

        for (int i = 0; i < 8; i++) {
            String actionKeyword = OrangeHrmExcelUtilityFile.getCellData(i, 0); //excel utility's cell data to be fetched
            if (actionKeyword.equalsIgnoreCase("openBrowser")) {
                OrangeHrmActionKeywords.openBrowser(); //classname of action's keyword.method name of excel utility file
            }
            else if (actionKeyword.equalsIgnoreCase("navigateToUrl")) {
                OrangeHrmActionKeywords.navigateToUrl();
            }
            else if (actionKeyword.equalsIgnoreCase("inputUserName")) {
                OrangeHrmActionKeywords.inputUserName();
            }
            else if (actionKeyword.equalsIgnoreCase("inputPassword")) {
                OrangeHrmActionKeywords.inputPassword();
            }
            else if (actionKeyword.equalsIgnoreCase("clickLoginButton")) {
                OrangeHrmActionKeywords.clickLoginButton();
            }
            else if (actionKeyword.equalsIgnoreCase("clickOnOptionButton")) {
                OrangeHrmActionKeywords.clickOnOptionButton();
            }
            else if (actionKeyword.equalsIgnoreCase("clickLogoutButton")) {
                OrangeHrmActionKeywords.clickLogoutButton();
            }
            else if (actionKeyword.equalsIgnoreCase("closeBrowser")) {
                OrangeHrmActionKeywords.closeBrowser();
            }
        }
        System.out.println("Keyword driven test completed successfully");
    }
}
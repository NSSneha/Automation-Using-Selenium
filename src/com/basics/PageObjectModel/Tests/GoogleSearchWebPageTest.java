package com.basics.PageObjectModel.Tests;

import com.basics.PageObjectModel.Pages.GoogleSearchWebPage;
import com.basics.common.Setup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchWebPageTest {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        driver = new Setup().chromeSetup();
        driver.get("https://www.google.com");
        GoogleSearchWebPage.searchBox(driver).sendKeys("Selenium"); // it is static and hence no reqt of obj creation
        GoogleSearchWebPage.searchButton(driver).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.quit();
    }
}

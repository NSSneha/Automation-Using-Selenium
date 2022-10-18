package com.basics.PageObjectModel.Tests;

import com.basics.PageObjectModel.Pages.GSPageObject;
import com.basics.common.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSPageObjectTest {
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        googleSearchTest(); //method is static no obj creation needed. directly call the method
    }
    public static void googleSearchTest() throws InterruptedException {
        driver = new Setup().chromeSetup();
        GSPageObject obj = new GSPageObject(driver);
        driver.get("https://www.google.com");
        obj.setSearchBox("Selenium");
        Thread.sleep(1000);
        obj.clickSearchButton();
        Thread.sleep(1000);
        driver.quit();
    }
}

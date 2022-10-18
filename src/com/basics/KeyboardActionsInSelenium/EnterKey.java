package com.basics.KeyboardActionsInSelenium;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EnterKey {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        driver = new Setup().chromeSetup();
        driver.get("https://www.google.com/");
        //using the keys class to simulate Enter key
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        Thread.sleep(1000);
        driver.quit();
    }
}

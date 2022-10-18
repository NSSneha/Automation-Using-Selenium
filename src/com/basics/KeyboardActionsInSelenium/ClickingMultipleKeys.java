package com.basics.KeyboardActionsInSelenium;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickingMultipleKeys {
    private static WebDriver driver;
//simulating of pressing of multiple keys
    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        //to press multiple keys use ACTIONS CLASS(to perform keyboard class)
        Actions builder = new Actions(driver);
        Action keyDown = builder.keyDown(Keys.CONTROL).sendKeys("A").build();
        //Use PERFORM method when builder is used we use perform()
        keyDown.perform();
        Thread.sleep(2000);
    }
}

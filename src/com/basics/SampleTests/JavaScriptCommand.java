package com.basics.SampleTests;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptCommand {
    private static WebDriver driver;

    public static void main(String[] args) {
        driver = new Setup().chromeSetup();
        driver.get("https://www.google.com");
        //to execute js cmds we have to use js executor

        JavascriptExecutor js = (JavascriptExecutor) driver; //we are type casting
        WebElement searchBox = driver.findElement(By.name("q"));
        js.executeScript("arguments[0].value = 'Selenium';", searchBox); //arg[0] is constant always; value for inputting data
        WebElement button = driver.findElement(By.cssSelector(".RNmpXc")); //class we are taking so .
        js.executeScript("arguments[0].click();",button); //to click we use for clicking an element
        js.executeScript("console.log('Hello World..!!')");
    }
}

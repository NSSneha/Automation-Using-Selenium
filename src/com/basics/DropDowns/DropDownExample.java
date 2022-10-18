package com.basics.DropDowns;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        //to test options
        driver.get("https://trytestingthis.netlify.app/");

        //store in web element
        WebElement dropDown = driver.findElement(By.id("option"));
        //use select class
        Select select = new Select(dropDown);
        Thread.sleep(1000);
        //by index,indesx,visible text 3 options for selection
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByValue("option 2");
        Thread.sleep(1000);
        select.selectByVisibleText("Option 3");

        //deselecting operation
        WebElement dropDown1 = driver.findElement(By.id("owc"));
        Select select1 = new Select(dropDown1);
        select1.selectByIndex(1);
        Thread.sleep(1500);
        select1.selectByValue("option 2");
        Thread.sleep(1500);
        select1.selectByVisibleText("Option 3");
        Thread.sleep(1500);
        select1.deselectByVisibleText("Option 3");

        Thread.sleep(2000);
        driver.quit();

        System.out.println("Task completed");
    }
}
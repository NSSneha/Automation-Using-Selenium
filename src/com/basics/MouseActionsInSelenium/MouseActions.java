package com.basics.MouseActionsInSelenium;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
        WebElement boxB = driver.findElement(By.xpath("//li[text()='B']"));

        Actions builder = new Actions(driver);
        builder.moveToElement(boxA); // to move an element
        //to hold click and hold method is used
        builder.clickAndHold();
        Thread.sleep(2000);
        builder.moveToElement(boxB);
        builder.build().perform();
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Task completed successfully");
    }
}

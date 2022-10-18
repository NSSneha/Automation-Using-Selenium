package com.basics.MouseActionsInSelenium;

import com.basics.common.Setup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickTask {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions(driver);
        action.contextClick(ele).build().perform();
        driver.findElement(By.xpath("//span[text()='Quit']")).click();
        // method 2
       // WebElement quit = driver.findElement(By.xpath("//span[text()='Quit']")).click();
       // action.click(quit).perform();
        Alert a = driver.switchTo().alert();
        String msg = a.getText();
        Thread.sleep(2000);
        System.out.println("The msg is: " + msg);
        Thread.sleep(2000);
        a.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
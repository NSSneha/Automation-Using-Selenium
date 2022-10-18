package com.basics.AlertsInSelenium;

import com.basics.common.Setup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlingAlerts {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup(); //class_name.method_name
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);

        //javascript alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        //create alert class object

        Alert alert1 = driver.switchTo().alert();//if u have to do something with alert we need to switch
        String msg1 = alert1.getText();
        Thread.sleep(2000);
        System.out.println("Alert Message: " + msg1);
        alert1.accept();
        Thread.sleep(2000);
        if (driver.getPageSource().contains("You successfully clicked an alert"))
            System.out.println("Clicked OK Successfully");
        System.out.println("....................................................");

        // JS Confirm
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        String msg2 = alert2.getText();
        Thread.sleep(2000);
        System.out.println("Alert Message: " + msg2);
        alert1.dismiss();
        Thread.sleep(2000);
        if (driver.getPageSource().contains("You clicked: Cancel"))
            System.out.println("Clicked Cancel Successfully");
        System.out.println("....................................................");

        //JS Prompt
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        String msg3 = alert3.getText();
        Thread.sleep(2000);
        System.out.println("Alert Message: " + msg3);
        Thread.sleep(3000);
        alert3.sendKeys("Software Testing");
        Thread.sleep(2000);
        alert3.accept();
        if (driver.getPageSource().contains("You entered: Software Testing"))
            System.out.println("Entered text to prompt successfully");
        System.out.println("....................................................");
        Thread.sleep(1000);
        driver.quit();
    }
}

package com.basics.Frames;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesInSelenium { //NoSuchElementException occurs
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        //with help of driver we need to switch to frame
        driver.switchTo().frame("packageFrame");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Action")).click();
        driver.switchTo().defaultContent(); //best practise to switch from 1 frame to another
        driver.switchTo().frame("packageListFrame");
        Thread.sleep(2000);
        driver.findElement(By.linkText("org.openqa.selenium")).click();
    }
}

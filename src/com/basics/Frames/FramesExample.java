package com.basics.Frames;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesExample {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        Thread.sleep(2000);
        String txt1 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("The web element1 text is:" +txt1);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.id("frame2")));
        Thread.sleep(2000);

        String txt2 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("The web element2 text is:" + txt2);
        Thread.sleep(1000);
        driver.quit();

    }
}

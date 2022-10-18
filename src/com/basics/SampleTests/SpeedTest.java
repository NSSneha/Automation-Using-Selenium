package com.basics.SampleTests;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpeedTest {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup(); //class_name.method_name
        driver.get("https://www.speedtest.net/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Go']")).click();
        //Thread.sleep(2000);
        //driver.quit();
    }
}


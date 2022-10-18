package com.basics.SampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER); //instead of last 2 below statements the Keys.ENTER is used for keyboard enter key operation
       // Thread.sleep(1000); //not a proper method
       // driver.findElement(By.name("btnK")).click();
    }
}

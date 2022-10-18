package com.basics.Xpaths.RelativeXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GmailExample {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//form/span/section/div/div/div/div/div/div/div/input[@id='identifierId']")).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("xyz@gmail.com");
        Thread.sleep(1000);
    }
}
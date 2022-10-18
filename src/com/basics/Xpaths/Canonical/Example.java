package com.basics.Xpaths.Canonical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/automation/");
        Thread.sleep(2000);
        String fli = driver.findElement(By.xpath("//a[text()='Learn how to automate an application that evolves over time']//following::li[2]")).getText();
        String pli = driver.findElement(By.xpath("//a[text()='Learn how to automate an application that evolves over time']//preceding::li[2]")).getText();
        System.out.println("Following: " + fli);
        System.out.println("Preceding: " + pli);
        driver.quit();
    }
}

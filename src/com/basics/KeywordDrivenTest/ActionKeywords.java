package com.basics.KeywordDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
    //here we will have all our methods

    public static WebDriver driver;

    public static void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void navigateToUrl() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
    }

    public static void inputUserName() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
    }

    public static void inputPassword() throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
    }

    public static void clickLoginButton() throws InterruptedException {
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }

    public static void closeBrowser() {
        driver.quit();
    }
}

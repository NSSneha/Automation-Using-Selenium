package com.basics.KeywordDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmActionKeywords {
    public static WebDriver driver;

    public static void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void navigateToUrl() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
    }

    public static void inputUserName() throws InterruptedException{
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);
    }

    public static void inputPassword() throws InterruptedException {
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);
    }

    public static void clickLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
    }

    public static void clickOnOptionButton() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        Thread.sleep(2000);
    }

    public static void clickLogoutButton() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(2000);
    }
    public static void closeBrowser() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }
}

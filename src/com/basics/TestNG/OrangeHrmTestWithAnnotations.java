package com.basics.TestNG;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrmTestWithAnnotations {
    static WebDriver driver;

    @BeforeTest
    public void testSetUp() {
        driver = new Setup().chromeSetup();
    }

    @Test(priority = 1)
    public void loginToAppln() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Logged in successfully");
    }

    @Test(priority = 2)
    public void logoutFromAppln() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(1000);
        System.out.println("Logged out successfully");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser closed successfully");
    }
}

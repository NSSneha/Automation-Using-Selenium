package com.basics.TestNG;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWithAnnotations {
    static WebDriver driver;

    @BeforeTest
    public void testSetUp() {
        driver = new Setup().chromeSetup();
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Thread.sleep(2000);
        if (actualUrl.equalsIgnoreCase(expectedUrl)){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Login Unsuccessful");
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
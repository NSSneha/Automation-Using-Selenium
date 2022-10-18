package com.basics.TestNG;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestWithoutAnnotations {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equalsIgnoreCase(expectedUrl)){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Login Unsuccessful");
        }
        driver.quit();
    }
}

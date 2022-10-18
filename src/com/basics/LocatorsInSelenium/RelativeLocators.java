package com.basics.LocatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelativeLocators {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        /**
         * above
         * below
         * toLeftOf
         * toRightOf
         * near
         **/
        //this is correctly located
        WebElement loginButton = driver.findElement(By.id("login-button"));
        driver.findElement(RelativeLocator.with(By.name("password")).above(loginButton)).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.quit();

    }
}

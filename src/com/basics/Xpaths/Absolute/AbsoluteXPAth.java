package com.basics.Xpaths.Absolute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AbsoluteXPAth {
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
         * ABSOLUTE XPATH : starting with single forward slash
         * We go till the current node or element which we are trying to access
         **/

        //for user name [1] is the index
        driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/form/div/input)[1]")).sendKeys("HI");

        //for password
        driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/form/div/input)[2]")).sendKeys("abcd");

    }
}
package com.basics.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    static WebDriver driver; //best method to create a driver object in static manner

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //need to inform test case that we have the driver use it from our prj
        driver = new ChromeDriver(); //using static instance
        driver.manage().window().maximize(); //to maximize the window
        driver.get("https://www.google.com"); // to open a web page & i/p url
        Thread.sleep(1000); //hard wait //bad method for automation just for now practise we are using
        driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(1000);
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.navigate().back(); //back
        Thread.sleep(1000);
        driver.navigate().forward(); //forward
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("pass")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(1000);
        driver.navigate().refresh(); //refresh
        Thread.sleep(2000);

        //driver.close();
    }
}


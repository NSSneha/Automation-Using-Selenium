package com.basics.Windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsInSelenium {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //the below statement must be given to handle the window after getting into google
        String baseWindow = driver.getWindowHandle(); // this method is used to switch to the tab
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB); //opens a new tab in the earlier window
        Thread.sleep(2000);
        driver.switchTo().window(baseWindow); //to switch from 1 tab to other
        //driver.quit();
        //driver.close();
    }
}

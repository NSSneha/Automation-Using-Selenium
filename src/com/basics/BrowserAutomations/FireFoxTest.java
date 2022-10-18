package com.basics.BrowserAutomations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com"); // to open a web page & i/p url
        String url = driver.getCurrentUrl(); //to fetch current url
        System.out.println("The current url is: " + url);
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        driver.close();
    }
}

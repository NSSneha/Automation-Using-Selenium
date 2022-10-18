package com.basics.BrowserAutomations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerTest {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl(); //to fetch current url
        System.out.println("The current url is: " + url);
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        //driver.close();

    }
}

package com.basics.BrowserAutomations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicroSoftEdgeTest {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl(); //to fetch current url
        System.out.println("The current url is: " + url);
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        //driver.close();

    }
}

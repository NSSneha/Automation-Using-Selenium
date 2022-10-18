package com.basics.BrowserAutomations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BraveBrowserTest {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //need to inform test case that we have the driver use it from our prj
        ChromeOptions option = new ChromeOptions();// chrome opt class we need to use and need to create an obj of chrome option
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        driver = new ChromeDriver(option);
        driver.get("https://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println("The current url is: " + url);
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        driver.close();
    }
}

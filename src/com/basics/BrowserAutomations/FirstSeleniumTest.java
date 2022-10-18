package com.basics.BrowserAutomations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
    static WebDriver driver; //best method to create a driver object in static manner

    public static void main(String[] args) {

        //create obj of web driver
        //web driver is parent interface of all drivers
        //set property 2 arguments 1.name of driver: chrome driver 2. path of the driver: ./means inside current project in drivers folder the exe file chrome driver

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //need to inform test case that we have the driver use it from our prj
        // WebDriver driver = new ChromeDriver(); // bad practise

        driver = new ChromeDriver(); //using static instance
        driver.get("https://www.google.com"); // to open a web page & i/p url
        String url = driver.getCurrentUrl(); //to fetch current url
        System.out.println("The current url is: " + url);
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        //driver.get("https://www.youtube.com/codersarcade");
        //driver.close(); //to close the window automatically
    }
}


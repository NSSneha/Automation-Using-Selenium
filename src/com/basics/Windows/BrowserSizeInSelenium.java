package com.basics.Windows;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSizeInSelenium {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //to set height and width of browser

        //method 1 using variables
        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        System.out.println("The height of the window: " + height);
        System.out.println("The width of the window: " + width);

        //method 2 using diemnsion class
        Dimension size = driver.manage().window().getSize();
        System.out.println("The height is: " + size.getHeight());
        System.out.println("The width is: " + size.getWidth());

        //to set a new size to a window
        driver.manage().window().setSize(new Dimension(800, 600));

        //method 1 position of window by taking variables
        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getX();
        System.out.println("X position: " + x + " Y position: " + y);

        //method 2 position of window by taking Point Class
        Point position = driver.manage().window().getPosition();
        System.out.println("X position: " + position.getX() + " Y position: " + position.getY());

        driver.manage().window().setPosition(new Point(500, 100));
        Thread.sleep(1000);
        driver.close();
    }
}

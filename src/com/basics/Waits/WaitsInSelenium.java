package com.basics.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.function.Function;

public class WaitsInSelenium {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();

        /* Implicit wait
        *  This is provided cos some web elements takes different load time
        * This is the max time limit selenium will wait to find that element
        * if it is found early within the time specified, it will go to next action & will not wait
        * By default the wait time is set to 0
        * once it is set it will be valid for entire session lifetime
        * the polling frequency/time is 500ms
        * Polling freq: It means that selenium will wait & search for the web element every 500ms in 10ms as specified 10 below
        * */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //10 is user defined
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //page load time out
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2)); //for loading script we have written
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Coders Arcade", Keys.ENTER);

        /**Explicit wait
         * This is provided if we need to meet a certain condition on the webpage before performing any action
         * We call ExpectedConditions class and access the conditions according to our requirement.
         * Cnt not change polling freq here
         * */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.findElement(By.partialLinkText("Coders Arcade - Educational Institution in RR Nagar")).click(); //inspect n hover to know the link name
        //below wait statement is used to inform that we wait until the link is clicked
        WebElement weblink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Coders Arcade - Educational Institution in RR Nagar")));
        weblink.click(); //click web link

        /**FluentWait
         * Its almost like similar to explicit wait
         * we can ignore exception
         * we can change the polling freq
         * */

        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(20))
                        .pollingEvery(Duration.ofSeconds(2))
                        .ignoring(org.openqa.selenium.NoSuchElementException.class);
        WebElement review = driver.findElement(By.linkText("Write a Review"));
        fluentWait.until(ExpectedConditions.visibilityOf(review));
        review.click();

        driver.quit();
    }
}


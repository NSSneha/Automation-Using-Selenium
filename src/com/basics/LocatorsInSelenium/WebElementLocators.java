package com.basics.LocatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElementLocators {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);

        //normal method
        // driver.findElement(By.name("q")).sendKeys("Selenium");
        // driver.findElement(By.name("btnK")).click();

        //Standard or proper method is the below method.
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium", Keys.ENTER);
        Thread.sleep(1000);

        //Locate multiple elements
        driver.navigate().to("https://trytestingthis.netlify.app/");
        //here we are access list of web elements not like java to use list of string or integers
        List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
        for (WebElement option : options){
            System.out.println(option.getText());
        }

        //CSS SELECTOR
        /**
         * for ID we use '#' to create our css selector
         * for CLASS we use '.' to create our css selector
         */
        driver.findElement(By.cssSelector("#fname")).sendKeys("Sneha");
        Thread.sleep(2000);
        driver.quit();
    }

}

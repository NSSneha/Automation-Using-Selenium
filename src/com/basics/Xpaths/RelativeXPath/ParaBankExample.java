package com.basics.Xpaths.RelativeXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ParaBankExample {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Register']")).click(); //for texts we use text()
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Saurav");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Sarkar");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Channasandra, RR Nagar");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Bangalore");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Karnataka");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("560098");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("8888855555");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("080-2345678");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("xyz@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("abcd");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("abcd");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Thread.sleep(1000);








    }
}
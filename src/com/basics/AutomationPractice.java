package com.basics;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AutomationPractice {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        driver.findElement(By.id("email_create")).sendKeys("sne@gmail.com", Keys.ENTER);
        //driver.findElement(By.cssSelector(".icon-user left")).click();
        driver.findElement(By.xpath("//label[@for='id_gender2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Sneha");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("NS");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
        Thread.sleep(1000);
        WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='days']"));
        Select s1 = new Select(dropDown1);
        Thread.sleep(1000);
        s1.selectByValue("13");
        WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='months']"));
        Select s2 = new Select(dropDown2);
        Thread.sleep(1000);
        s2.selectByValue("5");
        WebElement dropDown3 = driver.findElement(By.xpath("//select[@id='years']"));
        Select s3 = new Select(dropDown3);
        Thread.sleep(1000);
        s3.selectByValue("1993");
        Actions a = new Actions(driver);
        a.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("ABC");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("No.23,1st block,8th cross,R.Nagar");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vi@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("near vvs school");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bangalore");
        Thread.sleep(1000);
        WebElement dropDown4 = driver.findElement(By.xpath("//select[@id='id_state']"));
        Select s4 = new Select(dropDown4);
        Thread.sleep(1000);
        s4.selectByVisibleText("Indiana");
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("78910");
        Thread.sleep(1000);
        WebElement dropDown5 = driver.findElement(By.xpath("//select[@id='id_country']"));
        Select s5 = new Select(dropDown5);
        Thread.sleep(1000);
        s5.selectByIndex(1);
        Actions a1 = new Actions(driver);
        a1.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567891011");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9876543210");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("ALIAS");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
        Thread.sleep(1000);
        a.build().perform();
        a1.build().perform();
        //driver.quit();
    }
}
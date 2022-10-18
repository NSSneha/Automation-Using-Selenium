package com.basics.MouseActionsInSelenium;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollingActionsInSelenium {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.tutorialspoint.com/index.htm");
        Actions a = new Actions(driver);
        a.sendKeys(Keys.PAGE_DOWN).build().perform(); //keys gvn gv build
        Thread.sleep(2000);
        WebElement scrollDownEle = driver.findElement(By.xpath("(//span[@class='text-green'])[1]"));
        String msg1 = scrollDownEle.getText();
        System.out.println("Scroll Down Element Text: " + msg1);
        a.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(2000);
        //Identify element by scroll up
        WebElement scrollUpEle = driver.findElement(By.xpath("(//a[@href='https://www.tutorialspoint.com/codingground.htm'])[1]"));
        String msg = scrollUpEle.getText();
        System.out.println("Scroll Up Element Text: " + msg);
        Thread.sleep(2000);
        driver.quit();
    }
}
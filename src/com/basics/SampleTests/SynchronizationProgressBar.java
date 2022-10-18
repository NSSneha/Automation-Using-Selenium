package com.basics.SampleTests;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SynchronizationProgressBar {


    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup(); //class_name.method_name
        driver.get("https://demoqa.com/progress-bar");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='startStopButton']")).click();

        //store progress bar inside web element
        WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar' and text()='100%']"));

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(progressBar));

        String finalText = driver.findElement(By.xpath("//div[@role='progressbar']")).getText();
        System.out.println("Download Percentage: " + finalText);

        driver.quit();
    }
}

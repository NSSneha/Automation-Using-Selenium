package com.basics.TestNG;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OrangeHrmDependencyCreation {
    private static WebDriver driver;

    @Test
    public void openBrowser() {
        driver = new Setup().chromeSetup();
    }

    @Test(dependsOnMethods = {"openBrowser"})
    public void loginToAppl() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(dependsOnMethods = {"loginToAppl"})
    public void logoutFromAppl() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = {"logoutFromAppl"})
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

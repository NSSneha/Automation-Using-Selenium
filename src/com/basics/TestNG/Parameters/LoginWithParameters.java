package com.basics.TestNG.Parameters;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginWithParameters {
    private static WebDriver driver;

    @Test
    @Parameters({"url", "username", "password"})
    public void loginWithParameters(String url,String username, String password) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get(url);
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}

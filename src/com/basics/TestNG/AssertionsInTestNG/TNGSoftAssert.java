package com.basics.TestNG.AssertionsInTestNG;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNGSoftAssert {
    private static WebDriver driver;
    SoftAssert sa = new SoftAssert(); //Creating obj of soft assert
    //it will only make the tc's execute all the tests after the soft assert and won't fail
    //this implementation is wrong.

    @Test
    public void sampleLoginTest() throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://saucedemo.com/");
        String title = driver.getTitle();
        Thread.sleep(2000);
        sa.assertEquals(title, "Swag Lab", "Title Mismatch");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        sa.assertEquals(false, true);
        Thread.sleep(2000);
        driver.quit();
        // here all the asserts are checked and it will give a failed report
        // if all the tests are not passed
        sa.assertAll();
    }
}

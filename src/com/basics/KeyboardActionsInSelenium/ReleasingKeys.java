package com.basics.KeyboardActionsInSelenium;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReleasingKeys {
    public static WebDriver driver;
//simulating of releasing of multiple keys
    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.google.com/");

        //actions class obj

        Actions actions = new Actions(driver);
        WebElement searchBox = driver.findElement(By.name("q")); //datatype is web element here.
        actions.keyDown(Keys.SHIFT).sendKeys(searchBox, "selenium") //have to put selenium in search box //upper case i/p
                .keyUp(Keys.SHIFT).sendKeys(searchBox, "selenium").perform(); //lower case i/p
        Thread.sleep(2000);
        searchBox.clear();
        Thread.sleep(2000);
        driver.quit();
    }
}

package com.basics.KeyboardActionsInSelenium;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SimulateKeyboardActions {
    public static WebDriver driver;

    //simulating of releasing of multiple keys
    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        Thread.sleep(2000);

        //actions class obj
            driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Sneha");
            //to perform keyboard use ACTIONS CLASS(to perform keyboard class)
            Actions action = new Actions(driver);
            action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))//pause method
                    .sendKeys("NS")
                    .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                    .sendKeys("sn@gmail.com")
                    .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                    .sendKeys("9900108601")
                    .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                    .sendKeys("123456")
                    .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                    .sendKeys("123456")
                    .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                    .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                    .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                    .sendKeys(Keys.SPACE)
                    .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                    .sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(3000);
    }
}


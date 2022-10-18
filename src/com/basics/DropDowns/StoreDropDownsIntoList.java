package com.basics.DropDowns;

/**
 * Navigation options
 *
 * */
import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StoreDropDownsIntoList {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        //to test options
        driver.get("https://trytestingthis.netlify.app/");
        //store in web element
        WebElement dropDown = driver.findElement(By.id("option"));
        //use select class
        Select select = new Select(dropDown);
        //call list, in list pass web element into it
        List<WebElement> allOptions = select.getOptions();
        for (WebElement options : allOptions) {
            System.out.println(options.getText());
            if (options.getText().equalsIgnoreCase("option 2")) //when it matches option 2 string click on it
                options.click();
        }
        System.out.println("Clicked option 2 successfully");
        driver.quit();
    }
}
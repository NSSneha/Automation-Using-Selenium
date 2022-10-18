package com.basics.SampleTests;

import com.basics.common.Setup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenshotsInSelenium {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException {
        driver = new Setup().chromeSetup(); //class_name.method_name
        driver.get("https://www.google.com");

        File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//to take complete screen's screenshot
        //to store we need another class FileUtils
        FileUtils.copyFile(screenshot1, new File("./screenshot1.png"));

        WebElement google = driver.findElement(By.cssSelector(".lnXdpd"));
        File screenshot2 = google.getScreenshotAs(OutputType.FILE);//to take screenshot of a particular part we do like this
        //to save file
        FileUtils.copyFile(screenshot2,new File("./screenshot2.png"));
        driver.quit();
    }
}

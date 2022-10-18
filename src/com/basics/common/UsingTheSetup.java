package com.basics.common;

import org.openqa.selenium.WebDriver;

public class UsingTheSetup { //an example to use the previous setup class and chrome method
    private static WebDriver driver;

    public static void main(String[] args) {
        driver = new Setup().chromeSetup(); //class_name.method_name
        driver.get("https://www.google.com/");
    }
}

package com.basics.PageObjectModel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchWebPage {
    static WebElement element = null;
    public static WebElement searchBox(WebDriver driver) {
        element = driver.findElement(By.name("q"));
        return element;
    }
    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.name("btnK"));
        return element;
    }
}

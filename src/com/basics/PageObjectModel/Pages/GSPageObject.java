package com.basics.PageObjectModel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GSPageObject {
    WebDriver driver = null;

    //This driver instance is null.
    //when we call methods we must use a different driver instance
    //From Different Tests
    //so need a constructor

    public GSPageObject(WebDriver driver) {
        this.driver = driver;
    }

    //called page factory, we inspect page and write in short way

    By searchBox = By.name("q");
    By searchButton = By.name("btnK");

    public void setSearchBox(String txt){
        driver.findElement(searchBox).sendKeys(txt);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).sendKeys(Keys.ENTER);
    }

}

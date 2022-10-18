package com.basics.MouseActionsInSelenium;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        //create actions obj
        Actions builder = new Actions(driver);
        builder.dragAndDrop(drag, drop); //pass src and target as parameters here within dragAnddrop method
        builder.build().perform();
        Thread.sleep(2000);
    }
}
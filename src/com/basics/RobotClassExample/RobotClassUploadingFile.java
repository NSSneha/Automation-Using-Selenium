package com.basics.RobotClassExample;

import com.basics.common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotClassUploadingFile {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException {
        driver = new Setup().chromeSetup();
        driver.get("https://resume.naukri.com/resume-quality-score");
        driver.findElement(By.xpath("//span[text()='Browse']")).click();
        //create object of robot class, this robot class does not belong to selenium
        //belongs to java.awt (AWT : Abstract Window Toolkit)
        Robot robot = new Robot();

        //store the path into some obj, so it can be referred as it can not be done manually
        //storing the path of the file to be uploaded
        //by using StringSelection class
        StringSelection filePath = new StringSelection("C:\\Users\\Sneha\\Desktop\\ZYSK\\Sneha_N S.pdf");

        //copying the path of the document into the Clipboard using the TOOLKIT Class
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null); //paste in clipboard and put that for use.
        //set contents 2 args we have to put(path of file, null) here null is default

        //Press the control button and V button to paste path into the address box
        robot.keyPress(KeyEvent.VK_CONTROL);//to press cntrl using robot class
        Thread.sleep(1000);

        //to press V key
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(1000);

        //Release the keys in reverse order
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        //Press and release the enter key
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //give sleep for it to progress

        Thread.sleep(12000);

        System.out.println("The file has been uploaded successfully");
    }
}
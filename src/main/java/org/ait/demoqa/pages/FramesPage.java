package org.ait.demoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframes;

    public FramesPage returnListOfFrames() {
        //1. using iframe tag
        System.out.println("The total numbers of iframes: " + iframes.size());
        //2. using java script
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOfIframes = Integer.parseInt(js.executeScript("return window.length")
                .toString());
        System.out.println("The total numbers of iframes: " + numberOfIframes);
        return this;
    }


    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;

    public FramesPage switchToIframeByIndex(int index) {
        // switch to iframe by index
        driver.switchTo().frame(index);
        System.out.println("Text of iframe: " + sampleHeading.getText());
        return this;
    }


    @FindBy(id = "frame1")
    WebElement frame1;

    @FindBy(id = "framesWrapper")
    WebElement framesWrapper;

    public FramesPage switchToIframeByID() {
        // switch to iframe by ID
        driver.switchTo().frame(frame1);
        System.out.println("Text of the iframe: " + sampleHeading.getText());
        driver.switchTo().defaultContent();
        System.out.println("Text of the iframe: " + framesWrapper.getText());
        return this;
    }
}

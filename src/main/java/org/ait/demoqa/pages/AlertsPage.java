package org.ait.demoqa.pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    ///////////////////////////////////////////////////////////////////////////////

    @FindBy(css = "#alertButton")
    WebElement alert;

    public AlertsPage clickOnAlertsButton() {
        clickWithJSExecutor(alert, 0, 300);
        return this;
    }

    public AlertsPage acceptAlert() {
        driver.switchTo().alert().accept();
        return this;
    }

    ///////////////////////////////////////////////////////////////////////////////

    @FindBy(css = "#timerAlertButton")
    WebElement alert5Sec;

    public AlertsPage clickOnAlert5SecButton() {
        clickWithJSExecutor(alert5Sec, 0, 300);
        return this;
    }

    public AlertsPage accept5SecAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent()).accept();
        } catch (NoAlertPresentException ex) {
        }
        return this;
    }

    ///////////////////////////////////////////////////////////////////////////////

    @FindBy(css = "#confirmButton")
    WebElement alertConfirmBox;

    public AlertsPage clickOnConfirmBoxButton() {
        clickWithJSExecutor(alertConfirmBox, 0, 300);
        return this;
    }

    public AlertsPage selectConfirmBox(String confirm) {
        if (confirm != null && confirm.equalsIgnoreCase("ok")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equalsIgnoreCase("cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(css = "#confirmResult")
    WebElement confirmResult;

    public AlertsPage verifyConfirmResult(String message) {
        Assert.assertTrue(shouldHaveText(confirmResult, message,5));
        return this;
    }

    ///////////////////////////////////////////////////////////////////////////////

    @FindBy(css = "#promtButton")
    WebElement promptButton;
    
    public AlertsPage clickOnPromptButton() {
        clickWithJSExecutor(promptButton, 0, 300);
        return this;
    }

    public AlertsPage enterMessageToAlert(String message) {
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
        }
        return this;
    }


    @FindBy(css = "#promptResult")
    WebElement promptResult;

    public AlertsPage verifyPromptResult(String message) {
        Assert.assertTrue(shouldHaveText(promptResult, message, 5));
        return this;
    }

}

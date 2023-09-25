package org.ait.demoqa.pages;

import org.openqa.selenium.Alert;
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

    @FindBy(id = "alertButton")
    WebElement okAlertButton;

    public AlertsPage clickOnSimpleAlertButton() {
        click(okAlertButton);
        return this;
    }

    public AlertsPage acceptAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
            wait.until(ExpectedConditions.alertIsPresent()).accept();
        } catch (NoAlertPresentException ex) {
        }
        return this;
    }


    public AlertsPage verifyTextOnAlert(String verifiableText) {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertTrue(alertText.contains(verifiableText));
        return this;
    }


    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;

    public AlertsPage clickOntimerAlertButton() {
        click(timerAlertButton);
        return this;
    }


    @FindBy(id = "confirmButton")
    WebElement confirmAlertButton;

    public AlertsPage clickOnConfirmAlertButton() {
        click(confirmAlertButton);
        return this;
    }

    public AlertsPage selectConfirm(String confirm) {
        if (confirm != null && confirm.equalsIgnoreCase("ok")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equalsIgnoreCase("cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "confirmResult")
    WebElement confirmResult;

    public AlertsPage verifyConfirmBoxResult(String message) {
        Assert.assertTrue(shouldHaveText(confirmResult, message, 5));
        return this;
    }


    @FindBy(id = "promtButton")
    WebElement promtAlertButton;

    public AlertsPage clickOnConfirmPromtAlertButton() {
        click(promtAlertButton);
        return this;
    }

    public AlertsPage enterMassageToAlert(String message) {
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
        }
        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;

    public AlertsPage verifyPromptBoxResult(String message) {
        Assert.assertTrue(shouldHaveText(promptResult, message, 5));
        return this;
    }

}

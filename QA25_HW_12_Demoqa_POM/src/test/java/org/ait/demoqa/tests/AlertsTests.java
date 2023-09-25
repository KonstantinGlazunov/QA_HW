package org.ait.demoqa.tests;

import org.ait.demoqa.pages.AlertsPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class AlertsTests extends TestBase {
    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getAlertsWindow();
        new SidePanel(driver).selectAlerts();
    }

    @Test
    public void acceptSimpleAlert() {
        new AlertsPage(driver).clickOnSimpleAlertButton()
                .verifyTextOnAlert("You clicked a button")
                .acceptAlert();
    }

    @Test
    public void acceptOkTimeAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        AlertsPage page = new AlertsPage(driver).clickOntimerAlertButton();
        wait.until(ExpectedConditions.alertIsPresent());
        page.verifyTextOnAlert("This alert appeared after 5 seconds")
                .acceptAlert();

    }

    @Test
    public void confirmalerttest() {
        new AlertsPage(driver).clickOnConfirmAlertButton()
                .selectConfirm("Cancel")
                .verifyConfirmBoxResult("You selected Cancel");
    }

    @Test
    public void sendMessageToAlertTest() {
        new AlertsPage(driver).clickOnConfirmPromtAlertButton()
                .enterMassageToAlert("My Name")
                .selectConfirm("Ok")
                .verifyPromptBoxResult("You entered My Name");
    }

}



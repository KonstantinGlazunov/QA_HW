package org.ait.theinternet.tests;

import org.ait.theinternet.pages.AlertsPage;
import org.ait.theinternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase {

    @BeforeMethod
    public void preconditions(){


        new HomePage(driver).getAlerts();
    }



    @Test
    public void acceptAlert(){
        new AlertsPage(driver).clickOnAlertButton()
                .acceptAlert()
                .verifyResult("You successfully clicked an alert");
    }

    @Test
    public void confirmalerttest(){
        new AlertsPage(driver).clickOnConfirmButton()
                .selectConfirm("Cancel")
                .verifyResult("Cancel");

    }

    @Test
    public void sendMessageToAlertTest(){
        new AlertsPage(driver).clickOnPromtButton()
                .enterMassageToAlert("Hello!")
                .acceptAlert()
                .verifyResult("Hello!");
    }
}

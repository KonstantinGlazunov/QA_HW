package org.ait.theinternet.tests;

import org.ait.theinternet.data.UserData;
import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.JSExecutor;
import org.testng.annotations.Test;

public class JSExecuterTests extends TestBase{

    @Test
    public void jsExecuterTest(){
        new HomePage(driver).getFormAuthantication();
        new JSExecutor(driver)
                .enterDataWithJSE(UserData.USER_NAME, UserData.USER_PASSWORD)
                .clickOnLoginButtonWithJSE()
                .checkURLWithJSE();

    }
}

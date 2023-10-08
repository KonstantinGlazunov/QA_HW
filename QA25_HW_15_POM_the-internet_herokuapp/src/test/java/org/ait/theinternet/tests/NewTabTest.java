package org.ait.theinternet.tests;

import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.WindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTabTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getMultipleWindows();
    }


    @Test
    public void switchToNewTabTest(){
        new WindowPage(driver).switchToNewTab(1)
                .verifyNewTitle("New Window");
    }



}

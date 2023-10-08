package org.ait.theinternet.tests.frames_sliders;


import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.frames_sliders.NestedFramesPage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getNestedFramesPage();
    }


    @Test
    public void nestedFramestest(){
        new NestedFramesPage(driver)
                .returnListOfFrames()
                .switchToIframeByName("frame-bottom");

    }

}

package org.ait.theinternet.tests.frames_sliders;

import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.frames_sliders.IFramesPage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameTests extends TestBase {


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getIFramesPage();
    }


    @Test
    public void iFrameTest() {
        new IFramesPage(driver)
                .switchToIframeById("mce_0_ifr");
    }
}

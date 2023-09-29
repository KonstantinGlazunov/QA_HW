package org.ait.theinternet.tests.frames_sliders;

import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.frames_sliders.HorizontalSliderPage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliserTests extends TestBase {


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHorizontalSliderPage();
    }

    @Test
    public void horizontalSliderTest() {
        new HorizontalSliderPage(driver).moveSliderInHorizontalDirection()
                .assertSliderValue("5");

    }

}

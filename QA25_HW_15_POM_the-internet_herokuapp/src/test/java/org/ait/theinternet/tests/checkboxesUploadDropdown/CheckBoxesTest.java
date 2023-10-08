package org.ait.theinternet.tests.checkboxesUploadDropdown;
import org.ait.theinternet.pages.checkboxesUploadDropdown.CheckboxesPage;
import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxesTest extends TestBase {

    @BeforeMethod
    public void precondition(){
            new HomePage(driver).getCheckBoxesPage();
    }


    @Test
    public void checkBoxesSwitchTest (){
       new CheckboxesPage(driver).clickCheckbox1()
                .isCheckbox1Checked();
        new CheckboxesPage(driver).clickCheckbox2()
                .isCheckbox2UnChecked();
    }

}

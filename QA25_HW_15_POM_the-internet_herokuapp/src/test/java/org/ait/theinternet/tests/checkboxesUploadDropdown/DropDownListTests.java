package org.ait.theinternet.tests.checkboxesUploadDropdown;

import org.ait.theinternet.data.CheckUploadDropData;
import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.checkboxesUploadDropdown.DropdownListPage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownListTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropdownListPage();
    }


    @Test
    public void dropDownListTest() {
        new DropdownListPage(driver).selectOption(CheckUploadDropData.OPTION);
    }
}

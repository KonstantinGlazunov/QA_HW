package org.ait.theinternet.tests.checkboxesUploadDropdown;

import org.ait.theinternet.data.CheckUploadDropData;
import org.ait.theinternet.pages.HomePage;
import org.ait.theinternet.pages.checkboxesUploadDropdown.UploadPage;
import org.ait.theinternet.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadTests extends TestBase {

    @BeforeMethod
    public void precondition (){
        new HomePage(driver).getUploadPage();
    }

    @Test
    public void uploadTest(){
new UploadPage(driver).uploadFile(CheckUploadDropData.UPLOAD_FILE_PATH)
        .upload()
        .verifySuccessResult();

    }


}

package org.ait.theinternet.pages.checkboxesUploadDropdown;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UploadPage extends BasePage {
    public UploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement chooceFileButton;

    public UploadPage uploadFile(String uploadFilePath) {
        chooceFileButton.sendKeys(uploadFilePath);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement submit;
    public UploadPage upload() {
        click(submit);
        return this;
    }
//@FindBy (xpath = "//h3[text()='File Uploaded!']")
@FindBy (tagName = "h3")
WebElement h3;
    public UploadPage verifySuccessResult() {
        Assert.assertTrue(isTextPresent(h3, "File Uploaded!"));
        return this;
    }
}

package org.ait.theinternet.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagesPage extends BasePage {
    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "img")
    List<WebElement> images;

    public BrokenImagesPage checkImages() {
        System.out.println("Total number of images on the page: " + images.size());
        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            String imageUrl = image.getAttribute("src");
            // System.out.println("Image number " + (i + 1) + " have url: " + imageUrl);
            try {
                Boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver)
                        .executeScript("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth>0);", image);
                if (imageDisplayed) {
                    System.out.println("Image " + (i + 1) + " is OK \n" + "Url: " + imageUrl
                            + "\n--------------------");
                } else {
                    System.err.println("Image " + i + 1 + " is BROKEN! \n" + "Url: " + imageUrl
                            + "\n--------------------");
                }
            } catch (Exception e) {
                System.err.println("Error occurred");
            }

        }

        return this;
    }


}

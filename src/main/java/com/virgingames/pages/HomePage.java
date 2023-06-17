package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Pardon Our Interruption')]")
    WebElement verifyPageText;

    @CacheLookup
    @FindBy(xpath = "//label[@data-qa ='accept-cookie-policy']")
    WebElement cookeiTab;


    public void acceptCookie(){
        mouseHoverToElementAndClick(cookeiTab);
        log.info("Clicking oncookie : " + cookeiTab.toString());
    }


    public void clickOnLoginTab() {
      mouseHoverToElementAndClick(loginTab);
        log.info("Clicking on login link : " + loginTab.toString());
    }

    public String getVerifyPageText(){
        return getTextFromElement(verifyPageText);
    }

}

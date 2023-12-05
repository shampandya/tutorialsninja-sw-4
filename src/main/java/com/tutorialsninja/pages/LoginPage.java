package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By returningCustomer = By.xpath("//h2[normalize-space()='Returning Customer']");
    By emailId = By.xpath("//input[@id='input-email']");
    By password = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@value='Login']");
    By myAccountText = By.xpath("//h2[normalize-space()='My Account']");


    public String getReturningCustomerText() {
        return getTextFromElement(returningCustomer);
    }

    public void enterEmailId(String value) {
        sendTextToElement(emailId, value);
    }

    public void enterPassword(String value) {
        sendTextToElement(password, value);
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }
    public String getMyAccountText(){
        return getTextFromElement(myAccountText);
    }
}

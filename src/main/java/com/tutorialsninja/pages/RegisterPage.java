package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerAccount = By.xpath("//h1[normalize-space()='Register Account']");
    By accountCreatedText = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By firstName = By.xpath("//input[@id='input-firstname']");
    By lastName = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By telephone = By.xpath("//input[@id='input-telephone']");
    By password = By.xpath("//input[@id='input-password']");
    By confirmPassword = By.xpath("//input[@id='input-confirm']");
    By agree = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By continueButton2 = By.xpath("//a[normalize-space()='Continue']");

    public String getRegisterAccountText() {
        return getTextFromElement(registerAccount);
    }

    public void enterFirstName(String firstNme) {
        sendTextToElement(firstName, firstNme);
    }

    public void enterLastName(String value) {
        sendTextToElement(lastName, value);
    }

    public void enterEmail(String value) {
        sendTextToElement(email, value);
    }

    public void enterPhoneNumber(String value) {
        sendTextToElement(telephone, value);
    }

    public void enterPassword(String value) {
        sendTextToElement(password, value);
    }

    public void enterConfirmPassword(String value) {
        sendTextToElement(confirmPassword, value);
    }


    public void selectSubscribeButton(String value) {
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }

    public void clickOnAgree() {
        clickOnElement(agree);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }
    public void clickOnContinueAfterCreation() {
        clickOnElement(continueButton2);
    }

    public String getAccountCreatedText() {
        return getTextFromElement(accountCreatedText);

    }
}

package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends Utility {

    By myAccount = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");


    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(myAccount);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(myAccount);
        }
    }
}

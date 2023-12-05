package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

    public class HomePage extends Utility {

        By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
        By desktop = By.linkText("Desktops");
        By laptopNotebooks = By.linkText("Laptops & Notebooks");
        By components = By.linkText("Components");
        By accountLogout = By.xpath("//h1[normalize-space()='Account Logout']");
        By myAccount = By.xpath("//span[contains(text(),'My Account')]");
        By myAccountAfterLogin = By.xpath("//span[@class='caret']");
        By myAccountOption = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
        By currency = By.xpath("//span[@class='hidden-xs hidden-sm hidden-md' and contains(text(), 'Currency')]");
        By pound = By.xpath("//button[@name='GBP' and contains(text(), '£Pound Sterling')]");

        public void selectMenu(String menu) {
            List<WebElement> topMenuList = getListOfElements(topMenu);
            try {
                for (WebElement element : topMenuList) {
                    if (element.getText().equalsIgnoreCase(menu)) {
                        element.click();
                    }
                }
            } catch (StaleElementReferenceException e) {
                topMenuList = getListOfElements(topMenu);
            }
        }

        public void selectMyAccountOptions(String option) {
            List<WebElement> myAccountList = getListOfElements(myAccountOption);
            try {
                for (WebElement options : myAccountList) {
                    if (options.getText().equalsIgnoreCase(option)) {
                        options.click();
                    }
                }
            } catch (StaleElementReferenceException e) {
                myAccountList = getListOfElements(myAccountOption);
            }
        }

        public void mouseHoverOnDesktop() {
            mouseHoverToElementAndClick(desktop);
        }

        public void mouseHoverAndClickOnAllShowAllDesktop(String menu) {
            selectMenu(menu);
        }

        public void mouseHoverOnLaptopsAndNotebooks() {
            mouseHoverToElementAndClick(laptopNotebooks);
        }

        public void mouseHoverOnShowAllLaptopsAndNotebooks(String menu) {
            selectMenu(menu);
        }

        public void mouseHoverOnComponents() {
            mouseHoverToElementAndClick(components);
        }

        public void clickOnShowAllComponents(String menu) {
            selectMenu(menu);
        }

        public String getAccountLogoutText() {
            return getTextFromElement(accountLogout);
        }

        public void clickOnMyAccountLink() {
            clickOnElement(myAccount);
        }

        public void clickOnMyAccountAfterLogin() {
            clickOnElement(myAccountAfterLogin);
        }

        public void mouseHoverOnCurrencyDropDown() {
            mouseHoverToElementAndClick(currency);
        }

        public void mouseHoverAndClickOnPoundSterling() {
            mouseHoverToElementAndClick(pound);
        }
    }


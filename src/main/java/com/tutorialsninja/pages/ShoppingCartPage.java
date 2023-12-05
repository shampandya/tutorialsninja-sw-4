package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By productName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDateText = By.xpath("//small[normalize-space()='Delivery Date:2023-11-27']");
    By modelText = By.xpath("//td[normalize-space()='Product 21']");
    By totalText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By macBookText = By.xpath("(//a[contains(text(),'MacBook')])[2]");
    By quantity = By.xpath("//input[contains(@name,'quantity')]");
    By updateButton = By.xpath("//i[@class='fa fa-refresh']");
    By successText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By priceText = By.xpath("(//td[@class='text-right'][normalize-space()='$122.00'])[4]");
    By mackBookPriceText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkOut = By.xpath("//a[@class='btn btn-primary']");


    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public String getProductName() {
        return getTextFromElement(productName);
    }

    public String getDeliveryDateText() {
        return getTextFromElement(deliveryDateText);
    }

    public String getModelText() {
        return getTextFromElement(modelText);
    }

    public String getTotalText() {
        return getTextFromElement(totalText);
    }

    public String getMacBookText() {
        return getTextFromElement(macBookText);
    }

    public void updateQuantity(String value) {
        driver.findElement(quantity).clear();
        sendTextToElement(quantity, value);
    }

    public void clickOnUpdateButton() {
        clickOnElement(updateButton);
    }

    public String getSuccessText() {
        return getTextFromElement(successText);
    }

    public String getMackBookPriceText() {
        return getTextFromElement(mackBookPriceText);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOut);

    }
}

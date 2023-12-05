package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");
    By product = By.xpath("//h4/a");
    By NameAToZ = By.xpath("//select[@id='input-sort']");
    By HPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");


    public String getDeskTopText() {
        return getTextFromElement(desktopText);
    }

    public void sortByNameAToZ(String text) {
        selectByVisibleTextFromDropDown(NameAToZ, text);
    }

    public ArrayList<String> getProductList() {
        List<WebElement> originalProductsName = driver.findElements(product);
        ArrayList<String> originalProductsName1 = new ArrayList<>();
        for (WebElement e : originalProductsName) {
            originalProductsName1.add(e.getText());
        }
        Collections.sort(originalProductsName1);
        Collections.reverse(originalProductsName1);
        return originalProductsName1;
    }

    public ArrayList<String> getProductList1() {
        List<WebElement> afterFilterProductList = driver.findElements(product);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement e : afterFilterProductList) {
            afterFilterProductList1.add(e.getText());
        }
        Collections.sort(afterFilterProductList1);
        Collections.reverse(afterFilterProductList1);
        return afterFilterProductList1;
    }

    public void clickOnHPLP3065(){
        clickOnElement(HPLP3065);
    }
}

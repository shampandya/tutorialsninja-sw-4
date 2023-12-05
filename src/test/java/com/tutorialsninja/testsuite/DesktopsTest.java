package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.Product_HPLP3065;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    Product_HPLP3065 product = new Product_HPLP3065();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        //1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverOnDesktop();
        //1.2 Click on “Show All Desktops”
        homePage.mouseHoverAndClickOnAllShowAllDesktop("Show AllDesktops");
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.sortByNameAToZ("Name (Z - A)");
        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(desktopPage.getProductList(), desktopPage.getProductList1());
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Mouse hover on Currency Dropdown and click
        homePage.mouseHoverOnCurrencyDropDown();
        //2.2 Mouse hover on £Pound Sterling and click
        homePage.mouseHoverAndClickOnPoundSterling();
        //2.3 Mouse hover on Desktops Tab.
        homePage.mouseHoverOnDesktop();
        //2.4 Click on “Show All Desktops”
        homePage.mouseHoverAndClickOnAllShowAllDesktop("Show AllDesktops");
        //2.5 Select Sort By position "Name: A to Z"
        desktopPage.sortByNameAToZ("Name (A - Z)");
        //2.6 Select product “HP LP3065”
        desktopPage.clickOnHPLP3065();
        //2.7 Verify the Text "HP LP3065"
        Assert.assertEquals(product.getTextFromHPLP3065(), "HP LP3065");
        //2.8 Select Delivery Date "2023-11-27"
        product.selectDate();
        //2.10 Click on “Add to Cart” button
        product.clickOnAddToCart();

        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!\n";
        String actualMessage = product.getSuccessFullText();
        String[] actualMsg = actualMessage.split("×");
        Assert.assertEquals(expectedMessage, actualMsg[0]);

        Thread.sleep(2000);
        //2.12 Click on link “shopping cart” display into success message
        product.clickOnShoppingCartLink();

        //2.13 Verify the text "Shopping Cart"
        expectedMessage = "Shopping Cart  (1.00kg)";
        actualMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(expectedMessage, actualMessage);

        //2.14 Verify the Product name "HP LP3065"
        expectedMessage = "HP LP3065";
        actualMessage = shoppingCartPage.getProductName();
        Assert.assertEquals(expectedMessage, actualMessage);

        //2.15 Verify the Delivery Date "2023-11-27"
        expectedMessage = "Delivery Date:2023-11-27";
        actualMessage = shoppingCartPage.getDeliveryDateText();
        Assert.assertEquals(expectedMessage, actualMessage);

        //2.16 Verify the Model "Product21"
        expectedMessage = "Product 21";
        actualMessage = shoppingCartPage.getModelText();
        Assert.assertEquals(expectedMessage, actualMessage);
        Thread.sleep(3000);

        //2.17 Verify the Todat "£74.73"
        expectedMessage = "£74.73";
        actualMessage = shoppingCartPage.getTotalText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}

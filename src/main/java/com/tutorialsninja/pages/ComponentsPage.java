package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {

    By component = By.xpath("//h2[contains(text(),'Components')]");

    public String getComponentText() {
        return getTextFromElement(component);

    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCardPage extends Utility {

    By msg = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By termsOfService = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");

    public String checkMsg() {
        return getTextFromElement(msg);
    }

    public void clickOnTermsOfService() {
        clickOnElement(termsOfService);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }


}

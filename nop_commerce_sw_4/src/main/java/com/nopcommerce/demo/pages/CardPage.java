package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class CardPage extends Utility {
    By totalValue = By.xpath("//span[@class='value-summary']//strong");
    By termsAccept = By.id("termsofservice");
    By checkOut = By.id("checkout");


    public String checkTotalValueOfCard() {
        return getTextFromElement(totalValue);
    }

    public void clickOnTermsAccept() {
        clickOnElement(termsAccept);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOut);
    }



}

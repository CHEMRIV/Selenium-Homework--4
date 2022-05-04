package com.x_cart.mobile.Pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellerSecureCheckOut extends Utility {
    By msgVerify = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/h1");
    By firstname = By.id("shippingaddress-firstname");
    By lastname = By.id("shippingaddress-lastname");
    By street = By.id("shippingaddress-street");
    By customState = By.id("shippingaddress-custom-state");
    By clickOnBox = By.xpath("//input[@id='create_profile']");
    By password1 = By.id("password");
    By localShipping = By.xpath("//label[@title='Local shipping']//input");
    By cod = By.xpath("//input[@id='pmethod6']");
    By placeOrder = By.xpath("//div[@class='button-row']//button[@type='submit']");
    By thankYou=By.id("page-title");


    public String msgVerify() {
        return getTextFromElement(msgVerify);
    }

    public void firstName(String nameField1) {
        sendTextToElement(firstname, nameField1);
    }

    public void lastname(String nameField2) {
        sendTextToElement(lastname, nameField2);
    }

    public void streetField(String streetField) {
        sendTextToElement(street, streetField);
    }

    public void customState(String state) {
        sendTextToElement(customState, state);
    }

    public void clickOnBox() {
        clickOnElement(clickOnBox);
    }

    public void enterPassword(String password) {
        sendTextToElement(password1, password);
    }

    public void clickOnLocalShipping() {
        clickOnElement(localShipping);
    }

    public void clickOnCod() {
        clickOnElement(cod);
    }

    public void clickOnPlaceOrder() {
        clickOnElement(placeOrder);
    }
    public String verifyThankYou() {
        return getTextFromElement(thankYou);
    }


}

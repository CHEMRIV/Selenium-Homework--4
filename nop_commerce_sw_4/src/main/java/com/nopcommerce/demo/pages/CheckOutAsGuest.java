package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutAsGuest extends Utility {
    By checkOtAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By country = By.name("BillingNewAddress.CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1 = By.id("BillingNewAddress_Address1");
    By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void clickOnCheckOtAsGuest() {
        clickOnElement(checkOtAsGuest);
    }

    public void addCountry(String value) {
        selectByVisibleTextFromDropDown(country, value);
    }

    public void addCity(String city1) {
        sendTextToElement(city, city1);
    }

    public void addAddress(String add) {
        sendTextToElement(address1, add);
    }

    public void addZipCode(String zip) {
        sendTextToElement(zipCode, zip);
    }

    public void addPhoneNumber(String phoneNum) {
        sendTextToElement(phoneNumber, phoneNum);
    }

}

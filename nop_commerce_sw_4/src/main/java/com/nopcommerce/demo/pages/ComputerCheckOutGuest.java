package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerCheckOutGuest extends Utility {
    By welcome=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOtAsGuest=By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By firstName=By.id("BillingNewAddress_FirstName");
    By lastName=By.id("BillingNewAddress_LastName");
    By email=By.id("BillingNewAddress_Email");
    By country =By.name("BillingNewAddress.CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1=By.id("BillingNewAddress_Address1");
    By zipCode=By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber=By.id("BillingNewAddress_PhoneNumber");
    By clickContinue=By.xpath("//div[@id='billing-buttons-container']//button[4]");








    public String VerifyWelcome(){
        return getTextFromElement(welcome);
    }
    public void clickOnCheckOtAsGuest() {
        clickOnElement(checkOtAsGuest);
    }
    public void addFirstName(String firstNameInput) {
        sendTextToElement(firstName, firstNameInput);
    }
    public void addLastName(String lastNameInput) {
        sendTextToElement(lastName, lastNameInput);
    }
    public void addEmail(String emailId) {
        sendTextToElement(email, emailId);}

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
    public void clickOnContinue(){
        clickOnElement(clickContinue);
    }
}

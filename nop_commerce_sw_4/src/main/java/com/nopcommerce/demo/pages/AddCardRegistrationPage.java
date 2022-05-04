package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class AddCardRegistrationPage extends Utility {
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By register = By.id("register-button");


    public void addFirstname(String ftName) {
        sendTextToElement(firstName,ftName);
    }
    public void addLastName(String ltName) {
        sendTextToElement(lastName,ltName);
    }
    public void addEmailId(String emailId) {
        sendTextToElement(email,emailId);
    }
    public void addPassword(String password1) {
        sendTextToElement(password,password1);
    }
    public void addConfirmPassword(String ConfPassword) {
        sendTextToElement(ConfirmPassword,ConfPassword);
    }
    public void ClickOnRegister() {
        clickOnElement(register);
    }
}

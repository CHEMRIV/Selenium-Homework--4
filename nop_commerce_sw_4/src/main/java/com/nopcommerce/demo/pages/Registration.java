package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Registration extends Utility {

    By registerText = By.linkText("Register");
    By genderButton = By.id("gender-male");
    By firstNameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@name='LastName']");
    By dateOfBirth_Day = By.xpath("//select[@name='DateOfBirthDay']");
    By getDateOfBirth_Month = By.xpath("//select[@name='DateOfBirthMonth']");
    By getDateOfBirth_Year = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField= By.id("Email");
    By passwordField =By.id("Password");
    By confirmPasswordField =By.id("ConfirmPassword");
    By registerButton=By.id("register-button");



    public String getRegisterText() {
        return getTextFromElement(registerText);
    }
    public void clickOnGenderButton(){
        clickOnElement(genderButton);
    }
    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
    }
    public void enterLastName(String LastName){
        sendTextToElement(lastNameField,LastName);
    }
    public void dateOfBirthDay(String day){
        sendTextToElement(dateOfBirth_Day,day);
    }
    public void dateOfBirthMonth(String month){
        sendTextToElement(getDateOfBirth_Month,month);
    }
    public void dateOfBirth_Year(String year){
        sendTextToElement(getDateOfBirth_Year, year);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }





}

package com.herokuapp.theinternet.pages;

import com.herokuapp.theinternet.utility.Utility;
import org.openqa.selenium.By;

public class LogInPage extends Utility {
    By logIn = By.id("username");
    By passwordField = By.id("password");
    By signIn = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
    By errorMsg=By.xpath("//div[@id='flash']");
    By getErrorMsg=By.xpath("//div[@id='flash']");

    public void enterLogINName(String name){
        sendTextToElement(logIn,name);
    }

    public void enterLogINPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickONSignIn(){
        clickOnElement(signIn);
    }
    public String verifyErrorMsg(){
        return getTextFromElement(errorMsg);
    }
    public String getErrorMsg(){
        return getTextFromElement(getErrorMsg);
    }
}

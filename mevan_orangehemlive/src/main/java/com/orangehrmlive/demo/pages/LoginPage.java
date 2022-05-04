package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By forgotPassword = By.xpath("//a[contains(text(),'Forgot your password?')]");
    By verifyText = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");
    By name = By.id("txtUsername");
    By password = By.name("txtPassword");
    By click = By.xpath("//input[@id='btnLogin']");

    public void clickOnForgotPassword() {
        clickOnElement(forgotPassword);
    }

    public String verifyTextMsg() {
        return getTextFromElement(verifyText);
    }
    public void enterUserName(String userName) {
        sendTextToElement(name,userName);
    }
    public void enterUserPassword(String userPassword) {
        sendTextToElement(password,userPassword);
    }
    public void clickOnLogInButton(){
        clickOnElement(click);
    }

}



package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By msg = By.xpath("//h1[@class='page__heading']");
    By name = By.id("user[email]");
    By password = By.id("user[password]");
    By logIn = By.xpath("//input[@class='button button-primary g-recaptcha']");
    By errorMsg =By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public String verifyMsg() {
        return getTextFromElement(msg);

    }
    public void userName(String userName){
        sendTextToElement(name,userName);
    }
    public void userPassword(String userPassword){
        sendTextToElement(password,userPassword);
    }

    public void clickOnLogInButton() {
        clickOnElement(logIn);
    }
    public String errorMsg(){
        return getTextFromElement(errorMsg);
    }


}

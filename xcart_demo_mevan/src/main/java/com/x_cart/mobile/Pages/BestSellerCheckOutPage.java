package com.x_cart.mobile.Pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellerCheckOutPage extends Utility {
    By verifyMsg = By.id("page-title");
    By checkOut = By.xpath("//span[text()='Go to checkout']");
    By verifyLogin = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By email = By.id("email");
    By clickContinue = By.xpath("//span[contains(text(),'Continue')]");




    public String verifyMsg() {
        return getTextFromElement(verifyMsg);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }

    public String verifyLoginMassage() {
        return getTextFromElement(verifyLogin);
    }

    public void fillEmailId(String emailId) {
        sendTextToElement(email, emailId);

    }

    public void clickContinue() {
        clickOnElement(clickContinue);
    }


}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutsByRegister extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By register= By.xpath("//button[contains(text(),'Register')]");

    public String checkWelComeText(){
        return getTextFromElement(welcomeText);
    }
    public void clickOnRegister(){
        clickOnElement(register);
    }

}

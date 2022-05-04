package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationConformed extends Utility {


    By regMassage= By.xpath("//div[@class='result']");
    By continueButton=By.xpath("//a[contains(text(),'Continue')]");

    public String checkRegMassage(){
        return getTextFromElement(regMassage);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}

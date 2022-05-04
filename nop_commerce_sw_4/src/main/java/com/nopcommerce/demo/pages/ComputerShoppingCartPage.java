package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerShoppingCartPage extends Utility {
    By shoppingCard = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By verityTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By iAgree = By.xpath("//input[@id='termsofservice']");
    By checkOutProduct=By.xpath("//button[@id='checkout']");




    public String verifyShoppingCardText(){
        return getTextFromElement(shoppingCard);
    }
    public String verityTotal (){
        return getTextFromElement(verityTotal );
    }
    public void clickOnIAgree(){
        clickOnElement(iAgree);
    }
    public void checkOutProduct(){
        clickOnElement(checkOutProduct);
    }


}

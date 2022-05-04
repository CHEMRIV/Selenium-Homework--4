package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class FinalProductVerification extends Utility {
    By order =By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continue3= By.xpath("//button[contains(text(),'Continue')]");


    public String verifyConformMsg(){
        return getTextFromElement(order);

    }
    public void continue3(){
        clickOnElement(continue3);
    }
}

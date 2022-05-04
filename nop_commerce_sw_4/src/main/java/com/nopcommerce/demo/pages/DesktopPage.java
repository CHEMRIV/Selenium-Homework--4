package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By sortBy = By.id("products-orderby");
    By lowToHigh=By.xpath("//option[contains(text(),'Price: Low to High')]");
    By addProduct=By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");



    public void sortBy() {
        clickOnElement(sortBy);
    }
    public void selectLowToHigh(){
        clickOnElement(lowToHigh);
    }
    public void addToCard(){
        clickOnElement(addProduct);
    }




}

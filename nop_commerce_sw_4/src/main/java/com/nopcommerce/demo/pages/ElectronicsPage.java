package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class ElectronicsPage extends Utility {

    By cellPhone=By.linkText("Cell phones");
    By getCellPhoneText=By.xpath("//h1[contains(text(),'Cell phones')]");
    By listButton=By.xpath("//a[contains(text(),'List')]");
    By nokiaProduct=By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");






    public void selectCellPhoneFromDropDown(){
        clickOnMouseHoverOnElement(cellPhone);
    }
    public String verifyGetCellPhoneText(){
        return getTextFromElement(getCellPhoneText);

    }
    public void clickOnListViewButton(){
        clickOnElement(listButton);
    }
    public void clickOnNokiaLumiaProduct(){
        clickOnElement(nokiaProduct);
    }







}

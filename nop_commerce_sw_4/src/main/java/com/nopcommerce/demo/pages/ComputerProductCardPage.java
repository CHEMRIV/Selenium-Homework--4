package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerProductCardPage extends Utility {

    By massageCorrection = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.xpath("//dd[@id='product_attribute_input_1']//select");
    By selectClass = By.xpath("//dd[@id='product_attribute_input_2']//select");
    By hDDRadioButton = By.xpath("//input[@id='product_attribute_3_7']");
    By vistaPremium = By.xpath("//input[@id='product_attribute_4_9']");
    By totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyText = By.cssSelector("#price-value-1");
    By addToCard = By.xpath("//button[@id='add-to-cart-button-1']");
    By massageVerify=By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By massageClose=By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCard = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCard = By.xpath("//button[contains(text(),'Go to cart')]");


    public String setMassageCorrectionTest() {
        return getTextFromElement(massageCorrection);
    }

    public void selectProcessor() {
        selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectClass() {
        selectByVisibleTextFromDropDown(selectClass, "8GB [+$60.00]");
    }

    public void clickOnHDDRadioButton() {
        clickOnElement(hDDRadioButton);
    }

    public void clickOnVistaPremium() {
        clickOnElement(vistaPremium);
    }

    public void clickOnTotalCommander() {
        clickOnElement(totalCommander);
    }

    public String verifyText() {
        return getTextFromElement(verifyText);
    }

    public void addToCard() {
        clickOnElement(addToCard);
    }
    public String verifyMassage() {
        return getTextFromElement(massageVerify);
    }
    public void massageClose(){
        clickOnElement(massageClose);
    }
    public void goToShoppingCard() {
        mouseHoverOnElement(shoppingCard);
    }

    public void goToCard() {
        clickOnElement(goToCard);
    }
}

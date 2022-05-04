package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopManuNavigation extends Utility {

    By computerText = By.xpath("//h1[contains(text(),'Computers')]");
    By electronicsText =By.xpath("//h1[contains(text(),'Electronics')]");
    By apparelText = By.xpath("//h1[contains(text(),'Apparel')]");
    By digitalDownloadsText = By.xpath("//h1[contains(text(),'Digital downloads')]");
    By booksTabOnText = By.xpath("//h1[contains(text(),'Books')]");
    By jewelryTabText = By.xpath("//h1[contains(text(),'Jewelry')]");
    By giftCardsText = By.xpath("//h1[contains(text(),'Gift Cards')]");

    public String verifyComputerText(){
        return getTextFromElement(computerText);
    }
    public String verifyElectronicsText(){
        return getTextFromElement(electronicsText);
    }
    public String verifyApparelText(){
        return getTextFromElement(apparelText);
    }
    public String verifyDigitalDownloadsText(){
        return getTextFromElement(digitalDownloadsText);
    }
    public String verifyBooksTabOnText(){
        return getTextFromElement(booksTabOnText);
    }
    public String verifyJewelryTabText(){
        return getTextFromElement(jewelryTabText);
    }
    public String verifyGiftCardsText(){
        return getTextFromElement(giftCardsText);
    }



}

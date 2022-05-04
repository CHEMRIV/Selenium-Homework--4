package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By computerTab = By.linkText("Computers");
    By electronicsTab = By.linkText("Electronics");
    By apparelTab = By.linkText("Apparel");
    By digitalDownloadsTab = By.linkText("Digital downloads");
    By booksTabOnTab = By.linkText("Books");
    By jewelryTab = By.linkText("Jewelry");
    By giftCardsTab = By.linkText("Gift Cards");
    By logInLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By verifyWelcomeMsg=By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void clickOnComputerTab() {
        clickOnElement(computerTab);
    }

    public void clickOnElectronicsTab() {
        clickOnElement(electronicsTab);
    }

    public void clickOnApparelTab() {
        clickOnElement(apparelTab);
    }

    public void clickOnDigitalDownloadsTab() {
        clickOnElement(digitalDownloadsTab);
    }

    public void clickOnBooksTabOnTab() {
        clickOnElement(booksTabOnTab);
    }

    public void clickOnJewelryTab() {
        clickOnElement(jewelryTab);
    }

    public void clickOnGiftCardsTab() {
        clickOnElement(giftCardsTab);
    }

    public void clickOnLogInLink() {
        clickOnElement(logInLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void mouseHowerOnElectronics() {
        mouseHoverOnElement(electronicsTab);

    }
    public String welcomeStore(){
        return getTextFromElement(verifyWelcomeMsg);

    }


}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerCheckOutFinal extends Utility {

    By nextDayAir = By.xpath("//div[@class='method-name']//label[@for='shippingoption_1']");
    By clickOnContinue1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By selectCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    By selectCardWithContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By selectCreditCardWithMasterCard = By.xpath("//select[@id='CreditCardType']");
    By cardholderName=By.id("CardholderName");
    By cardNumber=By.id("CardNumber");
    By expirationMonth=By.id("ExpireMonth");
    By expirationYear=By.id("ExpireYear");
    By cardCode=By.id("CardCode");
    By detailContinue=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By conformed=By.xpath("//button[contains(text(),'Confirm')]");


    public void selectNextDayAir() {
        clickOnElement(nextDayAir);
    }

    public void clickOnContinue1() {
        clickOnElement(clickOnContinue1);
    }
    //////////////////////////////////
    public void selectCreditCard() {
        clickOnElement(selectCreditCard);
    }
    public void selectCardWithContinue() {
        clickOnElement(selectCardWithContinue);
    }
    public void selectCreditCardWithMasterCard(String masterCard) {
        sendTextToElement(selectCreditCardWithMasterCard, masterCard);
    }
    public void addCardholderName(String name) {
        sendTextToElement(cardholderName, name);
    }
    public void addCardNumber(String number) {
        sendTextToElement(cardNumber, number);
    }
    public void addExpirationMonth(String expMonth) {
        sendTextToElement(expirationMonth, expMonth);
    }
    public void addExpirationYear(String expYr) {
        sendTextToElement(expirationYear, expYr);
    }
    public void addCardCode(String cardCode1) {
        sendTextToElement(cardCode, cardCode1);
    }
    public void clickOnDetailContinue() {
        clickOnElement(detailContinue);

    }
    public void finalConformed(){
        clickOnElement(conformed);
    }

}

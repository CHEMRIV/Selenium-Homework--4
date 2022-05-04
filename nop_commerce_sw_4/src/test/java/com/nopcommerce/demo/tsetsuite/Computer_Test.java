package com.nopcommerce.demo.tsetsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Computer_Test extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    ComputerProductCardPage computerProductCardPage = new ComputerProductCardPage();
    ComputerShoppingCartPage computerShoppingCartPage =new ComputerShoppingCartPage();
    ComputerCheckOutGuest computerCheckOutGuest =new ComputerCheckOutGuest();
    ComputerCheckOutFinal computerCheckOutFinal=new ComputerCheckOutFinal();
    FinalProductVerification finalProductVerification=new FinalProductVerification();


    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws ElementClickInterceptedException, InterruptedException, NoSuchElementException {
        homePage.clickOnComputerTab();
        computerPage.clickOnDesktop();
        desktopPage.sortBy();
        desktopPage.selectLowToHigh();
        Thread.sleep(2000);
        desktopPage.addToCard();
        String expectedMsg = "Build your own computer";
        String actualMsg = computerProductCardPage.setMassageCorrectionTest();
        Assert.assertEquals(actualMsg, expectedMsg, "Not match Found");
        Thread.sleep(2000);
        computerProductCardPage.selectProcessor();
        computerProductCardPage.selectClass();
        computerProductCardPage.clickOnHDDRadioButton();
        computerProductCardPage.clickOnVistaPremium();
        computerProductCardPage.clickOnTotalCommander();
        Thread.sleep(2000);
        String expectedPrice = "$1,475.00";
        String actualPrice = computerProductCardPage.verifyText();
        Assert.assertEquals(actualPrice, expectedPrice, "Not match Found");
        computerProductCardPage.addToCard();
        Thread.sleep(2000);
        computerProductCardPage.addToCard();
        Thread.sleep(2000);
        String expectedMsg1 = "The product has been added to your shopping cart";
        String actualMsg1 = computerProductCardPage.verifyMassage();
        Assert.assertEquals(actualMsg1, expectedMsg1, "Not match Found");
        computerProductCardPage.massageClose();
        computerProductCardPage.goToShoppingCard();
        Thread.sleep(2000);
        computerProductCardPage.goToCard();
        String expectedResult="Shopping cart";
        String actualResult = computerShoppingCartPage.verifyShoppingCardText();
        Assert.assertEquals(actualResult, expectedResult, "Not match Found");
        String expectedPr="$2,950.00";
        String actualPr = computerShoppingCartPage.verityTotal();
        Assert.assertEquals(actualPr, expectedPr, "Not match Found");
        computerShoppingCartPage.clickOnIAgree();
        computerShoppingCartPage.checkOutProduct();
        String expectedSignInMsg="Welcome, Please Sign In!";
        String actualSignInMsg =computerCheckOutGuest.VerifyWelcome();
        Assert.assertEquals(actualSignInMsg, expectedSignInMsg, "Not match Found");
        computerCheckOutGuest.clickOnCheckOtAsGuest();
        computerCheckOutGuest.addFirstName("Bria");
        computerCheckOutGuest.addLastName("Shah");
        computerCheckOutGuest.addEmail("brta123@gmail.com");
        computerCheckOutGuest.addCountry("United Kingdom");
        computerCheckOutGuest.addCity("London");
        computerCheckOutGuest.addAddress("150,Elton park");
        computerCheckOutGuest.addZipCode("WD456NW");
        computerCheckOutGuest.addPhoneNumber("7772568945");
        computerCheckOutGuest.clickOnContinue();
        computerCheckOutFinal.selectNextDayAir();
        computerCheckOutFinal.clickOnContinue1();
        computerCheckOutFinal.selectCreditCard();
        computerCheckOutFinal.selectCardWithContinue();
        computerCheckOutFinal.selectCreditCardWithMasterCard("Master card");
        computerCheckOutFinal.addCardholderName("Raju Patel");
        computerCheckOutFinal.addCardNumber("5425233430109903");
        computerCheckOutFinal.addExpirationMonth("08");
        computerCheckOutFinal.addExpirationYear("2025");
        computerCheckOutFinal.addCardCode("458");
        computerCheckOutFinal.clickOnDetailContinue();
        computerCheckOutFinal.finalConformed();
        String expectedOrderMsg="Your order has been successfully processed!";
        String actualOrderMsg =finalProductVerification.verifyConformMsg() ;
        Assert.assertEquals(actualOrderMsg,expectedOrderMsg, "Not match Found");
        finalProductVerification.continue3();
        String expectedMsg2="Welcome to our store";
        String actualMsg2 =homePage.welcomeStore();
        Assert.assertEquals(actualMsg2, expectedMsg2, "Not match Found");
















        }


}

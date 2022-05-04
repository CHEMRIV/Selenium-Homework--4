package com.nopcommerce.demo.tsetsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest_ProductPurchase extends TestBase {

    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    NokiaProductPage nokiaProductPage = new NokiaProductPage();
    CardPage cardPage = new CardPage();
    CheckOutsByRegister checkOutsByRegister=new CheckOutsByRegister();
    AddCardRegistrationPage addCardRegistrationPage =new AddCardRegistrationPage();
    RegistrationConformed registrationConformed = new RegistrationConformed();
    ShoppingCardPage shoppingCardPage=new ShoppingCardPage();
    CheckOutAsGuest checkOutAsGuest = new CheckOutAsGuest();
    ComputerCheckOutGuest computerCheckOutGuest=new ComputerCheckOutGuest();

    @Test
    public void textVerify() {
        homePage.mouseHowerOnElectronics();
        electronicsPage.selectCellPhoneFromDropDown();
        String expectedText = "Cell phones";
        String actualText = electronicsPage.verifyGetCellPhoneText();
        Assert.assertEquals(actualText, expectedText, "No match Found");

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException, ElementNotInteractableException {
        homePage.mouseHowerOnElectronics();
        electronicsPage.selectCellPhoneFromDropDown();
        electronicsPage.clickOnListViewButton();
        Thread.sleep(2000);
        electronicsPage.clickOnNokiaLumiaProduct();
        String expectedText = "Nokia Lumia 1020";
        String actualText = nokiaProductPage.verifyTextNokiaLumiaProduct();
        Assert.assertEquals(expectedText, actualText, "Not match found");
        String expectedPrice = "$349.00";
        String actualPrice = nokiaProductPage.verifyProductPrice();
        Assert.assertEquals(expectedText, actualText, "Not match found");
        nokiaProductPage.addToCardProduct();
        Thread.sleep(2000);
        nokiaProductPage.addToCardProduct();
        String expectedMessage = "The product has been added to your shopping cart";
        String actualTextMessage = nokiaProductPage.verifyTextMassage();
        Assert.assertEquals(expectedText, actualText, "Not match found");
        Thread.sleep(2000);
        nokiaProductPage.closeMessage();
        nokiaProductPage.goToShoppingCard();
        Thread.sleep(1000);
        nokiaProductPage.goToCard();
        String expectedFinalPrice = "$698.00";
        String actualFinalPrice = cardPage.checkTotalValueOfCard();
        Assert.assertEquals(expectedFinalPrice, actualFinalPrice, "Not match found");
        cardPage.clickOnTermsAccept();
        cardPage.clickOnCheckOutButton();
        String expectedMassage="Welcome, Please Sign In!";
        String actualMassage = checkOutsByRegister.checkWelComeText();
        Assert.assertEquals(actualMassage,expectedMassage,"Not match Found");
        checkOutsByRegister.clickOnRegister();
        addCardRegistrationPage.addFirstname("jjhk");
        addCardRegistrationPage.addLastName("Patel");
        addCardRegistrationPage.addEmailId("bfnjj123@gmail.com");
        addCardRegistrationPage.addPassword("123456");
        addCardRegistrationPage.addConfirmPassword("123456");
        addCardRegistrationPage.ClickOnRegister();
         String expectedRegisterMsg="Your registration completed";
        String actualRegisterMsg=registrationConformed.checkRegMassage();
        Assert.assertEquals(expectedRegisterMsg,actualRegisterMsg,"Not match Found");
        Thread.sleep(2000);
        registrationConformed.clickOnContinueButton();
        String expectedShMsg1="Shopping cart";
        String actualRegisterMsg1=shoppingCardPage.checkMsg();
        Assert.assertEquals(actualRegisterMsg1,expectedShMsg1,"Not match Found");
        shoppingCardPage.clickOnTermsOfService();
        shoppingCardPage.clickOnCheckOut();
        Thread.sleep(2000);
        computerCheckOutGuest.clickOnCheckOtAsGuest();
        computerCheckOutGuest.addCountry("United Kingdom");
        computerCheckOutGuest.addCity("London");
        checkOutAsGuest.addAddress("156,eltorn park");
        checkOutAsGuest.addZipCode("WD156NW");
        checkOutAsGuest.addPhoneNumber("7778595632");





    }

}

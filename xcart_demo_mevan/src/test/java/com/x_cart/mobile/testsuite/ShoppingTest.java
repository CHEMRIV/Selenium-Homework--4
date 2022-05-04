package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.Pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {

    HomePage homePage = new HomePage();
    BestSellerPage bestSellerPage = new BestSellerPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    BestSellerCheckOutPage bestSellerCheckOutPage = new BestSellerCheckOutPage();
    BestSellerSecureCheckOut bestSellerSecureCheckOut =new BestSellerSecureCheckOut();


    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForVinylIdolzGhostbusters() throws InterruptedException {
        homePage.moveOnHotDealsButton();
        bestSellerPage.clickOnBestSellertTab();
        bestSellerPage.verifyTextBestSeller();
        shoppingPage.clickOnSortBy();
        shoppingPage.clickOnSortByAToZ();
        shoppingPage.selectProduct();
        shoppingPage.clickOnSelectedProduct();
        Thread.sleep(2000);
        String actualMsg = "Product has been added to your cart";
        String expectedMsg = shoppingPage.verifyMsg();
        Assert.assertEquals(actualMsg, expectedMsg, "No Match Found");
        shoppingPage.closeMsg();
        shoppingPage.goToYourCard();
        shoppingPage.goToViewCard();
        String expectedMsg1 = "Your shopping cart - 1 item";
        String actualMsg1 = bestSellerCheckOutPage.verifyMsg();
        Assert.assertEquals(actualMsg1, expectedMsg1, "No Match Found");
        bestSellerCheckOutPage.clickOnCheckOut();
        String expectedMsg2 = "Log in to your account";
        String actualMsg2 = bestSellerCheckOutPage.verifyLoginMassage();
        Assert.assertEquals(actualMsg2, expectedMsg2, "No Match Found");
        bestSellerCheckOutPage.fillEmailId("xyzrtf123@gmail.com");
        bestSellerCheckOutPage.clickContinue();
        String expectedMsg3 = "Secure Checkout";
        String actualMsg3 = bestSellerSecureCheckOut.msgVerify();
        Assert.assertEquals(actualMsg3, expectedMsg3, "No Match Found");
        bestSellerSecureCheckOut.firstName("Rahul");
        bestSellerSecureCheckOut.lastname("Shah");
        bestSellerSecureCheckOut.streetField("gojklf bhkk");
        bestSellerSecureCheckOut.customState("khkk kjdkj");
        bestSellerSecureCheckOut.clickOnBox();
        bestSellerSecureCheckOut.enterPassword("Nik@1233");
        bestSellerSecureCheckOut.clickOnLocalShipping();
        Thread.sleep(2000);
        bestSellerSecureCheckOut.clickOnCod();
        bestSellerSecureCheckOut.clickOnPlaceOrder();
        Thread.sleep(2000);
        String expectedMsg4 = "Thank you for your order";
        String actualMsg4 = bestSellerSecureCheckOut.verifyThankYou();
        Assert.assertEquals(actualMsg4, expectedMsg4, "No Match Found");



    }


}

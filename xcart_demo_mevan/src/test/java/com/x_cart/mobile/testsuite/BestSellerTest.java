package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.Pages.BestSellerPage;
import com.x_cart.mobile.Pages.HomePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BestSellerTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellerPage bestSellerPage = new BestSellerPage();

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        homePage.moveOnHotDealsButton();
        bestSellerPage.clickOnBestSellertTab();
        bestSellerPage.verifyTextBestSeller();
        String expectedProductItem = "8";
        String actualProductItem = String.valueOf(bestSellerPage.verifyTotalProductOnSinglePage());
        Assert.assertEquals(actualProductItem,expectedProductItem,"Not match found");

    }


}

package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.Pages.HomePage;
import com.x_cart.mobile.Pages.HotDealsPage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {

    HomePage homePage = new HomePage();
    HotDealsPage hotDealsPage = new HotDealsPage();

    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        homePage.moveOnHotDealsButton();
        hotDealsPage.clickOnSale();
        String actualMsg = "Sale";
        String expectedMsg = hotDealsPage.verifySale();
        Assert.assertEquals(actualMsg, expectedMsg, "No Match Found");
        hotDealsPage.clickOnSortBy();
        hotDealsPage.sortBySelectAtoZ();
        String actualMsg1 = "Name A - Z";
        String expectedMsg1 = hotDealsPage.verifySortByAtoZ();
        Assert.assertEquals(actualMsg1, expectedMsg1, "No Match Found");
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        homePage.moveOnHotDealsButton();
        hotDealsPage.clickOnSale();
        String actualMsg = "Sale";
        String expectedMsg = hotDealsPage.verifySale();
        Assert.assertEquals(actualMsg, expectedMsg, "No Match Found");
        hotDealsPage.clickOnSortBy();
        hotDealsPage.sortPriceLowToHigh();
        String actualMsg2 = "Price Low - High";
        String expectedMsg2 = hotDealsPage.verifySortPriceLowToHigh();
        Assert.assertEquals(actualMsg2, expectedMsg2, "No Match Found");
    }
    @Test
    public void verifySaleProductsArrangeByRates(){
        homePage.moveOnHotDealsButton();
        hotDealsPage.clickOnSale();
        String actualMsg = "Sale";
        String expectedMsg = hotDealsPage.verifySale();
        Assert.assertEquals(actualMsg, expectedMsg, "No Match Found");
        hotDealsPage.clickOnSortBy();
        hotDealsPage.sortByRates();
        String actualMsg3 = "Rates";
        String expectedMsg3 = hotDealsPage.verifySortByRates();
        Assert.assertEquals(actualMsg3, expectedMsg3, "No Match Found");
    }


}

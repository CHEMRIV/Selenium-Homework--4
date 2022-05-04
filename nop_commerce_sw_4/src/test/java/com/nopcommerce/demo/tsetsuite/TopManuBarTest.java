package com.nopcommerce.demo.tsetsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopManuNavigation;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TopManuBarTest extends TestBase {

    //Create object
    TopManuNavigation topManuNavigation = new TopManuNavigation();
    HomePage homePage = new HomePage();

    //Top manu tab click and navigation to another page

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputerTab();
        String expectedText = "Computers";
        String actualText =topManuNavigation.verifyComputerText();
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        homePage.clickOnElectronicsTab();
        String expectedText = "Electronics";
        String actualText =topManuNavigation.verifyElectronicsText();
    }

    @Test
    public void serShouldNavigateToApparelPageSuccessfully() {
        homePage.clickOnApparelTab();
        String expectedText = "Apparel";
        String actualText =topManuNavigation.verifyApparelText();
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        homePage.clickOnDigitalDownloadsTab();
        String expectedText = "Digital downloads";
        String actualText =topManuNavigation.verifyDigitalDownloadsText();
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        homePage.clickOnBooksTabOnTab();
        String expectedText = "Books";
        String actualText =topManuNavigation.verifyBooksTabOnText();
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        homePage.clickOnJewelryTab();
        String expectedText = "Jewelry";
        String actualText =topManuNavigation.verifyJewelryTabText();
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        homePage.clickOnGiftCardsTab();
        String expectedText = "Gift Cards";
        String actualText =topManuNavigation.verifyGiftCardsText();
    }

}

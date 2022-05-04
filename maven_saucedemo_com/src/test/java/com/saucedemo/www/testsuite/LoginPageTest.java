package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.LogInPage;
import com.saucedemo.www.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LogInPage logInPage = new LogInPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        logInPage.userName("standard_user");
        logInPage.userPassword("secret_sauce");
        logInPage.clickOnLogIn();
        String expectedMsg = "PRODUCTS";
        String actualMsg = logInPage.verifyTextProduct();
        Assert.assertEquals(actualMsg, expectedMsg, "No match Found");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        logInPage.userName("standard_user");
        logInPage.userPassword("secret_sauce");
        logInPage.clickOnLogIn();
        String expectedNumberOfProduct = "6";
        String actualNumberOfProduct = String.valueOf(logInPage.countProductOnList());
        Assert.assertEquals(expectedNumberOfProduct,actualNumberOfProduct,"No Match Found");
    }


}

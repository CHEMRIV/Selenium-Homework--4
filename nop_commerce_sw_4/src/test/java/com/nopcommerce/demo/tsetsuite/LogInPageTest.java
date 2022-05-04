package com.nopcommerce.demo.tsetsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LogInPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPageTest extends TestBase {
    HomePage homePage = new HomePage();
    LogInPage loginPage = new LogInPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLogInLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.clickOnLogInLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
    }


}

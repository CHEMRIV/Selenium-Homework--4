package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgotPassword();
        String expectedText = "Forgot Your Password?";
        String actualText = loginPage.verifyTextMsg();
        Assert.assertEquals(actualText, expectedText, "No matchFound");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("Admin");
        loginPage.enterUserPassword("admin123");
        loginPage.clickOnLogInButton();
    }


}

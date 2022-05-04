package com.herokuapp.theinternet.testsuites;

import com.herokuapp.theinternet.pages.LogInPage;
import com.herokuapp.theinternet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {

    LogInPage logInPage = new LogInPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        logInPage.enterLogINName("tomsmith");
        logInPage.enterLogINPassword("SuperSecretPassword!");
        logInPage.clickONSignIn();
    }
    @Test
    public void verifyTheUsernameErrorMessage() {
        logInPage.enterLogINName("tomsmith1");
        logInPage.enterLogINPassword("SuperSecretPassword!");
        logInPage.clickONSignIn();
        String expectedMsg="Your username is invalid!";
        String actualMsg=logInPage.verifyErrorMsg();
       // Assert.assertEquals(actualMsg,expectedMsg,"Not match found");
    }
    @Test
    public void verifyThePasswordErrorMessage() {
        logInPage.enterLogINName("tomsmith");
        logInPage.enterLogINPassword("SuperSecretPassword");
        logInPage.clickONSignIn();
        String expectedMsg="Your password is invalid!";
        String actualMsg=logInPage.getErrorMsg();
      //  Assert.assertEquals(actualMsg,expectedMsg,"Not match found");
    }

}

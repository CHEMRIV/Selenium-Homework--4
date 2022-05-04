package com.parasoft.parabank.tests;

import com.parasoft.parabank.Pages.HomePage;
import com.parasoft.parabank.Pages.RegisterPage;
import com.parasoft.parabank.Pages.SignInPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInAndRegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    SignInPage sign = new SignInPage();
    RegisterPage register = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homePage.enterEmailId("mitali");
        homePage.enterPassword("123456");
        homePage.clickOnLoginButton();
        String expectedMessage = "Customer Login";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "not found it means you are not log in");


    }

    @Test
    public void verifyTheErrorMessage()  {
        homePage.enterEmailId("mita");
        homePage.enterPassword("123456");
        homePage.clickOnLoginButton();
        String expectedMessage = "The username and password could not be verified.";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "No match found");
    }

    @Test
    public void verifyTheEmptyfieldErrorMessage() {
        homePage.enterEmailId("mitali");
        homePage.enterPassword("");
        homePage.clickOnLoginButton();
        String expectedMessage = "Please enter a username and password.";
        String actualMessage = homePage.getEmptyErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "No match found");


    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.clickOnRagister();
        String expectedMessage = "Signing up is easy!";
        String actualMessage = register.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "No match found");

        register.enterfirstname("mihjkkj");
        register.enterlastName("ghgjh");
        register.enteraddress("bnjbjj");
        register.enterstate("london");
        register.enterstate("United kingdom");
        register.enterzipCode("HA96KC");
        register.enterphoneNumber("07775623125");
        register.enterssn("123456789");
        register.enterusernameId("hjgjh456");
        register.enterpassword("123456");
        register.enterconfirmpassword("123456");
        register.clickOnRegisterButton();
    }

}


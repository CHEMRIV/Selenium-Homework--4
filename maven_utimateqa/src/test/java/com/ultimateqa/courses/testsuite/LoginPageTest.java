package com.ultimateqa.courses.testsuite;


import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnSignIn();
        String expMsg = "Welcome Back!";
        String actualMsg = loginPage.verifyMsg();
        Assert.assertEquals(actualMsg,expMsg,"No match found");
    }
    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnSignIn();
        loginPage.userName("abc123@gmail.com");
        loginPage.userPassword("123456");
        loginPage.clickOnLogInButton();
        String expMsg = "Invalid email or password.";
        String actualMsg = loginPage.errorMsg();
        Assert.assertEquals(actualMsg,expMsg,"No match found");
    }

}

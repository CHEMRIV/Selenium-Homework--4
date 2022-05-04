package com.nopcommerce.demo.tsetsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.Registration;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    HomePage homePage = new HomePage();
    Registration registration = new Registration();

    @Test
    public void verifyUserShouldNavigateToRegistrationPage() {
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registration.getRegisterText();
        Assert.assertEquals(expectedMessage, actualMessage, "Register text not display");
    }
    @Test
        public void userShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registration.clickOnGenderButton();
        registration.enterFirstName("Puja");
        registration.enterLastName("Patel");
        registration.dateOfBirthDay("22");
        registration.dateOfBirthMonth("5");
        registration.dateOfBirth_Year("1998");
        registration.enterEmailId("puja123@gmail.com");
        registration.enterPassword("123456");
        registration.enterConfirmPassword("123456");
        registration.clickOnRegisterButton();

        }

    }


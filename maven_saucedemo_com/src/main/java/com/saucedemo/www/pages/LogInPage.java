package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.saucedemo.www.driverfactory.ManageDriver.driver;

public class LogInPage extends Utility {


    By name=By.id("user-name");
    By password=By.id("password");
    By logIn=By.id("login-button");
    By verifyProduct=By.xpath("//span[contains(text(),'Products')]");


    public void userName(String userName){
        sendTextToElement(name,userName);
    }

    public void userPassword(String userPassword){
        sendTextToElement(password,userPassword);
    }


    public void clickOnLogIn(){
        clickOnElement(logIn);
    }
    public String verifyTextProduct(){
        return getTextFromElement(verifyProduct);
    }
    public Integer countProductOnList(){
        List<WebElement> productsList = driver.findElements(By.className("inventory_item_label"));
        return productsList.size();

    }

}

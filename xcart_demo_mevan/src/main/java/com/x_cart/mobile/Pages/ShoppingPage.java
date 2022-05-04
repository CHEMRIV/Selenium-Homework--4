package com.x_cart.mobile.Pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingPage extends Utility {
    By sortBy = By.xpath("//div[@class='sort-box']");
    By AToZ = By.linkText("Name A - Z");
    By selectProduct = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]");
    By clickOnSelectedProduct = By.xpath("//ul[@class = 'products-grid grid-list']/li[8]/div/div[2]/div[4]/div/button");
    By msg = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeMsg = By.xpath("//div[@id='status-messages']/a");
    By yourCard = By.xpath("//div[@title='Your cart']");
    By viewCard = By.linkText("View cart");


    public void clickOnSortBy() {
        mouseHoverOnElement(sortBy);
    }

    public void clickOnSortByAToZ() {
        clickOnMouseHoverOnElement(AToZ);
    }

    public void selectProduct() {
        mouseHoverOnElement(selectProduct);
    }

    public void clickOnSelectedProduct() {
        clickOnElement(clickOnSelectedProduct);
    }

    public String verifyMsg() {
        return getTextFromElement(msg);
    }

    public void closeMsg() {
        clickOnElement(closeMsg);
    }
    public void goToYourCard(){
        clickOnElement(yourCard);
    }
    public void goToViewCard(){
        clickOnElement(viewCard);
    }


}

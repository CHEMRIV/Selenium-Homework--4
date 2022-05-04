package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class NokiaProductPage extends Utility {
    By nokiaLumiaProduct = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By price = By.id("price-value-20");
    By changeQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCard = By.id("add-to-cart-button-20");
    By message = By.xpath("//div[@class='bar-notification success']//p");
    By closeMassage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCard = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCard = By.xpath("//button[contains(text(),'Go to cart')]");


    public String verifyTextNokiaLumiaProduct() {
        return getTextFromElement(nokiaLumiaProduct);
    }

    public String verifyProductPrice() {
        return getTextFromElement(price);

    }

    public void changeQuantity(String quantity) {
        WebElement element = driver.findElement(By.xpath("//span[@class=\\\"close\\\"]"));
        element.clear();
        quantityChange(changeQuantity, quantity);
    }

    public void addToCardProduct() {
        clickOnElement(addToCard);
    }

    public String verifyTextMassage() {
        return getTextFromElement(message);
    }

    public void closeMessage() {
        clickOnElement(closeMassage);
    }

    public void goToShoppingCard() {
        mouseHoverOnElement(shoppingCard);
    }

    public void goToCard() {
        clickOnElement(goToCard);
    }


}

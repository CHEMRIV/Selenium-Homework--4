package com.x_cart.mobile.Pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BestSellerPage extends Utility {

    By clickOnBestSellertTab = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul[1]/li[2]/child::a");
    By verifyTextBestSeller = By.tagName("h1");
    By originalProductList1 = By.xpath("//ul[@class='products-grid grid-list']/child::li/child::div/h5/a");
    By sortByZtoA = By.className("sort-by-label");

    public void clickOnBestSellertTab() {
        clickOnElement(clickOnBestSellertTab);
    }

    public String verifyTextBestSeller() {
        return getTextFromElement(verifyTextBestSeller);
    }

    public int verifyTotalProductOnSinglePage() {
        List<WebElement> originalProductList = driver.findElements(originalProductList1);
        List<String> sortPriceList = new ArrayList();
        for (WebElement element : originalProductList) {
            sortPriceList.add(element.getText());
        }
        return originalProductList.size();
    }

    public void selecSortByZtoA() {
        mouseHoverOnElement(sortByZtoA);
    }

}

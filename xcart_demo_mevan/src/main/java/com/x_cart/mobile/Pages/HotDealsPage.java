package com.x_cart.mobile.Pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HotDealsPage extends Utility {

    By sale = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::ul/descendant::a[@href='sale_products/']");
    By verifySale = By.tagName("h1");
    By sortBy = By.className("sort-by-label");
    By sortBySelectAtoZ = By.partialLinkText("Name A -");
    By verifySortByAtoZ = By.xpath("//span[contains(text(),'Name A - Z')]");

    By sortPriceLowToHigh = By.partialLinkText("Price Low");
    By verifySortPriceLowToHigh = By.xpath("//span[contains(text(),'Price Low - High')]");

    By sortByPrice = By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[7]/child::a");
    By verifySortByPrice = By.xpath("//span[contains(text(),'Rates')]");


    public void clickOnSale() {
        clickOnMouseHoverOnElement(sale);
    }

    public String verifySale() {
        return getTextFromElement(verifySale);
    }

    public void clickOnSortBy() {
        mouseHoverOnElement(sortBy);
    }

    public void sortBySelectAtoZ() {
        clickOnElement(sortBySelectAtoZ);
    }

    public String verifySortByAtoZ() {
        return getTextFromElement(verifySortByAtoZ);

    }

    public void sortPriceLowToHigh() {
        clickOnElement(sortPriceLowToHigh);
    }

    public String verifySortPriceLowToHigh() {
        return getTextFromElement(verifySortPriceLowToHigh);

    }
    public void sortByRates() {
        clickOnElement(sortByPrice);
    }

    public String verifySortByRates() {
        return getTextFromElement(verifySortByPrice);

    }

}

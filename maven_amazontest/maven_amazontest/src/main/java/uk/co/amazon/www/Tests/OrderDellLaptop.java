package uk.co.amazon.www.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.amazon.www.utility.Utility;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static uk.co.amazon.www.driverfactory.ManageDriver.driver;

public class OrderDellLaptop extends Utility {
    By acceptCookies = By.id("sp-cc-accept");
    By search = By.id("twotabsearchtextbox");
    By clickOnSearch = By.id("nav-search-submit-button");
    By clickOnDellButton = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]");
    By productDEllElement = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
    By listOfProduct = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");

    public void clickOnAcceptCookies() {
        clickOnElement(acceptCookies);
    }

    public void setSearch(String SearchThings) {
        getTextFromElement(search);
    }

    public void clickOnSearch() {
        clickOnElement(clickOnSearch);
    }

    public void clickOnDellButton() {
        clickOnElement(clickOnDellButton);
    }

    public int verifyCountProducts() {
        WebElement productDell = driver.findElement(productDEllElement);
        List<WebElement> products = driver.findElements(listOfProduct);
        List<String> actualListName = new ArrayList<>();
        for (WebElement element : products) {
            actualListName.add(element.getText());
        }
        return  products.size();
    }

}

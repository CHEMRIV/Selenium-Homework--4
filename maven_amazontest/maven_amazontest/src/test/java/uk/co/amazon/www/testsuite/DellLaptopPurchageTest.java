package uk.co.amazon.www.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.amazon.www.Tests.OrderDellLaptop;
import uk.co.amazon.www.testbase.TestBase;

public class DellLaptopPurchageTest extends TestBase {

    OrderDellLaptop orderDellLaptop = new OrderDellLaptop();

    @Test
    public void verifyDellLaptopTotalProductName()  {
        orderDellLaptop.clickOnAcceptCookies();
        orderDellLaptop.setSearch("Dell Laptop");
        orderDellLaptop.clickOnSearch();
        orderDellLaptop.clickOnDellButton();
        String expectedProduct = "30";
        String actualProduct = String.valueOf(orderDellLaptop.verifyCountProducts());
        Assert.assertEquals(expectedProduct,actualProduct,"No Match Found");


    }

}

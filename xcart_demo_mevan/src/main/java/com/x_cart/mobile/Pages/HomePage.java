package com.x_cart.mobile.Pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By hotDeals=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::span");


    public void moveOnHotDealsButton(){
        mouseHoverOnElement(hotDeals);
    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By desktop = By.xpath("//h2[@class='title']//a[contains(text(),' Desktops ')]");


    public void clickOnDesktop(){
        clickOnElement(desktop);
    }
}

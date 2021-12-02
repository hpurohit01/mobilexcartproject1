package com.mobilexcart.pages;

import com.mobilexcart.utility.Utility;
import org.openqa.selenium.By;

public class HomePages extends Utility {

    By homePage=By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf first']//a[contains(@href,'')]//span[contains(text(),'Home')]");
    By HotDealPages = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
    By Sale = By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]");
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By  Sortby= By.xpath("//span[@class='sort-by-value']");
    By Rates= By.xpath("//div[@class='content'])[2]");
    By HotDeal = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
    By Bestsellers = By.xpath("(//span[contains(text(),'Bestsellers')])[2]");
    By sotyby =By.xpath("//(//span[@class='sort-by-label'])[1]']");
    By Price= By.xpath("//a[normalize-space()='Name Z - A']");
   // By Price = By.xpath("//a[normalize-space()='Price High - Low']");


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnElement(By loginLink) {
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);

}
}



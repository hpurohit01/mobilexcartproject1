package com.mobilexcart.pages;

import com.mobilexcart.utility.Utility;
import org.openqa.selenium.By;

public class HotDeals extends Utility {
     HotDeals hotDeals=new HotDeals();
         By HotDealsPages=By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");

        By saleLink = By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]");
        By BestsellersLink = By.xpath("(//span[contains(text(),'Bestsellers')])[2]");
    private By hotDealsLink;

    public void clickOnHotDealButton(){
        clickOnElement(HotDealsPages);
    }
        public void mouseHoverOnHotDealButton() {
            mouseHoverToElement(hotDealsLink);
        }

        public void clickOnSaleButton() {
            clickOnElement(saleLink);
        }

        public void clickOnBestSellerButton() {
            clickOnElement(BestsellersLink);
        }


    }
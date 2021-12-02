package com.mobilexcart.testsuite;

import com.mobilexcart.pages.HotDeals;
import com.mobilexcart.pages.NewPages;
import com.mobilexcart.pages.BestSeller;
import com.mobilexcart.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePageTest homePageTest=new HomePageTest();
    HotDeals hotDealsPages=new HotDeals();
    LoginPageTest loginPageTest=new LoginPageTest();
    NewPages newPages= new NewPages();
    BestSeller shippingPages=new BestSeller();


    @Test
    public void verifyThatHomePageTestMenuIsClickable() {
      // homePageTest.clickOnElement(HomePageTest);
        String expectedMessage = "HomePage";
        String actualMessage = getTextFromElement(By.id("title"));
        Assert.assertEquals(expectedMessage, actualMessage, "User is not able to click on Home Page");
    }
   @Test
   public void verifyThatUserAbleToClickOnSaleMenu(){


        String expectedMessage = "Sale";
        String actualMessage = getTextFromElement(By.id("title"));
        Assert.assertEquals(expectedMessage,actualMessage,"User unable to reach Sale");
        clickOnElement(By.partialLinkText("Name Z-"));
    }
    @Test
    public void verifyBestSellersProductArrangeByZToA() {
        Actions actions = new Actions(driver);
        String expectedMessage = "Bestsellers";
        String actualMessage = getTextFromElement(By.id("title"));
        Assert.assertEquals(expectedMessage,actualMessage,"User should no able to mouse hover to BestSeller");


    }
@Test
    public void verifyBestSellersProductPriceArrangeByHighToLow() {


        String expectedMessage = "BestSellers";
        String actualMessage = getTextFromElement(By.id("title"));
        Assert.assertEquals(expectedMessage, actualMessage,"User should no able to mouse hover to BestSellers");
        Assert.assertEquals(expectedMessage,actualMessage,"Product not coming High to Low price range");

    }
    @Test
    public void verifyBestSellersProductArrangeByRates() {


        String expectedMessage = "BestSellers";
        String actualMessage = getTextFromElement(By.id("title"));
        Assert.assertEquals(expectedMessage, actualMessage,"User should no able to mouse hover to BestSellers");
        Assert.assertEquals(actualMessage,expectedMessage,"Product not coming by arrange Rates");

    }
}





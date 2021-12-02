package com.mobilexcart.testsuite;

import com.mobilexcart.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsPageTest extends TestBase {

    @Test
    public void verifySaleProductsArrangeAlphabetically() {


     //   mouseHoverAction(By.xpath("(//span[@class='primary-title'][normalize-space()='Hot deals'])[2]"));
     //   mouseHoverAction(By.xpath("(//span[contains(text(),'Sale')])[2]")).click();

        String expectedMsg = "Sale";
        String actualMsg = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(expectedMsg, actualMsg, "USER IS UNABLE TO REACH AT SALE PAGE ");

        //mouseHoverAction(By.xpath("//span[@class='sort-by-value']"));
        clickOnElement(By.partialLinkText("Name A -"));

        expectedMsg = "Name A - Z";
        actualMsg = getTextFromElement(By.xpath("//span[contains(text(),'Name A - Z')]"));
        Assert.assertEquals(expectedMsg, actualMsg, "Not sorted by expected");

    }
    @Test

    public void  mouseHoverAction() {

     //   return mouseHoeverAndClickOnElement();

    }


}

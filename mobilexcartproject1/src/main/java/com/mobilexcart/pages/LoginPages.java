package com.mobilexcart.pages;

import com.mobilexcart.utility.Utility;
import org.openqa.selenium.By;

public class LoginPages extends Utility {

    By welcomeText = By.xpath("//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]");
    By emailField = By.id("//input[@id='login-email']");
    By passwordField = By.name("//input[@id='login-password']");
    By loginButton = By.xpath("//tbody//tr//td//button[@type='submit']");
    By errorMessage = By.xpath("//div[contains(@class,'form-error')]");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}

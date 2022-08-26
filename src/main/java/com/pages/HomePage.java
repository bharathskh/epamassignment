package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    private By signInButton = By.xpath("//a[contains(.,'Sign in')]");

    public LoginPage clickSignIn(){
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }
}

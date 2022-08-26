package com.qa.util;


import com.pages.*;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class TestContext {

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public RegistraionPage getRegistraionPage() {
        return registraionPage;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public AccountsPage getAccountsPage() {
        return accountsPage;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver driver;

    public LoginPage getLoginPage() {
        return loginPage;
    }

    LoginPage loginPage;
    RegistraionPage registraionPage;
    HomePage homePage;
    AccountsPage accountsPage;



    public void intilizePageObject(WebDriver driver, Scenario s){
        loginPage = new LoginPage(driver);

//        registraionPage = new RegistraionPage(driver,s);
//
//        homePage = new HomePage(driver,s);
//
//        accountsPage = new AccountsPage(driver,s);

    }

}

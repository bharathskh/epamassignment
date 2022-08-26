package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistraionPage {

    private WebDriver driver;

    public RegistraionPage(WebDriver driver) {
        this.driver=driver;
    }

    private By genderRadio = By.xpath("//input[@id='id_gender1']");
    private By firstName = By.xpath("//input[@id='customer_firstname']");
    private By lastName = By.xpath("//input[@id='customer_lastname']");

    private By emailID = By.xpath("//input[@id='email']");
    private By passWord = By.xpath("//input[@id='passwd']");
    private By addFirstName = By.xpath("//input[@id='firstname']");
    private By addLastName = By.xpath("//input[@id='lastname']");

    private By addressInfo = By.xpath("//input[@id='address1']");

    private By city = By.xpath("//input[@id='city']");
    private By state = By.xpath("//select[@id='id_state']");

    private By zipCode = By.xpath("//input[@id='postcode']");

    private By country = By.xpath("//select[@id='id_country']");

    private By mobileNo = By.xpath("//input[@id='phone_mobile']");

    private By registerButton = By.xpath("//input[@id='submitAccount']");



    public void selectState(String stateName){
        driver.findElement(state).click();
        Select selectState = new Select(driver.findElement(state));
        selectState.selectByIndex(1);
    }

    public void selectCountry(String stateName){
        Select selectCountry = new Select(driver.findElement(country));
        selectCountry.selectByIndex(2);
    }

    public AccountsPage doRegister(String FN,String LN,String eID,String pwd,String adFN,String adLN,String address,String citi,String selectState,String zip,String selectCountry,String mobNo){
        driver.findElement(firstName).sendKeys(FN);
        driver.findElement(lastName).sendKeys(FN);
        driver.findElement(emailID).sendKeys(eID);
        driver.findElement(passWord).sendKeys(pwd);
        driver.findElement(addFirstName).sendKeys(adFN);
        driver.findElement(addLastName).sendKeys(adLN);
        driver.findElement(addressInfo).sendKeys(address);
        driver.findElement(city).sendKeys(citi);
        selectState(selectState);
        driver.findElement(zipCode).sendKeys(zip);
        selectCountry(selectCountry);
        driver.findElement(mobileNo).sendKeys(mobNo);
        driver.findElement(registerButton).click();
        return new AccountsPage(driver);
    }



}

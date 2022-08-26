package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	private WebDriver driver;

	private By accountSections = By.cssSelector("div#center_column span");

	private By regMessage= By.xpath("//p[@class='info-account']");

	private By logoutButton = By.xpath("//a[@class='logout'][contains(.,'Sign out')]");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

	public String getSuccessMessage() {
		return driver.findElement(regMessage).getText();
	}

	public int getAccountsSectionCount() {
		return driver.findElements(accountSections).size();
	}

	public void clickLogout(){
		driver.findElement(logoutButton).click();
	}

	public List<String> getAccountsSectionsList() {

		List<String> accountsList = new ArrayList<>();
		List<WebElement> accountsHeaderList = driver.findElements(accountSections);

		for (WebElement e : accountsHeaderList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
		}

		return accountsList;

	}

}

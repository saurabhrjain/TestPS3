package com.balance.ps3.Desktop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

public WebDriver driver;

By expirationDueDate=By.xpath("//*[@id=\"dataVoicePlanContentWithNoDetails\"]/div[1]/div/span[2]");
	
By planDetails =By.xpath("//*[@id=\"dataVoicePlanContentWithNoDetails\"]/div[1]/div/span[1]");

	public AccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getExpirationDueDate() {
		return driver.findElement(expirationDueDate);
	}
	public WebElement getPlanDetails() {
		return driver.findElement(planDetails);
	}


}

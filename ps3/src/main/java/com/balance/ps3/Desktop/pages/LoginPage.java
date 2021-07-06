package com.balance.ps3.Desktop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By mobileNoTextBox=By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[2]/div/div[2]/div/div/input");
	By signIn =By.xpath("//*[@id=\"SignIn\"]/a");
	By selectMobile= By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[1]/button[1]/div[2]");
	By genrateOTP =By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[3]/button");
	By enterOtp=By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[2]/div/div[1]/input[1]");
	By login=By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/div[3]/button");
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}


	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	

	public WebElement getSelectMobile() {
		return driver.findElement(selectMobile);
	}

	public WebElement getSignIn() {
		return driver.findElement(signIn);
	}

	public WebElement getMobileNoTextBox() {
		return driver.findElement(mobileNoTextBox);
	}

	public WebElement getGenerateOTP() {
		return driver.findElement(genrateOTP);
	}

	public WebElement getEnterOtp(){
		return driver.findElement(enterOtp);
	}
}

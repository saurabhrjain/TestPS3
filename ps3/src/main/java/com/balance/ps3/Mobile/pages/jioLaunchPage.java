package com.balance.ps3.Mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jioLaunchPage {

	public WebDriver driver;

	By enterMobileNo=By.xpath("//android.widget.EditText[@text='Enter mobile number']");
		
	By loginBtn =By.xpath("//android.widget.Button[@text='Login']");
	By allow =By.xpath("//android.widget.Button[@text='Allow']");
	By proceed =By.id("com.jio.myjio:id/btn_next");
	By allowWhile =By.xpath("//android.widget.Button[@text='While using the app']");
	By homeScreen=By.id("com.jio.myjio:id/layout_home_screen");
	By planDueDate =By.id("com.jio.myjio:id/tv_plan_expiry");
	By planDetails =By.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2][contains(@text, 'Expires on')]/../android.view.View[1]");
		public jioLaunchPage(WebDriver driver) {
			this.driver=driver;
		}
		
		public WebElement getEnterMobileNo() {
			return driver.findElement(enterMobileNo);
		}
		public WebElement getLoginBtn() {
			return driver.findElement(loginBtn);
		}
		public WebElement getAllow() {
			return driver.findElement(allow);
		}
		public WebElement getProceed() {
			return driver.findElement(proceed);
		}
		public WebElement getAllowWhile() {
			return driver.findElement(allowWhile);
		}
		public WebElement getHomeScreen() {
			return driver.findElement(homeScreen);
		}
		public WebElement getPlanDueDate() {
			return driver.findElement(planDueDate);
		}
		public WebElement getPlanDetails() {
			return driver.findElement(planDetails);
		}


	
	
	
	
}

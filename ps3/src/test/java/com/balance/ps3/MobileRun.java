package com.balance.ps3;

import java.net.MalformedURLException;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.balance.ps3.Desktop.pages.LoginPage;
import com.balance.ps3.Mobile.driver.mobileDriver;
import com.balance.ps3.Mobile.pages.jioLaunchPage;
import com.balance.ps3.sendMail.sendMail;
import com.balance.ps3.Mobile.driver.mobileDriver;
import io.appium.java_client.android.AndroidDriver;

public class MobileRun extends mobileDriver {
		
	@Test
	  public void MobileRun()  throws Exception {
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long totalTime =0;
		
		 startTime = System.currentTimeMillis();
	       AndroidDriver driver= mobileDriver.getDriver();
	       Scanner sc = new Scanner(System.in);
	       jioLaunchPage l=new jioLaunchPage(driver);
	       endTime = System.currentTimeMillis();
	        totalTime = endTime - startTime;
	        System.out.println("Launch Page Load Time: " + totalTime + "milliseconds");
	      
	       System.out.println("Enter Mobile no:");
	       String mobNo=sc.nextLine();
	       
	       l.getEnterMobileNo().sendKeys(mobNo);
	       startTime = System.currentTimeMillis();
	       l.getLoginBtn().click();
	       
	       if(l.getAllow().isDisplayed()){
	       l.getAllow().click();}        //driver.openNotifications();
	      l.getProceed().click();
	       l.getAllowWhile().click();
	       if(l.getAllow().isDisplayed()){
	      l.getAllow().click();}
	       endTime = System.currentTimeMillis();
	        totalTime = endTime - startTime;
	        System.out.println("Login Page Load Time: " + totalTime + "milliseconds");
	       
	       //driver.findElementById("com.jio.myjio:id/iv_close_permission_dialog").click();
	       l.getHomeScreen().click();
	       startTime = System.currentTimeMillis();
	       System.out.println("Plan Due Date :"+l.getPlanDueDate().getText());
	       String dueDate=l.getPlanDueDate().getText();
	       startTime = System.currentTimeMillis();
	       l.getPlanDueDate().click();
	       Thread.sleep(2000);
	       
	       System.out.println("Current Plan Details :"+ l.getPlanDetails().getText());
	       endTime = System.currentTimeMillis();
	        totalTime = endTime - startTime;
	        System.out.println("Plan Page Load Time: " + totalTime + "milliseconds");
	       
	       String planDueDetails="Plan Due Date"+dueDate + "\n Current Plan Name "+l.getPlanDetails().getText();
	       sendMail.sendDeatils(planDueDetails);
	       
	    }
}

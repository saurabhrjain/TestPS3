package com.balance.ps3.Desktop.driver;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

public class getOTP {
	public static String getOtp() throws MalformedURLException, InterruptedException {
        AndroidDriver driver= mobileDriver.getDriver();
        String  otp="";
        driver.openNotifications();
        if(driver.findElementById("android:id/message_name").getText().contains("JIONET")){
      otp =     driver.findElementById("android:id/message_text").getText();
       //     System.out.println(otp);
        }
        otp =     driver.findElementById("android:id/message_text").getText();
otp=otp.substring(16,22);
       // System.out.println(otp.length());
        driver.findElementById("com.android.systemui:id/clear_all").click();
        return otp;

    }

}

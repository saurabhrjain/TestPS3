package com.balance.ps3.Mobile.driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class mobileDriver {
	public static AndroidDriver<AndroidElement> getDriver() throws InterruptedException, MalformedURLException {
      System.out.println("Hello World!");
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
      cap.setCapability("appPackage","com.jio.myjio");
      cap.setCapability("appActivity", "com.jio.myjio.dashboard.activities.SplashActivity");
      cap.setCapability("autoAcceptAlerts", "true");
      Thread.sleep(10000);
      AndroidDriver<AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      return driver;
  }
}

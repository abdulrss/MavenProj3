package com.mvncrm.qa.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.mvncrm.qa.util.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.*;

public class TestBase {
	
	public static WebDriver driver;
	
	public static void initiateBrowser() throws MalformedURLException {
		
		String browserName = ProjProperties.BROWSERNAME;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("--start-maximized");
			System.setProperty("webdriver.chrome.driver", "C:\\Automation Test\\chromedriver.exe");
			
			driver = new ChromeDriver(options);
			
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation Test\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		
		else if(browserName.equalsIgnoreCase("Android")) {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName(MobileBrowserType.CHROMIUM);
			dc.setCapability("testName", "AndroidDemoTest");
			dc.setCapability("platformName", "Android");
			dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			dc.setCapability("appPackage", "com.android.chrome");
			dc.setCapability("appActivity","com.google.android.apps.chrome.ChromeTabbedActivity");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability(MobileCapabilityType.BROWSER_VERSION, "Version 55.0.2883");
			dc.setCapability("autowebview", true);  //set for emulator
			
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		}
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(ProjProperties.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ProjProperties.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		
	}
	
	/*public static void initiateBrowser() throws MalformedURLException {
		
		String browserName = ProjProperties.BROWSERNAME;
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities dc = new DesiredCapabilities();
		String hubURL = "http://192.168.0.42:4444/wd/hub";
		
		
		
		if(browserName.equalsIgnoreCase("GridSelenium")) {
			
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WIN10);
			
			//Set chrome options
			
			options.addArguments("disable-infobars");
			options.addArguments("--start-maximized");
			//options.merge(dc);
			WebDriver driver = new RemoteWebDriver(new URL(hubURL), dc);
			
			//WebDriver driver = new RemoteWebDriver(new URL(hubURL), dc);
			driver.get("https://www.freecrm.com/index.html");
			
		}
		
		
	}*/

}

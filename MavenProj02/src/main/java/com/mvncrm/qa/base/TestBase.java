package com.mvncrm.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.mvncrm.qa.util.*;

public class TestBase {
	
	public static WebDriver driver;
	
	public static void initiateBrowser() {
		
		String browserName = ProjProperties.BROWSERNAME;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			System.setProperty("webdriver.chrome.driver", "C:\\Automation Test\\chromedriver.exe");
			
			driver = new ChromeDriver(options);
			
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation Test\\chromedriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(ProjProperties.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ProjProperties.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		
		
	}

}

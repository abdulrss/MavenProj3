package com.mvncrm.qa.test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mvncrm.qa.base.TestBase;
import com.mvncrm.qa.page.LoginPage;

import junit.framework.Assert;

public class LoginTest extends TestBase{
	
	LoginPage loginPage;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		initiateBrowser();
		loginPage = new LoginPage();
	}
	
	@Test
	public void verifyLoginPageTitleTest() throws InterruptedException {
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("The title of the page is " +title);
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test
	public void loginWithValidCredentials() {
		loginPage.loginCRM("abdulrss", "abdulrss");
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
	}
	
	@Test
	public void navigateToCompaniesPage() {
		
		loginPage.navigateToCompaniesTab("abdulrss", "abdulrss");
		String title = driver.getTitle();
		Assert.assertEquals("", title);
		loginPage.newCompanyButton.isDisplayed();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}

}

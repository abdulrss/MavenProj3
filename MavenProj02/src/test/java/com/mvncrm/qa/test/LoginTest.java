package com.mvncrm.qa.test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mvncrm.qa.base.TestBase;
import com.mvncrm.qa.page.LoginPage;
import com.mvncrm.qa.util.ProjProperties;

import junit.framework.Assert;

public class LoginTest extends TestBase{
	
	public LoginTest() {
		super();
	}
	
	LoginPage loginPage;
	ProjProperties projProperties;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		initiateBrowser();
		loginPage = new LoginPage();
		projProperties = new ProjProperties();
	}
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() throws InterruptedException {
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("The title of the page is " +title);
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test(priority=2)
	public void loginWithValidCredentials() {
		loginPage.loginCRM("abdulrss", "abdulrss");
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
	}
	
	@Test(priority=3)
	public void navigateToCompaniesPage() {
		loginPage.navigateToCompaniesTab("abdulrss", "abdulrss");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name='cs_name']")).isEnabled();
		loginPage.companyLabel.isDisplayed();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}

}

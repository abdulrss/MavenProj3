package com.mvncrm.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mvncrm.qa.base.TestBase;
import com.mvncrm.qa.util.ProjProperties;

public class LoginPage extends TestBase {
	
	ProjProperties projProperties = new ProjProperties();
	
	//Define Obj Repo
	@FindBy(name="username") WebElement username_field;
	@FindBy(xpath="//input[@type='password']") WebElement password_field;
	@FindBy(xpath="//input[@value='Login']") WebElement submitBtn;
	@FindBy(id="loginform") WebElement LoginForm;
	
	
	//Define Obj Reop for HomePage
	@FindBy(xpath="//a[contains(text(), 'Companies')]") public WebElement companiesLink;
	@FindBy(xpath="//td[contains(text(), 'Companies')]") public WebElement companyLabel;
	
	
	//initialise the page
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
	
	//Methods
	public void loginCRM(String uid, String pwd) {
		username_field.sendKeys(uid);
		password_field.sendKeys(pwd);
		submitBtn.submit();
	}
	
	public void navigateToCompaniesTab(String uid, String pwd) {
		loginCRM(uid, pwd);
		projProperties.switchToFrame();
		this.companiesLink.click();
	}
	
	
}

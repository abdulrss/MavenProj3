package com.mvncrm.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mvncrm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Define Obj Repo
	@FindBy(name="username") WebElement username_field;
	@FindBy(xpath="//input[@type='password']") WebElement password_field;
	@FindBy(xpath="//input[@value='Login']") WebElement submitBtn;
	//@FindBy(css="Login") WebElement submitBtn;
	@FindBy(id="loginform") WebElement LoginForm;
	
	
	//Define Obj Reop for HomePage
	@FindBy(xpath="//a[@title='Companies']") WebElement companiesTab;
	@FindBy(xpath="//input[@value='New Company']") public WebElement newCompanyButton;
	
	
	//initialise the page
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
	
	//Methods
	
	public void loginCRM(String uid, String pwd) {
		this.username_field.sendKeys(uid);
		this.password_field.sendKeys(pwd);
		submitBtn.submit();
	}
	
	public void navigateToCompaniesTab(String uid, String pwd) {
		loginCRM(uid, pwd);
		companiesTab.click();
		
	}
	
	
	

}

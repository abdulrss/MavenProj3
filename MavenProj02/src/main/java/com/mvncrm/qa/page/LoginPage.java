package com.mvncrm.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mvncrm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Define Obj Reop
	@FindBy(name="username") WebElement username_field;
	@FindBy(xpath="//input[@type='password']") WebElement password_field;
	@FindBy(xpath="//input[@type='submit']") WebElement submitBtn;
	
	//initialise the page
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
	
	//Methods
	
	public void loginCRM(String uid, String pwd) {
		this.username_field.sendKeys(uid);
		this.password_field.sendKeys(pwd);
		submitBtn.click();
	}
	
	
	

}

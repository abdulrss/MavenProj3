package com.mvncrm.qa.util;

import com.mvncrm.qa.base.TestBase;

public class ProjProperties extends TestBase {
	
	//:::Define Browser:::
	//public static String BROWSERNAME = "Android";
	public static String BROWSERNAME = "Chrome";
	//public static String BROWSERNAME = "Firefox";
	//public static String BROWSERNAME = "GridSelenium";
	
	public static String USERNAME = "abdulrss";
	public static String PASSWORD ="abdulrss";
	public static String URL = "https://www.freecrm.com/index.html";
	public static int PAGELOAD_TIMEOUT = 30;
	public static int IMPLICIT_TIMEOUT = 20;
	
	//common methods
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

}

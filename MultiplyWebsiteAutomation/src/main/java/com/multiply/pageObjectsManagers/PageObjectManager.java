package com.multiply.pageObjectsManagers;

import org.openqa.selenium.WebDriver;

import com.multiply.pageObjects.LoginPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private LoginPage loginPage;
	
	
	/* This constructor is asking for parameter of type WebDriver. 
	 * As to create an object of the Pages, this class 
	 * requires a driver. Now who so ever will create the object of this class needs to provide 
	 * the driver like :
	 * PageObjectManager pageObjectManager = new PageObjectManager(driver);
	 * */
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	/* This method has two responsibilities:
	 * To create an Object of Page Class only if the object is null.
	 * To supply the already created object if it is not null 
	 * */
	
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
	

}

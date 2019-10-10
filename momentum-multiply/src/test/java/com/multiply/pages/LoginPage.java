package com.multiply.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.multiply.util_factory.BrowserFactory;
import org.openqa.selenium.JavascriptExecutor;


public class LoginPage<JavaScriptExecutor> extends BrowserFactory{
	
	@FindBy(how=How.XPATH, using=".//*[@class='stBannerMenus']/div[3]/a[1]/div")
	 WebElement login_text;
	
	@FindBy(how=How.XPATH, using=".//*[@name='popuplogin']/div[1]/input")
	 WebElement username;
	
	@FindBy(how=How.XPATH, using=".//*[@name='popuplogin']/div[2]/div/input")
	 WebElement password;
	
	@FindBy(how=How.XPATH, using=".//*[@class='icn-rightarrow-icn']")
	 WebElement login_button;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void login(String un, String pwd) {
		login_text.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_button.click();
	}
	
	/*public HomePage login (String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		//login_text.click();
		JavaScriptExecutor js = (JavaScriptExecutor) driver;
		((JavascriptExecutor) js).executeScript("arguments[0].click();", login_text);
		
		return new HomePage();
	}*/

}

package com.multiply.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.multiply.util_factory.BrowserFactory;

public class HomePage extends BrowserFactory{
	
	@FindBy(how=How.XPATH, using=".//*[@class='stBannerMenus']/div[3]/a[1]/div")
	 WebElement login_text;
	
	@FindBy(how=How.XPATH, using=".//*[@name='popuplogin']/div[1]/input")
	 WebElement username;
	
	@FindBy(how=How.XPATH, using=".//*[@name='popuplogin']/div[2]/div/input")
	 WebElement password;
	
	@FindBy(how=How.XPATH, using=".//*[@class='icn-rightarrow-icn']")
	 WebElement login_button;
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

}

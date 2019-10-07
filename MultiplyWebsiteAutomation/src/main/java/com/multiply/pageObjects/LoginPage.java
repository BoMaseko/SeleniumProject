package com.multiply.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using=".//*[@class='stBannerMenus']/div[3]/a[1]/div")
	 WebElement login_Button;
	
	@FindBy(how=How.XPATH, using=".//*[@name='popuplogin']/div[1]/input")
	 WebElement txtbx_UserName;
	
	@FindBy(how=How.XPATH, using=".//*[@name='popuplogin']/div[2]/div/input")
	 WebElement txtbx_Password;
	
	@FindBy(how=How.XPATH, using=".//*[@class='icn-rightarrow-icn']")
	 WebElement lgn_Button;
	
	public void show_Login_Page() {
		login_Button.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			System.out.println("Timed Out on button login click");
		}
	}
	
	public void enter_UserName(String userName) {
		txtbx_UserName.sendKeys(userName);
	}
	
	public void enter_Password(String password) {
		txtbx_UserName.sendKeys(password);
	}
	
	public void click_Login_Button() {
		lgn_Button.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			System.out.println("Timed Out on button login click");
		}
	}
	
	public void fill_user_credentials() {
		enter_UserName("bomaseko1");
		enter_Password("@Melo20191");
	}
}

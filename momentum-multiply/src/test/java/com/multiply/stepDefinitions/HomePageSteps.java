package com.multiply.stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import com.multiply.pages.HomePage;
import com.multiply.pages.LoginPage;
import com.multiply.util_factory.BrowserFactory;
import com.multiply.util_factory.TestBase;
import junit.framework.Assert;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{

	LoginPage<?> loginPage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
			BrowserFactory.invokeBrowser("chrome", "https://www.multiply.co.za/engaged/home/!ut/p/z1/04_Sj9CPykssy0x"+
										 "PLMnMz0vMAfIjo8ziAwItTIw8nA383A0MjAwCjQINg72CQo0sPI31wwkpiAJKG-AAjgZA_VFYlD"+
										 "gaOAUZORkbGLj7G2FVgGJGQW6EQaajoiIAOVUZ1Q!!/dz/d5/L2dBISEvZ0FBIS9nQSEh/"
										 );
	}

	@SuppressWarnings("deprecation")
	@Then("^user is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
		loginPage = new LoginPage();
	    String title = loginPage.validateLoginPageTitle();
	    Assert.assertEquals("What is Multiply", title);
	}

    @Then("^user log on multiply home page$")
	public void user_log_on_multiply_home_page() throws Throwable {
    	loginPage.login("bomaseko1", "@Bongz20199");
	}

	

	
}

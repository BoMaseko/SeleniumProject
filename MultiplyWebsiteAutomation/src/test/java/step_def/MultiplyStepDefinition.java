package step_def;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.multiply.browser_factory.BrowserFactory;
import com.multiply.dataProviders.ConfigFileReader;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;

import com.multiply.pageObjects.LoginPage;
import com.multiply.pageObjectsManagers.PageObjectManager;

public class MultiplyStepDefinition extends BrowserFactory{
	
	WebDriver driver;
	ConfigFileReader configFileReader;
	LoginPage loginPage;
	PageObjectManager pageObjectManager;
	
	@Test
	@Given("^The user is opening the browser and navigates to momentum multiply$")
	public void The_user_is_opening_the_browser_and_navigates_to_momentum_multiply() {
		configFileReader= new ConfigFileReader();
		driver = BrowserFactory.invokeBrowser("chrome", configFileReader.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	}

	@When("^The user enter credentials to login to momnetum multiply$")
	public void The_user_enter_credentials_to_login_to_momnetum_multiply(String user_Name, String password) throws InterruptedException {
		pageObjectManager = new PageObjectManager(driver);
		loginPage = pageObjectManager.getLoginPage();
		loginPage.show_Login_Page();
		/*loginPage.enter_UserName(user_Name);
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		loginPage.enter_Password(password);
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		loginPage.click_Login_Button();*/
	}
	
	/*@When("^The user enter credentials to login to momnetum multiply$")
	public void The_user_enter_credentials_to_login_to_momnetum_multiply(List<Credentials> userCredentials) throws InterruptedException {
		for (Credentials credentials : userCredentials) {
		driver.findElement(By.xpath(".//*[@class='stBannerMenus']/div[3]/a[1]/div")).click();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@name='popuplogin']/div[1]/input")).sendKeys(credentials.getUsername());
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@name='popuplogin']/div[2]/div/input")).sendKeys(credentials.getPassword());
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@class='icn-rightarrow-icn']")).click();
		Thread.sleep(2000);
		}
	}*/
	
	@When("^The user navigates to get more points tab$")
	public void The_user_navigates_to_get_more_points_tab() {
		Actions actions = new Actions(driver);
		WebElement getMOrePoints = driver.findElement(By.xpath(".//*[@id='Z6_PQ842HC0NG0EE0QODP3NSJ30N4']"));
		actions.moveToElement(getMOrePoints).perform();
	}



}

package step_def; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class LoginStepDefinition { 
	
	WebDriver driver;
	

	@Given("^I have open the browser$")
	public void I_have_open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bomaseko\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
		
	}

	@When("^I open Facebook website$")
	public void I_open_Facebook_website() {
		driver.get("https://www.facebook.com");
	}

	@Then("^Login button should exits$")
	public void Login_button_should_exits() {
	   
	}


	
}
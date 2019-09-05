package step_def;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;

public class MultiplyStepDefinition {
	
	WebDriver driver;
	
	@Test
	@Given("^The user is opening the browser and navigates to momentum multiply$")
	public void The_user_is_opening_the_browser_and_navigates_to_momentum_multiply() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bomaseko\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	    driver.get("https://www.multiply.co.za/engaged/home/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8ziAwItTIw8nA383A0MjAwCjQINg72CQo0sPI31wwkpiAJKG-AAjgZA_VFYlDgaOAUZORkbGLj7G2FVgGJGQW6EQaajoiIAOVUZ1Q!!/dz/d5/L2dBISEvZ0FBIS9nQSEh/");
	    
	    driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}

	@When("^The user enter login to momnetum multiply$")
	public void The_user_enter_login_to_momnetum_multiply() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@class='buorg']/div/span[2]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@class='stBannerMenus']/div[3]/a[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='popuplogin']/div[1]/input")).sendKeys("bomaseko1");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='popuplogin']/div[2]/div/input")).sendKeys("@Melo201901");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@class='icn-rightarrow-icn']")).click();
	   
	}



}

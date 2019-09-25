package step_def;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.multiply.browser_factory.BrowserFactory;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;

public class MultiplyStepDefinition extends BrowserFactory{
	
	WebDriver driver;
	
	@Test
	@Given("^The user is opening the browser and navigates to momentum multiply$")
	public void The_user_is_opening_the_browser_and_navigates_to_momentum_multiply() {
		
		driver = BrowserFactory.invokeBrowser("chrome", "https://www.multiply.co.za/engaged/home/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8ziAwItTIw8nA383A0MjAwCjQINg72CQo0sPI31wwkpiAJKG-AAjgZA_VFYlDgaOAUZORkbGLj7G2FVgGJGQW6EQaajoiIAOVUZ1Q!!/dz/d5/L2dBISEvZ0FBIS9nQSEh/");
	    
	}

	@When("^The user enter login to momnetum multiply$")
	public void The_user_enter_login_to_momnetum_multiply() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@class='stBannerMenus']/div[3]/a[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='popuplogin']/div[1]/input")).sendKeys("bomaseko1");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='popuplogin']/div[2]/div/input")).sendKeys("@Melo201901");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@class='icn-rightarrow-icn']")).click();
		Thread.sleep(2000);
	}
	
	@When("^The user navigates to get more points tab$")
	public void The_user_navigates_to_get_more_points_tab() {
		Actions actions = new Actions(driver);
		WebElement getMOrePoints = driver.findElement(By.xpath(".//*[@id='Z6_PQ842HC0NG0EE0QODP3NSJ30N4']"));
		actions.moveToElement(getMOrePoints).perform();
	}



}

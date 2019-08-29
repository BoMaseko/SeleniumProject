package step_def;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;

public class AbsaStepDefinition {

	WebDriver driver;

	@Test
	@Given("^The user is opening the browser and navigates to protractor website$")
	public void The_user_is_opening_the_browser_and_navigates_to_protractor_website() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\bomaseko\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

	}
	
	@When("^User is on User List Table$")
	public void User_is_on_User_List_Table() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Protractor practice website - WebTables", title);
	}

	@Given("^The user click on add user$")
	public void The_user_click_on_add_user() {
		try {
			driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']")).click();
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	@Given("^user add user$")
	public void user_add_user() {
		
		try {
			driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName1`");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("UName");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pword");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='optionsRadios']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@name='RoleId']")).click();
			Thread.sleep(2000);
			Select selectRole = new Select(driver.findElement(By.xpath("//select[@name='RoleId']")));
			selectRole.selectByIndex(2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("test@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("08211145");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
			
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}
	
	@Given("^user add the second user$")
	public void user_add_the_second_user() {
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='FirstName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName2");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='LastName']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName2");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='UserName']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("UNam2");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='Password']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pwor2");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='optionsRadios']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@name='RoleId']")).click();
			Thread.sleep(2000);
			Select selectRole = new Select(driver.findElement(By.xpath("//select[@name='RoleId']")));
			selectRole.selectByIndex(1);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Email']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("test@mail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Mobilephone']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("08211175");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
			
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}

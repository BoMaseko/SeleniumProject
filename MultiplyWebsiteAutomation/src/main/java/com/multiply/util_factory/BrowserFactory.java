package com.multiply.util_factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BrowserFactory() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
							"C:\\Users\\bomaseko\\git\\SeleniumProject\\MultiplyWebsiteAutomation\\src\\main\\"
							+ "java\\com\\multiply\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bomaseko\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("IE")) {
			
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(BrowserUtil.IMPLICIT_WAIT, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(BrowserUtil.PAGE_LOAD_TIMEOUT, TimeUnit.MILLISECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}

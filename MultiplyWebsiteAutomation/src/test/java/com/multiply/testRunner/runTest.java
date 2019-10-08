package com.multiply.testRunner;
 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(features = "C:\\Users\\bomaseko\\git\\SeleniumProject\\MultiplyWebsiteAutomation\\src\\main\\java\\com\\multiply\\features\\multyply.feature", 
glue = {"C:\\Users\\bomaseko\\git\\SeleniumProject\\MultiplyWebsiteAutomation\\src\\main\\java\\com\\multiply\\stepDefinitions"},
format = {"pretty", "html:target/cucumber"}, 
monochrome = true,
dryRun = true,
tags= {"@Login"}) 

public class runTest { }	
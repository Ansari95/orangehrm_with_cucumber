package com.orangeghrmrunner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;


import cucumber.api.junit.Cucumber;
	

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\featuresfile", glue="com\\orangehrmstepefinition",
				tags={"@ansari"},
				plugin ={"pretty","html:report","json:reportJson/cucumber.json"}
				

		
		
		)


public class RunnerClassOfOrangeHrm {
	
	public static WebDriver driver;
	@BeforeClass
	public static void lanchbrowser(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\firstProject\\driverfolder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@AfterClass
	public static void tearDown(){
		
		driver.close();
	}
	
}

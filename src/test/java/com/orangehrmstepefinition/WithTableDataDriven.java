package com.orangehrmstepefinition;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangeghrmrunner.RunnerClassOfOrangeHrm;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class WithTableDataDriven {
	
	public static WebDriver driver = RunnerClassOfOrangeHrm.driver;
	
	@Given("^enter url of orangerhrm headermethod$")
	public void enter_url_of_orangerhrm_headermethod() throws Throwable {
	  
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}

	@When("^user enter below username and password$")
	public void user_enter_below_username_and_password(DataTable datatable) throws Throwable {
	 
		List<Map<String, String>> keypairvalue = datatable.asMaps(String.class, String.class);
		String userName = keypairvalue.get(0).get("username");
		String passWord = keypairvalue.get(0).get("password");
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		
		
	}

	@When("^user click the login button of ornagehrm$")
	public void user_click_the_login_button_of_ornagehrm() throws Throwable {
	   
		driver.findElement(By.id("btnLogin")).click();
		   
	}

	@Then("^user enter to ornagehrm$")
	public void user_enter_to_ornagehrm() throws Throwable {
	   
		String currentUrl = driver.getCurrentUrl();
		String expecteUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(currentUrl, expecteUrl);
		
	}


	

}

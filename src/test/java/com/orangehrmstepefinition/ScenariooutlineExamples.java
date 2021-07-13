package com.orangehrmstepefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangeghrmrunner.RunnerClassOfOrangeHrm;

import cucumber.api.java.en.*;

public class ScenariooutlineExamples {

	public static WebDriver driver = RunnerClassOfOrangeHrm.driver;
	

	//You can implement missing steps with the snippets below:
	
		@Given("^client enter url of ornagehrm examplekeyword$")
		public void client_enter_url_of_ornagehrm_examplekeyword() throws Throwable {
			
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
		    
		}

		@When("^user enter username as \"([^\"]*)\" and password \"([^\"]*)\"$")
		public void user_enter_username_as_and_password(String username, String password) throws Throwable {
		    
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
		}

		@When("^user click the login$")
		public void user_click_the_login() throws Throwable {
		   
			driver.findElement(By.id("btnLogin")).click();
		}

		@Then("^user should be enter to orangehrm$")
		public void user_should_be_enter_to_orangehrm() throws Throwable {
		   
		}

	
	
}

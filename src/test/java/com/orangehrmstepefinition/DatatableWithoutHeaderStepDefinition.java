package com.orangehrmstepefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangeghrmrunner.RunnerClassOfOrangeHrm;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class DatatableWithoutHeaderStepDefinition {
	
	public static WebDriver driver = RunnerClassOfOrangeHrm.driver;
	
	

@Given("^user enter to url of orangehrm$")
public void user_enter_to_url_of_orangehrm() throws Throwable {
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
    
}

@When("^user enter below credentials$")
public void user_enter_below_credentials(DataTable datatable) throws Throwable {
    
	List<String> credentials = datatable.asList(String.class);
	String userName = credentials.get(0);
	String passWord = credentials.get(1);
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
	driver.findElement(By.id("txtPassword")).sendKeys(passWord);
	
	
}
@When("^user click the login buttom$")
public void user_click_the_login_buttom() throws Throwable {
	
	driver.findElement(By.id("btnLogin")).click();
   
}

@Then("^user should be enter to ornagehrm page$")
public void user_should_be_enter_to_ornagehrm_page() throws Throwable {
 
	String currentUrl = driver.getCurrentUrl();
	String expecteUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	Assert.assertEquals(currentUrl, expecteUrl);
	
}
	

}

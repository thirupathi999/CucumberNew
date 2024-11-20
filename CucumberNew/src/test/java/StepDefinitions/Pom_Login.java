package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginpage;

public class Pom_Login {
   private static final TimeUnit SECONDS = null;
     WebDriver driver;
	 
     loginpage lgnpg;
     
	@Given("pom user is on login page")
	public void pom_user_is_on_login_page() {
	   driver=new ChromeDriver();
	   driver.get("https://www.saucedemo.com/v1/");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	}

	@When("pom user enters valid {string} and {string}")
	public void pom_user_enters_valid_and(String uname, String password) {
		lgnpg=new loginpage(driver);
		lgnpg.enterUsername(uname);
	    lgnpg.enterpassword(password);
	    
		
	}

	@And("pom clickss on login button")
	public void pom_clickss_on_login_button() {
	    lgnpg.clicklogin();
	}
	

	@Then("pom userr navigated to home")
	public void pom_userr_navigated_to_home() {
	   lgnpg.logo();
		
	}
	
}

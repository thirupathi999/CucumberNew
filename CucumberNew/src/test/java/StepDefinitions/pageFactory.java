package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
import pageFactory.HomeText;
import pageFactory.PageFactoryData;

public class pageFactory {
 
	static WebDriver driver;
	PageFactoryData logindata;
	HomeText homedata;
	
	
	@Given("pF user is on login page")
	public void p_f_user_is_on_login_page() {
	   driver=new ChromeDriver();
	   driver.get("https://www.saucedemo.com/v1/");
	   //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@When("pF user enters valid {string} and {string}")
	public void p_f_user_enters_valid_and(String uname, String password) {
	   logindata=new PageFactoryData(driver);
	   logindata.enterUSername(uname);
	   logindata.entePwd(password);
	}

	@And("pF clickss on login button")
	public void p_f_clickss_on_login_button() {
		logindata.clickonloginButton();
	   
	}

	@Then("pF userr navigated to home")
	public void p_f_userr_navigated_to_home() {
	  homedata = new HomeText(driver);
	  homedata.isDataVisisble();
	  driver.close();
	  	  
	}

}

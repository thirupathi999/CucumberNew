package StepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
   static WebDriver driver;
	//Preconditions
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com/v1/");
	
	}
   //Action
	@When("user enters valid uname and password")
	public void user_enters_valid_uname_and_password() {
	 driver.findElement(By.id("user-name")).sendKeys("standard_user");  
	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	  
	driver.findElement(By.xpath("//*[@id='login-button']")).click();
	}
  //Expectation
	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	//	WebElement logo=driver.findElement(By.xpath("//div[@class=\"product_label\"]"));
	//	assertTrue(logo.isDisplayed());
		
		driver.quit();
		
	  
	
	}
	
	
	}


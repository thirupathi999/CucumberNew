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

public class LoginParameterization {
	 static WebDriver driver;
		//Preconditions
		@Given("userr is on login page")
		public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		}
	   //Action
		@When("userr enters valid {string} and {string}")
		public void user_enters_valid_and(String uname, String password) {
		 driver.findElement(By.id("user-name")).sendKeys(uname);  
		 driver.findElement(By.id("password")).sendKeys(password);
		}

		@And("clickss on login button")
		public void clicks_on_login_button() {
		  
		driver.findElement(By.xpath("//*[@id='login-button']")).click();
		}
	  //Expectation
		@Then("userr navigated to home page")
		public void user_navigated_to_home_page() {
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			WebElement logo=driver.findElement(By.xpath("//div[@class='product_label']"));
			assertTrue(logo.isDisplayed());
			
			driver.close();
			
}
}

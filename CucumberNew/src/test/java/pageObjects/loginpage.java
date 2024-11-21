package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	WebDriver driver;

	By txt_uname = By.xpath("//input[@id='user-name']");
	By txt_pwd = By.xpath("//input[@id='password']");
	By login_button = By.cssSelector("input.btn_action");
	By logo = By.xpath("//div[@class='app_logo']");

	public loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String uname) {
		driver.findElement(txt_uname).sendKeys(uname);

	}

	public void enterpassword(String password) {
		driver.findElement(txt_pwd).sendKeys(password);
	}

	public void clicklogin() {
		driver.findElement(login_button).click();
	}

	public void logo() {
	//	driver.findElement(logo).isDisplayed();
	}
}

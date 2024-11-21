package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryData {

	WebDriver driver;
	public PageFactoryData(WebDriver driver) {
        this.driver = driver; // Assign the passed WebDriver instance to the class variable
        PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath="//*[@name='user-name']")
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_pwd;
	@FindBy(className="btn_action")
	WebElement login_button;
	
	public void enterUSername(String uname) {
		txt_username.sendKeys(uname);
	}
	public void entePwd(String password) {
		txt_pwd.sendKeys(password);
	}
	public void clickonloginButton() {
		//login_button.click();
	}
	
	
}

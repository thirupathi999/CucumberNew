package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeText {
	
	 WebDriver driver;

    // Constructor for initializing WebDriver and Page Factory elements
    public HomeText(WebDriver driver) {
        this.driver = driver; // Assign the passed WebDriver instance to the class variable
        PageFactory.initElements(driver, this); // Initialize elements with Page Factory
    }

	
	@FindBy(className="product_label")
	WebElement text_value;
	
	public void isDataVisisble() {
		text_value.isDisplayed();
	}
	
}


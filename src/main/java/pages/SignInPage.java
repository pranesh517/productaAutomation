package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "email")
	private WebElement emailId;
	
	@FindBy(how = How.ID, using = "passwd")
	private WebElement password;
	
	public boolean isEmailAddressFieldDisplayed() {
		return emailId.isDisplayed();
	}
	
	public boolean isPasswordFieldDisplayed() {
		return password.isDisplayed();
	}

}

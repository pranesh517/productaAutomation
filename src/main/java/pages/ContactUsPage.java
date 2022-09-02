package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumUtils;

public class ContactUsPage extends SeleniumUtils {
	WebDriver driver;
	
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "email")
	private WebElement emailAddress;
	
	@FindBy(how = How.ID, using = "id_order")
	private WebElement orderRefernce;
	
	@FindBy(how = How.ID, using = "submitMessage")
	private WebElement sendButton;
	
	
	public void enterEmailAddress() {
		waitUntilElementIsVisible(driver, emailAddress);
		emailAddress.sendKeys("abc@xyz.com");
	}
	
	public void enterOrderReference() {
		waitUntilElementIsVisible(driver, orderRefernce);
		orderRefernce.sendKeys("1234567890");
	}
	
	public boolean isSendButtonDisplayed() {
		waitUntilElementIsVisible(driver, sendButton);
		return sendButton.isDisplayed();
	}

}

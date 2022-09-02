package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumUtils;

public class HomePage extends SeleniumUtils {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = "a[title='Contact Us']")
	private WebElement contactUsLink;
	
	@FindBy(how = How.CSS, using = "a[title='Log in to your customer account']")
	private WebElement signInLink;
	
	public void clickOnContactUsLink() {
		waitUntilElementIsVisible(driver, contactUsLink);
		contactUsLink.click();
	}
	
	public void clickOnSignInLink() {
		waitUntilElementIsVisible(driver, signInLink);
		signInLink.click();
	}

}

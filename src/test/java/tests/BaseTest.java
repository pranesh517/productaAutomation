package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.LaunchBrowser;

public class BaseTest {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeAllTestCases() throws IOException {
		LaunchBrowser launchBrowser = new LaunchBrowser();
		driver = launchBrowser.launchBrowserAndHitUrl();
		
	}
	
	@AfterMethod
	public void afterAllTestCases() {
		driver.quit();
	}

}

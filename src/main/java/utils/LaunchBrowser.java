package utils;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	
	public WebDriver launchBrowserAndHitUrl() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
//		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		desiredCapabilities.setBrowserName("chrome");
//		
//		driver = new RemoteWebDriver(new URL("http://localhost:4444"), desiredCapabilities);
		
		ReadPropertyFile readPropertyFile = new ReadPropertyFile();
		String URL = readPropertyFile.getPropData().getProperty("url");
		driver.get(URL); // launch url
		driver.manage().window().maximize();
		return driver;
	}

}

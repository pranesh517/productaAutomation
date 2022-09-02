package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
	
	public void waitUntilElementIsVisible(WebDriver driver, WebElement element) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.visibilityOf(element));
	}

}

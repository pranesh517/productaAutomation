package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignInPage;

public class SignInPageTests extends BaseTest {
	
	@Test
	public void TC002() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnSignInLink();
		SignInPage signInPage = new SignInPage(driver);
		Assert.assertTrue(signInPage.isEmailAddressFieldDisplayed());
		Assert.assertTrue(signInPage.isPasswordFieldDisplayed());
	}

}

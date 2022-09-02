package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactPageTests extends BaseTest {
	
	@Test
	public void TC001() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnContactUsLink();
		ContactUsPage contactUsPage = new ContactUsPage(driver);
		contactUsPage.enterEmailAddress();
		contactUsPage.enterOrderReference();
		Assert.assertTrue(contactUsPage.isSendButtonDisplayed());
	}

}

package by.artushevskaya.emailtutby.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import by.artushevskaya.emailtutby.driver.Driver;

import by.artushevskaya.emailtutby.page.HomePage;
import by.artushevskaya.emailtutby.page.InboxPage;

public class MainTest extends BaseTest {
	public static final String URL = "https://www.tut.by/";
	
	@Test
	public void checkNumberInboxEmails (){
		Driver.getWebDriver().navigate().to(URL);
		Driver.getWebDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//new HomePage().navigate();
		HomePage homePage=new HomePage();
		homePage.openAuthorizationForm().authorize("ontravels", "@ontravels").open2AuthorizationForm().openInboxPage();
		InboxPage inboxPage=new InboxPage();
	}

}

package by.artushevskaya.emailtutby.page;

import org.openqa.selenium.support.PageFactory;

import by.artushevskaya.emailtutby.driver.Driver;

public class InboxPage {
	public InboxPage() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}
}

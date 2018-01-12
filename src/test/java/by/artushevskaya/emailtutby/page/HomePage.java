package by.artushevskaya.emailtutby.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import by.artushevskaya.emailtutby.driver.Driver;

public class HomePage {
	
	public static final String URL = "https://www.tut.by/";
	
	public HomePage() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}

	/*public void navigate() {
		Driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}*/

}

package by.artushevskaya.emailtutby.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import by.artushevskaya.emailtutby.driver.Driver;
import by.artushevskaya.emailtutby.page.HomePage;

public class BaseTest {
	
@BeforeTest
public void startBrowser() {
	Driver.getWebDriver().manage().window().maximize();
	Driver.getWebDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
}

/*@AfterTest
public void closeBrowser() {
	if (Driver.getWebDriver() != null) {
		Driver.getWebDriver().quit();
	}
}*/


}

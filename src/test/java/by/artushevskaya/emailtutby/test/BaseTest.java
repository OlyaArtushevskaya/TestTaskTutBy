package by.artushevskaya.emailtutby.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import by.artushevskaya.emailtutby.driver.Driver;
import by.artushevskaya.emailtutby.page.HomePage;

public class BaseTest {
	
	private WebDriver driver;
	
@BeforeTest
public WebDriver startBrowser() {
	Driver.getWebDriver().manage().window().maximize();
	Driver.getWebDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	return driver;
}

@Test
public HomePage navigate(String url) {
	driver.get(url); //url there//this method send at homepage
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	return new HomePage();
}

/*public WebDriver getDriver() {
	return this.driver;
}*/

@AfterTest
public void closeBrowser() {
	if (driver != null) {
		driver.quit();
	}
}

/*WebDriverSingleton.getWebDriverInstance().navigate().to("http://www.tut.by");
WebDriverSingleton.getWebDriverInstance().quit();*/


}

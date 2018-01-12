package by.artushevskaya.emailtutby.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	
	private static WebDriver driver;

	private Driver() {
	}

	public static WebDriver getWebDriver() {
		if (driver == null) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			driver=new FirefoxDriver(capabilities);
		}
		return driver;
	}

}

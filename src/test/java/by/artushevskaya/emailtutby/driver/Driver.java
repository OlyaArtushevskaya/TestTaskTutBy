package by.artushevskaya.emailtutby.driver;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	
	private static WebDriver driver;

	private Driver() {
	}

	public static WebDriver getWebDriver() {
		if (driver == null) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
			//Proxy proxy = new Proxy();
			//proxy.setHttpProxy("localhost:8888");
			 
			
		
		        // конфигурация FirefoxDriver для использования прокси
		        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		        //capabilities.setCapability(CapabilityType.PROXY, proxy);

			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			driver=new FirefoxDriver(capabilities);
		}
		return driver;
	}

}

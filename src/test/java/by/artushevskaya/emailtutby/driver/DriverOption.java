package by.artushevskaya.emailtutby.driver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverOption {
	private static String subWindowHandler;
	private static String parentWindowHandler;

	public static void switchToSubWindow() {
		parentWindowHandler = Driver.getWebDriver().getWindowHandle(); 
		Set<String> handles = Driver.getWebDriver().getWindowHandles(); 
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		Driver.getWebDriver().switchTo().window(subWindowHandler); 
	}
	
	/*public static void switchToParentWindow() {
		
		Driver.getWebDriver().switchTo().window(parentWindowHandler); 
	}*/
	
	public static boolean isElementVisible(WebElement webElement, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), timeout);
            wait.until(ExpectedConditions.visibilityOf(webElement)); //elementToBeClickable(webElement));
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}

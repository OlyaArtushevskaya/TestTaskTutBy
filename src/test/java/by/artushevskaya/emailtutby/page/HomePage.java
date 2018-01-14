package by.artushevskaya.emailtutby.page;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import by.artushevskaya.emailtutby.driver.Driver;
import by.artushevskaya.emailtutby.driver.DriverOption;

public class HomePage {
	
	//public static final String URL = "https://www.tut.by/";
	//private String frameId="top_bar_helper";
	/*private String parentWindowHandler;
	private String subWindowHandler;*/
	
	//@FindBy(xpath = "//*[@id='authorize']/div/a")
	@FindBy(className="enter")
	//@FindBy(id="authorize")
	private WebElement enterButton;
	
	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginField;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@class='button auth__enter']")
	private WebElement authEnterButton;
	
	@FindBy(className="uname")
	private WebElement unameButton; ////можно убрать
	
	@FindBy(xpath = "//div[@id='authorize']/descendant::a[text()='Почта']")
	private WebElement mailButton;
	
	
	
	public HomePage() {
		PageFactory.initElements(Driver.getWebDriver(), this);
	}

	/*public HomePage navigate() {
		Driver.getWebDriver().get(URL);
		Driver.getWebDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return new HomePage();
	}*/
	
	public HomePage openAuthorizationForm() {
		DriverOption.isElementVisible(enterButton, 4);
		enterButton.click();
		return this;
	}
	
		
	/*private void switchToSubWindow() {
		parentWindowHandler = Driver.getWebDriver().getWindowHandle(); 
		System.out.println(parentWindowHandler);		
		Set<String> handles = Driver.getWebDriver().getWindowHandles(); 
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		Driver.getWebDriver().switchTo().window(subWindowHandler); 
	}*/
	
	/*private void switchToParentWindow() {
		
		Driver.getWebDriver().switchTo().window(parentWindowHandler); 
	}*/
	
	public HomePage authorize(String login, String password) {
		//Driver.getWebDriver().switchTo().frame(frameId);
		DriverOption.switchToSubWindow();
		DriverOption.isElementVisible(loginField, 4);
		loginField.clear();
		loginField.sendKeys(login);
		passwordField.clear();
		passwordField.sendKeys(password);
		DriverOption.isElementVisible(authEnterButton, 4);
		authEnterButton.click();
		//DriverOption.switchToParentWindow();
		return this;
	}
	
	public HomePage open2AuthorizationForm() { //method's name!!!
		DriverOption.isElementVisible(unameButton, 4);
		unameButton.click();
		return this;
	}
	
	public InboxPage openInboxPage() {
		DriverOption.switchToSubWindow();
		DriverOption.isElementVisible(mailButton, 4);
		mailButton.click();
//		String link=mailButton.getAttribute("href");
//		System.out.println(link);
//		JavascriptExecutor je = (JavascriptExecutor) Driver.getWebDriver();
//		je.executeScript("window.open(arguments[0])", link);
		//DriverOption.switchToParentWindow();
		return new InboxPage();		
		
		//попробовать в хроме!!!!
	}

}

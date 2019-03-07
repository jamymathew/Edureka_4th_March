package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		/*
		 * Multi Line comments
		 */		
		//Single Line Comment
		
		//Basic Commands of Selenium Webdriver
		
		//Open Browser or Innitialize or Instantiate a browser
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();

		//Close and Quit Commands
		driver.close();// it will close the current active window in the current session
		driver.quit();// it will close all the windows in the current session
		
		//Get Commands
		driver.get("URL");// this is used to open the URL of the AUT
		driver.getCurrentUrl();// this will capture the current URL of that page on which you are at present
		driver.getTitle();//this will capture the current page title.
		driver.getWindowHandle();//this will get me the names of the windows

		//Navigation Commands
		driver.navigate().to("String/URL");// this will be used to move toward either an object or towards a URL
		driver.navigate().back();//to move to a previous page
		driver.navigate().forward();//to move to the next page (already excuted)
		driver.navigate().refresh();//to refresh the page
		
		//Element handling commands
		driver.findElement(By.id("")).clear();// to clear the field
		driver.findElement(By.id("")).click();// to click on an element
		driver.findElement(By.id("")).sendKeys("Abhresh");// to type on and text box
		
	}

}










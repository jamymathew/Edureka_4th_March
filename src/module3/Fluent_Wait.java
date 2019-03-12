package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package

import com.google.common.base.Function;

public class Fluent_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");

		/*
		 * Fluent wait is an additional access to customization on polling time. It will
		 * increase the code and its complexity also increases so mostly users prefer to
		 * avoide using Fluent wait in real situations unless and until it is very much
		 * needed.
		 */

		// Here I am implimenting the Fluent wait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		// Here the element on which the fluent wait has to be used is getting accessed
		/*
		 * here i am performing the action on the element using the fluent wait to
		 * handle the wait along with the polling time condition
		 */
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.partialLinkText("LinkText-4"));
				element.click();
				return element;
			}
		});
	}
}

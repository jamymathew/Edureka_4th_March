package module10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	static WebDriver driver;
	
	public static void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public static void Navigate() throws InterruptedException {
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
	}
	
	public static void ClickGmail() throws InterruptedException {

		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Gmail")).click();
		
	}
	
}

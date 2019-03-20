package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static WebDriver driver;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://docs.seleniumhq.org/");
		
		SeleniumHomePageObjects2 page2 = new SeleniumHomePageObjects2(driver);
		
		page2.downloadPage();
		
		page2.HomePage();
		

	}

}

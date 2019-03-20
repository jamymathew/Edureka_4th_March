package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchText2 {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://www.bing.com/");

		BingHomePageObjects2 page1 = new BingHomePageObjects2(driver);
		
		page1.BingSearch("SeleniumHQ");
		
		page1.GotoSeleniumLink();
		
		SeleniumHomePageObjects2 page2 = new SeleniumHomePageObjects2(driver);
		
		page2.downloadPage();
		
		page2.HomePage();

	}

}

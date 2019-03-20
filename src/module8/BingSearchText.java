package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchText {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.bing.com/");
		
		BingHomePageObjects page1 = new BingHomePageObjects(driver);
		
		//Enter SeleniumHQ
		page1.txtSearch.sendKeys("SeleniumHQ");
		
		//Click on the search button
		page1.btnSearch.click();

		/*
		page1.txtSearch.clear();
		page1.txtSearch.sendKeys("Edureka");
		page1.btnSearch.click();
		
		page1.txtSearch.clear();
		page1.txtSearch.sendKeys("Selenium");
		page1.btnSearch.click();
		
		page1.txtSearch.clear();
		page1.txtSearch.sendKeys("Pune");
		page1.btnSearch.click();
		
		page1.txtSearch.clear();
		page1.txtSearch.sendKeys("TestNG");
		page1.btnSearch.click();
		
		page1.txtSearch.clear();
		page1.txtSearch.sendKeys("SeleniumHQ");
		page1.btnSearch.click();*/
		
	}

}

package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		driver.findElement(By.id("tool-2")).click();
		
		//Innitalize the Select Class and navigate it towards the DropDown
		Select oSelect = new Select(driver.findElement(By.name("continents")));
		
		//Select by Visible Text - Africa
		oSelect.selectByVisibleText("Africa");
		Thread.sleep(5000);
		
		//Select by Index - Australia
		oSelect.selectByIndex(3);
		Thread.sleep(5000);
		
		//Select by Value
		oSelect.selectByValue("g");
		

	}

}

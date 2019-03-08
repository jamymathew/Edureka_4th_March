package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		//Open browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Get the AUT url
		driver.get("https://www.facebook.com");
		
		/*//Using ID Locator
		driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
		driver.findElement(By.id("u_0_l")).sendKeys("Sugandhi");
		
		//Using Name Locator
		driver.findElement(By.name("reg_email__")).sendKeys("0987654321");
		
		//Using Class Locator
		driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		driver.findElement(By.className("inputtext")).sendKeys("Password");
		
		
		//Using Linktext Locator
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		//Using Partial LinkText Locator
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		//Using CSS locator
		driver.findElement(By.cssSelector("#pass")).sendKeys("Abhresh");
		driver.findElement(By.cssSelector("#u_0_a")).click();
		*/
		
		//Using TagName Locator
		WebElement a = driver.findElement(By.tagName("a"));

		
		System.out.println();
		
		
		//Using Xpath Locator
		

	}

}

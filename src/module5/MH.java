package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MH {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		
		WebElement mh = driver.findElement(By.id("nav-link-shopall"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mh).build().perform();
		
	}

}

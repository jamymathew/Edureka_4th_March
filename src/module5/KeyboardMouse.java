package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Fname = driver.findElement(By.name("firstname"));
		
		Actions steps = new Actions(driver);
		
		Action actINF = steps.moveToElement(Fname)
				.keyDown(Fname, Keys.SHIFT)
				.sendKeys("abhresh")
				.keyUp(Fname, Keys.SHIFT)
				.doubleClick(Fname)
				.contextClick(Fname)
				.build();
		actINF.perform();
		
		
	}
}

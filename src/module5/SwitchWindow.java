package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		//Part 1 - get the name of the main window
		String MW = driver.getWindowHandle();
		System.out.println("Main window name:- "+ MW);
		System.out.println("===================================================================");
		
		// Part 2 - click on the new msg window to open a new window
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
		Thread.sleep(5000);
		
		//Part 3 - get all the window names
		Set<String> AllWN = driver.getWindowHandles();
		System.out.println("All window name:- "+ AllWN);
		System.out.println("===================================================================");
		
		//Part 4 - Using the For Loop i am going to switch between the windows that are opened currently
		
		for(String SW : driver.getWindowHandles()) { //sw holds 2 data sw1 - main window sw2-new window
			
			driver.switchTo().window(SW); // sw2 and ur switching to sw1
			
			Thread.sleep(6000);
			
			driver.switchTo().window(SW); // sw1 - switch to sw2
			
			Thread.sleep(6000);
			
		}
	
		driver.close();
	}

}

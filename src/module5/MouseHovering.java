package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*Alert a = driver.switchTo().alert();
		a.dismiss();*/
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Jackets");
		
		driver.findElement(By.xpath("//*[@type='submit' and @class = 'vh79eN']")).click();
		
		//Thread.sleep(3000);
		
		WebElement MH = driver.findElement(By.xpath("//img[@class='_3togXc' and @src='https://rukminim1.flixcart.com/image/495/594/jqo3b0w0/jacket/f/8/f/m-57607fk-fort-collins-original-imafcmumsqjeteam.jpeg?q=50']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(MH).build().perform();
		
		
	}

}

package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class PAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		driver.findElement(By.id("prompt")).click();
		
		Alert pa = driver.switchTo().alert();
		
		pa.sendKeys("Abhresh Sugandhi");
		
		System.out.println(pa.getText());
		
		pa.accept();

	}

}

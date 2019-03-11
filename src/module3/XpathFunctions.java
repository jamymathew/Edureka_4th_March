package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//relative Xpath
		/*driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("Abhresh");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();*/
		
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]//preceding::input[2]")).sendKeys("Abhresh");

	}

}

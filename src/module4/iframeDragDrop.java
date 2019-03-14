package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframeDragDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/droppable/");
			
		WebElement Frame = driver.findElement(By.tagName("iFrame"));
		
		driver.switchTo().frame(Frame);
		
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Source, Target).perform();
		
		driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_input_attributes_value");
		
		driver.switchTo().frame("iframeResult");

		driver.findElement(By.name("lastname")).sendKeys("Abhresh");
		
	}

}

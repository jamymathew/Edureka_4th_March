package module12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class ValidateElement {

	public static void main(String[] args) {
		
		//WebDriver driver = new HtmlUnitDriver();
		
		System.setProperty("phantomjs.binary.path", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();

		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		driver.findElement(By.id("profession-0")).click();
		
		WebElement element = driver.findElement(By.id("profession-0"));
		
		boolean result = element.isSelected();
		
		System.out.println(result);
	}

}

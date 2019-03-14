package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {

		//1 Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//2 Open AUT
		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		driver.findElement(By.id("tool-2")).click();
		
		//3 Inntialize the Select class and focus on the element on which you are goin to interact with
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		
		//4 Select Switch Cammand with selectbyIndex
		oSelect.selectByIndex(2);
		
		Thread.sleep(5000);
		
		//5 Deselect Switch Cammand with selectbyVisibleText
		oSelect.deselectByVisibleText("Switch Commands");
		
		/*6 Run a loop using all the options available and 
		 * print one by one all the options and select those option and once it is done selcting 
		 * all the options we will deSelect all in one go
		 */
		
		//collection of options
		List<WebElement> oList = oSelect.getOptions();
		
		//from the above collected options we are counting them and we get total count
		int oListSize = oList.size();
		
		for(int i = 0; i<oListSize; i++) {
			
			String oValue = oList.get(i).getText();
			
			System.out.println(oValue);
			
			Thread.sleep(5000);
			
			oSelect.selectByIndex(i);
			
			Thread.sleep(5000);
			
			oSelect.deselectByIndex(i);
			
			Thread.sleep(5000);
			
		}

		//oSelect.deselectAll();
		
	}

}

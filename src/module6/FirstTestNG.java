package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {

	// openBrowser @BeforeSuite
	// Open AUT @BeforeTest
	// Login @Test
	// Logout @AfterMethod
	// Close Browser @AfterSuit

	WebDriver driver;

	@BeforeSuite
	public void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@BeforeTest
	public void OpenAUT() {
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void Login() throws InterruptedException {
		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void Logout() throws InterruptedException {

		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();

		Thread.sleep(3000);

	}

	@AfterSuite
	public void CloseBrowser() {
		driver.close();
	}
	
	
}

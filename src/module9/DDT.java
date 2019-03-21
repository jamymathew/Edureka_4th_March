package module9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DDT {

	WebDriver driver;
	Workbook WB;
	Sheet SH;
	int rownum;
	int colnum;

	@BeforeTest
	public void OpenApp() {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}

	@AfterTest
	public void CloseBrowser() {

		driver.close();
	}

	@Test(dataProvider = "TD")
	public void TestAUT(String FName, String LName, String Add) throws InterruptedException {

		// First Name
		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys(FName);
		// Last Name
		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys(LName);
		// Address
		driver.findElement(By.id("ts_address")).clear();
		driver.findElement(By.id("ts_address")).sendKeys(Add);
		
		Thread.sleep(5000);
	}

	@DataProvider(name = "TD")
	public Object[][] TestDataFeed() throws IOException, BiffException {

		FileInputStream fis = new FileInputStream(
				"E:\\Abhresh\\EdurekaPrograms\\Edureka_28th_Jan\\src\\module9\\TestData.xls");
		
		WB = Workbook.getWorkbook(fis);
		
		SH = WB.getSheet(1);
		
		rownum = SH.getRows();
		
		colnum = SH.getColumns();
		
		Object[][] FormData = new Object [rownum][colnum];
		
		for(int i=0; i<rownum; i++) 
		{
			for(int j=0; j<colnum; j++) 
			{
				//Fetch values of 1st Row and will use it for First Name
				FormData [i][j] = SH.getCell(j,i).getContents();
			}
			
		}
			return FormData;
	}

}

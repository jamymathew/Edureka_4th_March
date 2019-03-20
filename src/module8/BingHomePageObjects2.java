package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects2 {

	public BingHomePageObjects2(WebDriver driver) {
		// there is a PageFactory in Selenium which will innitialize the below Element
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "q")
	WebElement txtSearch;

	@FindBy(name = "go")
	WebElement btnSearch;
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	WebElement linkSelenium;


	public void BingSearch(String SearchText) {
		
		txtSearch.clear();
		
		// Enter SeleniumHQ
		txtSearch.sendKeys(SearchText);

		// Click on the search button
		btnSearch.click();
		
	}
	
	public void GotoSeleniumLink() {
		
		linkSelenium.click();
		
	}

}


















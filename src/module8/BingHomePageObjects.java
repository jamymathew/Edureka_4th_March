package module8;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects {

	public BingHomePageObjects(WebDriver driver) {
		//there is a PageFactory in Selenium which will innitialize the below Element
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name="q")
	WebElement txtSearch;
	
	@FindBy(name="go")
	WebElement btnSearch;
	
}

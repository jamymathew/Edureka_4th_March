package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHomePageObjects2 {

	public SeleniumHomePageObjects2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Download")
	WebElement clickDownload;
	
	@FindBy(xpath = "//a[@href='/' and @title='Return to Selenium home page']")
	WebElement clickHome;
	
	
	public void downloadPage() {
		clickDownload.click();
	}
	
	public void HomePage() {
		clickHome.click();
	}
}









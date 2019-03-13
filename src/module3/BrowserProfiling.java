package module3;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BrowserProfiling {

	public static void main(String[] args) {
	
		ProfilesIni profile = new ProfilesIni();
		
		FirefoxProfile NewProfile = profile.getProfile("FFProfile");
		
		System.setProperty("webdriver.gecko.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(NewProfile);
		
		driver.get("http://www.google.com");
		
		//driver.close();
		
	}

}

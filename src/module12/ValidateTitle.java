package module12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class ValidateTitle {

	public static void main(String[] args) {

		//WebDriver driver = new HtmlUnitDriver();

		System.setProperty("phantomjs.binary.path", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.google.com/");
		
		String AppTitle = driver.getTitle();

		System.out.println(AppTitle);
			
		boolean result = AppTitle.equals("Google");
		
		System.out.println(result);
		
		
		
	}

}

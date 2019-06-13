package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
public static WebDriver startBrowser(String browsername,String url){
	if(browsername.equalsIgnoreCase("firefox")){
		driver=new FirefoxDriver();
		
		}
	else if
		(browsername.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/chromedriver.exe");
driver=new ChromeDriver();

	}
	return driver;
			
		}

}
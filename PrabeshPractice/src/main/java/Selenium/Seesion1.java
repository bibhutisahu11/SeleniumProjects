package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seesion1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jar\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		String title=driver.getTitle();
		if(title.equals("Free CRM software in the cloud powers sales and customer service")){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		String url=driver.getCurrentUrl();
		if(url.contains("index.html")){	
			System.out.println("True");
		}else{
			System.out.println("False");
		}

		driver.getPageSource();
		driver.quit();
		
		
	}

}

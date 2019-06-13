package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jar\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		String title=driver.getTitle();
		System.out.println("The title is :"+title);
		
		if(title.equals("#1 Free CRM software in the cloud for sales and servi")){
			System.out.println("Title matched");
			
		}else{
			System.out.println("Title not matched");
		}
		
		String pagewource=driver.getPageSource();
		System.out.println(pagewource);
		
		String url=driver.getCurrentUrl();
		System.out.println("The url is :"+url);
		
		if(url.contains("index")){
			System.out.println("Index keyword is present");
		}else{
			System.out.println("Index keyword is not present");
		}
		
		
		driver.quit();

	}

}

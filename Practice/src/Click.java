import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Click {
	
	static List<WebElement> ele=null;
	public static void main(String[] args) {

	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.javatpoint.com/");
	

	ele=driver.findElements(By.xpath(".//*[@id='link']/div/ul/li/a"));
	for (int i = 0; i < ele.size(); i++) {
	
	
	ele.get(i).click();
	ele=driver.findElements(By.xpath(".//*[@id='link']/div/ul/li/a"));
		
		
	}

	}
	}
	



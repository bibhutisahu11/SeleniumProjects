package autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoSuggestionTest {
	@Test
public void autoSugTest(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.air.irctc.co.in/IndianRailways/");
	driver.findElement(By.linkText("Flights")).click();
	driver.findElement(By.id("origin")).sendKeys("ba");
	List<WebElement>allitems=driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
	int cnt=allitems.size();
	for(int i=0;i<cnt;i++){
		String text=allitems.get(i).getText();
		System.out.println(text);
	}
	
}
}

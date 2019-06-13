package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinksPresentTest {
	@Test
public void cricInfoLinksTest(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.cricbuzz.com/");
	List<WebElement>alllinks=driver.findElements(By.xpath("//a"));
	int linkcount=alllinks.size();
	for(int i=0;i<linkcount;i++){
		String linktext=alllinks.get(i).getText();
		System.out.println(linktext);
	}
	driver.close();
}
}

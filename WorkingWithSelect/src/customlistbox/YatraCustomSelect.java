package customlistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YatraCustomSelect {
	@Test
public void customSelectTest(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.yatra.com/");
	driver.findElement(By.id("BE_flight_origin_city")).sendKeys("goa");
	driver.findElement(By.id("BE_flight_origin_city")).sendKeys("RETURN");
}
}

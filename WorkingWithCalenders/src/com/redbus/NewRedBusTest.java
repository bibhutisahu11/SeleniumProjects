package com.redbus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewRedBusTest {
	@Test
	public void calenderTest(){
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("txtOnwardCalendar")).click();
	List<WebElement>dates	=driver.findElements(By.xpath("//div[@id='rbcal_txtOnwardCalendar']/table[1]//td"));
	int nodes=dates.size();
	for(int i=0;i<=nodes;i++){
	String dt=	dates.get(i).getText();
	if(dt.equalsIgnoreCase("15")){
		dates.get(i).click();
		break;
		
	}
	}
}
}
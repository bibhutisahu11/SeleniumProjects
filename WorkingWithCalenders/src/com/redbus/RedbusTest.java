package com.redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RedbusTest {
	public static void main(String[] args) throws InterruptedException
	{
	//@Test
//public void calenderTest(){
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

	driver.get("https://www.redbus.in/");
	Thread.sleep(3000);
	
	
	driver.findElement(By.id("txtOnwardCalendar")).click();
	driver.findElement(By.xpath(".//*[@id='rbcal_txtOnwardCalendar']/table[1]/tbody/tr[5]/td[6]")).click();
	driver.close();
	
}
}

package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ActiDownload {
	@Test
public void downloadTest() throws Exception{
		WebDriver wb=new FirefoxDriver();
		wb.get("http://localhost:8080/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(4000);
		wb.findElement(By.linkText("Reports")).click();
		Thread.sleep(4000);
		wb.findElement(By.xpath(".//*[@id='reportConfig_1']/tr[2]/td[2]/table/tbody/tr/td[1]")).click();
	    Thread.sleep(4000);
	    wb.findElement(By.xpath(".//*[@id='exportToCsv']")).click();
	    String spath="C:\\Users\\Sony\\Desktop\\CSV.exe";
	    Process res=Runtime.getRuntime().exec(spath);
	    res.waitFor();
	    System.out.println("end ");
}}
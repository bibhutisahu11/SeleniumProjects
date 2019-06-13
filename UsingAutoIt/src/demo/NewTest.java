package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
public void filedownloadTest() throws Exception{
	WebDriver wb=new FirefoxDriver();
	wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	wb.get("http://www.seleniumhq.org/download/");
	wb.findElement(By.linkText("2.52.0")).click();
	String path="C:\\Users\\Sony\\Desktop\\sel.exe";
	Runtime.getRuntime().exec(path);
	
	
}
}

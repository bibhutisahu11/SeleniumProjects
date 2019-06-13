package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NaukriFileUploadTest {
@Test
	public void fileTest() throws Exception{
	WebDriver wb=new FirefoxDriver();
	wb.get("https://login.naukri.com/nLogin/Login.php");
	Thread.sleep(4000);

	wb.findElement(By.xpath("//input[@id='emailTxt']")).sendKeys("sahu.bibhutibhusan11@gmail.com");
	wb.findElement(By.xpath("//input[@id='pwd1']")).sendKeys("bibs@_457");
	wb.findElement(By.xpath("//form/div/input[@value='Login']")).click();
	Thread.sleep(4000);
	wb.findElement(By.xpath("//div[@id='leftNav_updateProfile']/ul/li/a[contains(text(),' Attached Resume')]")).click();
	Thread.sleep(4000);
	wb.findElement(By.xpath("//a[@id='uploadLink']")).click();
	Thread.sleep(4000);
	wb.findElement(By.xpath("//input[@id='attachCV']")).click();
	Runtime.getRuntime().exec("C:\\Users\\Sony\\Desktop\\naukri.exe");

	
		

	}

}

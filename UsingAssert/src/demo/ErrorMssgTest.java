package demo;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class ErrorMssgTest {
	
public void verifyErrorTest(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8080/login.do");
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manh");
	driver.findElement(By.xpath(".//*[@id='loginButton']/div")).click();
	WebElement errmssg=driver.findElement(By.className("errormsg"));
	String mssg=errmssg.getText();
	Assert.assertTrue(mssg.equalsIgnoreCase("Username or Password is invalid. Please try again."), "please check un & pw combination");
	
	
}
}

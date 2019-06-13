package demo.log;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void LoginTest() throws Exception{
	Logger log=	Logger.getLogger("DemoTest");
	PropertyConfigurator.configure("Log4j.properties");
	WebDriver wb=new FirefoxDriver();
	log.info("firefox opened");
	wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	wb.get("http://www.ksrtc.in/");
	log.info("app launched");

	wb.findElement(By.xpath("//a[@class='button1 redbtn']")).click();
	log.info("click on search");

	Thread.sleep(2000);
	//Alert alt=wb.switchTo().alert();
	//alt.accept();
	String alt=wb.switchTo().alert().getText();
	log.info("capture the text");

	System.out.println("alert mssg is"+alt);
	wb.switchTo().alert().accept();
	log.info("accept alert window");

	
	String exp_mssg="From' place is required.";
	Assert.assertEquals(alt, exp_mssg);
	wb.quit();

	}

}

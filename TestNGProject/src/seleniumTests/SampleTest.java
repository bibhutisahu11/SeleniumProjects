package seleniumTests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
        @Test
		public void verifyTitle(){
			WebDriver wb=new FirefoxDriver();
			wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			wb.get("https://www.google.co.in");
			String actual=wb.getTitle();
			String expected="Google";
			Assert.assertEquals(actual,expected);
			
			
			
		} 

	}



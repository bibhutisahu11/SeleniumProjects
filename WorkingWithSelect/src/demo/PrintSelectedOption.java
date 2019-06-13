package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PrintSelectedOption {
	@Test
	public void printOption(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Sony/Desktop/XPATH/muli.html");
		WebElement we=driver.findElement(By.xpath("html/body/select"));
		Select select =new Select(we);
		//select.selectByIndex(1);
		String Currentvalue=select.getFirstSelectedOption().getText();
		System.out.println(Currentvalue);

	}

}
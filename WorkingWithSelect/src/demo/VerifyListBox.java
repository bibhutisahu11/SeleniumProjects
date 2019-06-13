package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyListBox {
	@Test
public void verifyDropOrListTest(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/Sony/Desktop/XPATH/muli.html");
	WebElement ele=driver.findElement(By.xpath("html/body/select"));
	Select sel=new Select(ele);
	Boolean tr=sel.isMultiple();
	Assert.assertTrue(tr,"its not a multiselect list box ,please log in as a bug");
	driver.close();
}
}

package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMultiSelectListBox {
	@Test
public void multiListBoxTest(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/Sony/Desktop/XPATH/Multiselectlistbox.html");
	WebElement ele=driver.findElement(By.xpath("html/body/select"));
	Select sel=new Select(ele);
	sel.selectByVisibleText("Red");
	sel.selectByVisibleText("Yelllow");
	sel.selectByVisibleText("Blue");
	sel.deselectByVisibleText("Yelllow");
	sel.deselectAll();
	

	
}
}

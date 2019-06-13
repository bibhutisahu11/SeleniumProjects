package com.actitime.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.pages.LoginPage;

public class VerifyActitimeLogin {
	@Test
public void verifyValidLogin(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8080/login.do");
	LoginPage login=new LoginPage(driver);
	login.typeUserName("admin");
	login.typePassword("manager");
	login.clickOnLogInButton();
	driver.close();
	
}
}

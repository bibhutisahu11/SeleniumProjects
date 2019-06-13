package com.actitime.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pages.LoginPageNew;

import utility.BrowserFactory;

public class VerifyValidLogin {
	@Test
	public void checkValidUser(){
WebDriver driver=BrowserFactory.startBrowser("firefox", "http://localhost:8080/login.do");
		
LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
login_page.loginActi("admin", "manager");
	}

}

package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	
	WebDriver driver;
	public void LoginPAgeNew(WebDriver ldriver){
		this.driver=ldriver;
	}
@FindBy(xpath=".//*[@id='username']") 
WebElement username;
@FindBy(xpath="//input[@name='pwd']")
WebElement password;
@FindBy(xpath="//a[@id='loginButton']") 
WebElement login_button;
public void loginActi(String uid,String pass){
	username.sendKeys(uid);
	password.sendKeys(pass);
	login_button.click();
}
}

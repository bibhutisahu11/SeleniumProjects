/**
 * 
 */
package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author bibhu
 * This class will store all the locators and methods of login page
 *
 */
public class LoginPage {
	WebDriver driver;
By username=By.id("username");
By password=By.xpath("//input[@name='pwd']");
By loginbutton=By.xpath("//a[@id='loginButton']");
public LoginPage(WebDriver driver){
	this.driver=driver;
	
}
public void typeUserName(String uid){
	driver.findElement(username).sendKeys(uid);
}
public void typePassword(String pass){
	driver.findElement(password).sendKeys(pass);
}
public void clickOnLogInButton(){
	driver.findElement(loginbutton).click();
}
}

package practice;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeTest
  public void loginTest(){
	  System.out.println("login is successful");
	  
	  
  }
  @Test(priority=1)
  public void searchTest(){
	  System.out.println("search is successful");
	  
	  
  }
  @Test(priority=2)
  public void advSearchTest(){
	  System.out.println("adv search is successful");
	  
	  
  }
  @Test(priority=3)
  public void buyProductsTest(){
	  System.out.println("buy products successful");
	  
	  
  }
  @AfterTest
  public void logoutTest(){
	  System.out.println("logout is successful");
	  
	  
  }
}

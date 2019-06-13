package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example2Test {
  @Test
  public void sampleTest() {
	  System.out.println("e,ugygfvv");
  }
   @BeforeMethod
   public void configBeforemethod()
   {
	 System.out.println("before method executed first");
	   
   }
  
   @AfterMethod
   public void configAftermethod()
   {
	 System.out.println("after method executed at the end");
	   
   }
   @BeforeClass
   public void configBeforeclass()
   {
	 System.out.println("before class has prioroty over before method");   
   }
    
   @AfterClass
   public void configAfterclass()
   {
	 System.out.println("after class executed at the end");
	   
   }

  
   
   
   
   
}



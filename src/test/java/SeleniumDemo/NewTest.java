package SeleniumDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("beforetest");
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("aftertest");
  }
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("connect with database");
  }
  @AfterTest
  public void aftertest()
  {
	  System.out.println("Disconnect with database");
  }
  @Test(priority=1)
  public void Login(){
	  System.out.println("Login");
  }
  @Test(enabled=false)
  public void flightbooking(){
	  System.out.println("Flight booked");
  }
  @BeforeClass
  public void beforeClass() {
	System.out.println("open browser");  
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("close browser");
  }

}

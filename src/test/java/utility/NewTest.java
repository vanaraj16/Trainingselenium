package utility;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void Broswersetup(String browserId,String Url) {
	  
	  
	  if  (browserId = "firefox"  ) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  
	  }
	  else if(browserId ="chrome") {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\chromedriver_win32 (4)\\chromedriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  
		  driver=new ChromeDriver();
	  }
	  
	  return driver;
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("connection successful");
  }
  

}

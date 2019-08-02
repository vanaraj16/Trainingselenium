package SeleniumDemo;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Robotclassdemo {
	WebDriver driver;
  @Test
  public void f() throws AWTException {
	  
	  Robot robot = new Robot();
	  
	  
	  String open =  "file:///C:/Users/Training_c2d.02.11/test2.html";
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(open);
		 WebElement browse = driver.findElement(By.xpath("//*[@id=\"1\"]"));
		 browse.click();
		 String filepath = "C:\\Users\\Training_c2d.02.11\\Doctest";
		 robot.delay(1000);
		 StringSelection selction = new StringSelection (filepath);
		 
		 //copy to clipboard
		 
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selction, null);
		 
		 robot.setAutoDelay(2000);
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 
		 robot.setAutoDelay(2000);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 driver.close();
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("connect");
  }

}

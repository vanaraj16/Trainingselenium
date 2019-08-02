package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testme1 {
WebDriver driver;
String expectedresult="Admin Home";
@Test
public void testMethod(){
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password456");
	driver.findElement(By.name("Login")).click();
	Assert.assertEquals("expectedresult", driver.getTitle());
	
	String message = driver.findElement(By.xpath("/html/body/header/div/b/c:if")).getText();
	Assert.assertEquals(message, "Hi, Admin SignOut");

}
@BeforeClass
public void beforeclass() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	}
@AfterClass
public void afterclass() {
	//driver.close();
}
}
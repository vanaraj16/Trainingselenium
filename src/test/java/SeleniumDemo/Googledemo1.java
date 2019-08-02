package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Googledemo1 {
    String Expectedresult="Find a Flight: Mercury Tours:";
    WebDriver driver;	
    
    @Test
	public void search() {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		/*WebDriverWait wait=new WebDriverWait(driver,80);
		//WebDriverWait wait1=new WebDriverWait(driver,20);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("Password")));
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		wait.until(ExpectedConditions.titleIs("Find a Flight: Mercury Tours:"));
		Assert.assertEquals(Expectedresult, driver.getTitle());*/
    	
		Actions Act=new Actions(driver);
		WebElement Gmail = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a"));
	    Act.clickAndHold(Gmail).build().perform();
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select s=new Select(driver.findElement(By.name("passCount")));
		s.selectByVisibleText("4");
		Select d=new Select(driver.findElement(By.name("fromPort")));
		d.selectByVisibleText("Paris");
		Select m=new Select(driver.findElement(By.name("fromMonth")));
		m.selectByVisibleText("July");
		Select da=new Select(driver.findElement(By.name("fromDay")));
		da.selectByVisibleText("25");
		Select A=new Select(driver.findElement(By.name("toPort")));
		A.selectByVisibleText("Paris");
		Select r=new Select(driver.findElement(By.name("toMonth")));
		r.selectByVisibleText("July");
		Select Day=new Select(driver.findElement(By.name("toDay")));
		Day.selectByVisibleText("25");
		//Select Service=new Select(driver.findElement(By.name("servClass"))).click();
		//Service.
*/		
	}
@BeforeClass
public void beforeclass() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	}
//@AfterClass
//public void afterclass() {
	//driver.close();
//}

}

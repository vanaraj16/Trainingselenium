package SeleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testmeapp {

WebDriver driver;
 @Test
 public void f() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\chromedriver_win32 (4)\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://10.232.237.143:443/TestMeApp/");
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 WebElement Aboutus=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/a/span"));
	 WebElement Ouroffice=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/ul/li/a/span"));
	 WebElement Chennai=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/ul/li/ul/li[1]/a/span"));
	 
	 
//	 WebElement search = driver.findElement(By.xpath("//input[@id='myInput']"));
//	
//	Act.moveToElement(search).click().sendKeys("b").pause(3000).sendKeys("a").pause(2000).sendKeys("g").build().perform();
//	Act.keyDown(search, Keys.BACK_SPACE).sendKeys("g").build().perform();
//	 Thread.sleep(2000);
//	 WebElement handbag = driver.findElement(By.xpath("//input[@value='Hand bag']"));
//	 Thread.sleep(5000);
//	 Act.moveToElement(handbag).click().build().perform();
//	 
	 
	 WebElement Finddeatils = driver.findElement(By.xpath("//*[@name='val' and @value='FIND DETAILS']"));
	 Finddeatils.click();
	 Thread.sleep(2000);
	 String alertmessgae = driver.switchTo().alert().getText();
	 System.out.println(alertmessgae);
	 driver.switchTo().alert().accept();
	 
	 Actions Act=new Actions(driver);
	 Act.moveToElement(Aboutus).build().perform();
	 WebDriverWait wait=new WebDriverWait(driver,20);
	 wait.until(ExpectedConditions.elementToBeClickable(Ouroffice));
	 Act.moveToElement(Ouroffice).build().perform();
	 wait.until(ExpectedConditions.elementToBeClickable(Chennai));
	 Act.moveToElement(Chennai).click().build().perform();
	 
	 String parentID = driver.getWindowHandle();
	 
	 
	 Set<String> Child1=driver.getWindowHandles();
     for(String s:Child1)
     {
    	 driver.switchTo().window(s);
    	 
     }
     
     
     
     
driver.switchTo().frame(driver.findElement(By.name("main_page")));
String address=driver.findElement(By.tagName("address")).getText();
System.out.println(address);
driver.close();



driver.switchTo().window(parentID);
WebElement girl1 = driver.findElement(By.xpath("//*[@src='img/home/girl2.png'] "));


	 
	 //driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	 //String alertMessage = driver.switchTo().alert().getText();
	 //driver.switchTo().alert().accept();
	 //System.out.println(alertMessage);
	 //driver.quit();
		}

}
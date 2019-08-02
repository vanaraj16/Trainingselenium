package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ajaxprotocol {

	WebDriver driver;
	 @Test
	 public void f(){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		 By container = By.cssSelector("#example > div.demo-container.size-narrow");
		 WebDriverWait wait=new WebDriverWait(driver,5);
         wait.until(ExpectedConditions.presenceOfElementLocated(container));
         /*get the text before performing ajax call*/
         WebElement emp = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_Label1\"]"));
         String a = emp.getText().trim();
         /*Click on the date*/
         driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadCalendar1_Top\"]/tbody/tr[1]/td[6]/a")).click();
         /*Wait for loader to disappear*/
         By loader = By.className("raDiv");
         wait.until(ExpectedConditions.visibilityOfElementLocated(loader));
         /*get the text after ajax call*/
         
         

	}

}

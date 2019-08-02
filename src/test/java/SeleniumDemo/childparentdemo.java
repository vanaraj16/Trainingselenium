package SeleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class childparentdemo {

@Test
	public void test() {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://about.google/intl/en_in/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1");
     System.out.println(driver.getTitle());
     driver.findElement(By.linkText("Privacy")).click();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     Set<String> Set=driver.getWindowHandles();
     for(String s:Set)
     {
    	 driver.switchTo().window(s);
    	 System.out.println(driver.getTitle());
     }
     
	}

}

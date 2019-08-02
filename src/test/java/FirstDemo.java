

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FirstDemo {
@Test
	public void App() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
	WebElement resize= driver.findElement(By.xpath("/html/body/div/div[3]"));
	//driver.get("https://www.google.com");
	//driver.findElement(By.name("q")).sendKeys("selenium");
	//driver.findElement(By.name("q")).submit();
	Actions Act=new Actions(driver);
	//Act.clickAndHold(driver.findElement(By.linkText("Gmail"))).release().build().perform();
	Act.dragAndDropBy(resize, 200, 400).build().perform();
	}

}

package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PresidentName {
	WebDriver driver=new FirefoxDriver();;
	public String baseUrl = "https://potus-ui.herokuapp.com/";	
    
	@Test(priority=1)
	public void presidentByName() throws Exception{
		
		driver.get(baseUrl);
		String expectedResult = "Presidents of USA";
		String actualResult = driver.getTitle();
	      Assert.assertEquals(actualResult,expectedResult);
		driver.findElement(By.id("EnterName")).clear();
		driver.findElement(By.id("EnterName")).sendKeys("Lincoln");
		WebElement element = driver.findElement(By.xpath("//span[text()='Lincoln']"));
		String str = element.getText();

		try { if ("Abraham Lincoln".equalsIgnoreCase(str));
			} catch (Exception e) {}
		Thread.sleep(1000);
		driver.quit();
		}
	
	      
	}
  

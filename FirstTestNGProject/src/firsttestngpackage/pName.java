package firsttestngpackage;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import static org.openqa.selenium.OutputType.*;
@Test
public class pName {
	
	    	WebDriver wd=new FirefoxDriver();
	        
	    	public void presidentByName()
	    	{
	        wd.get("https://potus-ui.herokuapp.com/");
//	        wd.findElement(By.linkText("Presidents by year")).click();
//	        if (!wd.findElement(By.xpath("//select[@id='year']//option[2]")).isSelected()) {
//	            wd.findElement(By.xpath("//select[@id='year']//option[2]")).click();
//	        }
	        if (!wd.findElement(By.tagName("html")).getText().contains("George Washington")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        wd.findElement(By.xpath("//div[@id='content']//li[.='John Quincy Adams']")).click();
	        wd.findElement(By.linkText("Find Presidents by name")).click();
	        wd.findElement(By.id("q")).click();
	        wd.findElement(By.id("q")).clear();
	        wd.findElement(By.id("q")).sendKeys("Lincoln");
	        wd.findElement(By.id("search-btn")).click();
	        wd.findElement(By.linkText("Abraham Lincoln")).click();
	        wd.findElement(By.linkText("Find Presidents by name")).click();
	        wd.findElement(By.id("q")).click();
	        wd.findElement(By.id("q")).clear();
	        wd.findElement(By.id("q")).sendKeys("lincoln");
	        wd.findElement(By.id("search-btn")).click();
	        wd.findElement(By.linkText("Abraham Lincoln")).click();
	        wd.quit();
}
}
	    
	    
	    




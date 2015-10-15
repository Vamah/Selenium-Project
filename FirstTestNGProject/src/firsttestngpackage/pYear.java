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
	public class pYear 
	{
	    
	    	WebDriver wd=new FirefoxDriver();
	       // wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        public void presidentByYear()
	        {
	        wd.get("https://potus-ui.herokuapp.com/");
	        wd.findElement(By.linkText("Presidents by year")).click();
	        if (!wd.findElement(By.xpath("//select[@id='year']//option[2]")).isSelected())
	        {
	            wd.findElement(By.xpath("//select[@id='year']//option[2]")).click();
	        }
	        if (!wd.findElement(By.tagName("html")).getText().contains("George Washington"))
	        {
	            System.out.println("verifyTextPresent failed");
	        }
	        wd.quit();
	        }
	       
   }
	    
	    



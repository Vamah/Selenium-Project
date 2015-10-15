package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class FirstTestNGFile {
	
	public String baseUrl = "http://bnsf.com/";
	public WebDriver driver = new FirefoxDriver();
	
//  @Test(priority = 4)
//  public void c_test()
//  {
//	  Assert.fail();
//  }
//  
//  @Test(priority = 0)
//  public void a_test()
//  
//  {		driver.get("http://www.indeed.com");
//	  
//	  System.out.println(driver.findElement
//			(By.xpath("//input[@id='what']")).getAttribute("name"));
//	  Assert.assertTrue(true);
//  }
//  
//  @Test(priority = 8)
//  public void b_test()
//  {
//	  throw new SkipException("Skipping test b");
//  }
	@AfterTest
	public void exit(){
		driver.quit();
	}
    @BeforeTest
	public void getUrl(){
		driver.get(baseUrl);
	}
	@Test
     public void verifyHomePageTitle() {
		
	  System.out.println(driver.getTitle());
	  String expectedResult = "Freight transportation - BNSF Railway";
	  String actualResult = driver.getTitle();
      Assert.assertEquals(actualResult,expectedResult);
  	  
  }
  
  
}

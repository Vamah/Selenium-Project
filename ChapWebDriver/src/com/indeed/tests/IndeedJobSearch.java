package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IndeedJobSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		
		// for chrome browser
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Anuraadha\\workspace\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		// for IE browser
		
//		System.setProperty("webdriver.ie.driver",
//				"C:\\Users\\Anuraadha\\workspace\\Selenium\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
		//open indeed home page
		driver.get("http://www.indeed.com");
		
		/*Thread.sleep(2000);
		// find what field and enter selenium
		driver.findElement(By.id("what")).sendKeys("selenium");
		Thread.sleep(2000);
		// find location and clear default
		driver.findElement(By.id("where")).clear();
		Thread.sleep(2000);
		// find location with Frisco
		driver.findElement(By.id("where")).sendKeys("Frisco, TX");
		Thread.sleep(2000);
		// Find Findjobs button and click
		driver.findElement(By.id("fj")).click();
		// find job results page title an job count msg
		
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("searchCount")).getText());*/
		
		// find link text and click
//		Thread.sleep(2000);
	
//		driver.findElement(By.linkText("Upload your resume")).click();
		//find by xPath
		
		System.out.println(driver.findElement
				(By.xpath("//input[@id='what']")).getAttribute("name"));
		
		//close browser
		driver.close();
	}

}

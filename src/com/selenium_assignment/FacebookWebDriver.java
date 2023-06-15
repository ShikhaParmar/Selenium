package com.selenium_assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWebDriver {
	WebDriver driver=null;
	
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("shikha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Log in")).click();
		Thread.sleep(2000);
		
	}
	
	@After
	public void after() {
		
		System.out.println("Completed!!!!");
		driver.close();
	}
	
	

}

package com.selenium_assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCheck {
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.get("https://phptravels.com/demo/");
//		driver.get("http://thedemosite.co.uk/");
	//	driver.get("http://newtours.demoaut.com/");
//		driver.get("http://the-internet.herokuapp.com/");
	//	driver.get("http://automationpractice.com/index.php");
//		driver.get("http://book.theautomatedtester.co.uk/");    
		driver.get("https://s1.demo.opensourcecms.com/wordpress/");

		
		Thread.sleep(5000);
		
		System.out.println("Title is......"+driver.getTitle());
		System.out.println("Current URL is....."+driver.getCurrentUrl());
    	driver.close(); 
 	
    	
	}
	

}

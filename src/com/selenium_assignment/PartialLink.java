package com.selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:\\f drive\\eclipse\\Selenium\\src\\com\\html\\NewFile.html");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Click")).click(); 
		Thread.sleep(2000);
		
		driver.close();
	}

}

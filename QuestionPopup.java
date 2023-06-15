package com.selenium_assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		
		String main_wString=driver.getWindowHandle();
		System.out.println("main window is...."+main_wString);
		
		driver.findElement(By.partialLinkText("Here")).click();
		Thread.sleep(2000);
		
		Set<String> all_w=driver.getWindowHandles();
		Iterator<String> i1=all_w.iterator();
		
		while (i1.hasNext()) {
			String child_w =i1.next();
			System.out.println(child_w);
			
			if (!main_wString.equals(child_w)) {
				driver.switchTo().window(child_w);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("shikha@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();	
			}
		}

	}
}

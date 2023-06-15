package com.selenium_assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionOfAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		
		Alert a1=driver.switchTo().alert();
		System.out.println("First alert message:..."+a1.getText());
		
		a1.accept();           
	//	a1.dismiss();
		Thread.sleep(2000);
		
		Alert a2=driver.switchTo().alert();
		System.out.println("Second Alert message:...."+a2.getText());
		a2.accept();
		Thread.sleep(2000);
		
		driver.close();

	}

}

package com.selenium_assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailWebdriver {
	
WebDriver driver=null;
	
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ffgf=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=Af_xneEp_PMytLcaliXFPnIZN6EMoZGxhKdjJ135GPm0V-WGVmWMLIudF0cf6fMubwBbuCikgGLkJQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("shikhaaparmar97@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ.VfPpkd-LgbsSe-OWXEXe-dgl2Hf.nCP5yc.AjY5Oe.DuMIQc.LQeN7.qIypjc.TrZEUc.lw1w4b")).click();
	//	driver.findElement(By.partialLinkText("Next")).click();
		Thread.sleep(12000);
		driver.findElement(By.cssSelector("input[aria-label='Enter your password']")).sendKeys("S@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ.VfPpkd-LgbsSe-OWXEXe-dgl2Hf.nCP5yc.AjY5Oe.DuMIQc.LQeN7.qIypjc.TrZEUc.lw1w4b")).click();
		Thread.sleep(2000);
	}
	@After
	public void after() {
		driver.close();
	}

}

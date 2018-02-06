package com.SelVer381;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test0002 {

	@Test
	public void test02(){
	System.setProperty("webdriver.chrome.driver","E:\\MySelFolder\\chromedriver_win32\\2.33\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://rediff.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.quit();
	}
	
	@Test
	public void test03(){
	System.setProperty("webdriver.chrome.driver","E:\\MySelFolder\\chromedriver_win32\\2.33\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://linkedin.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.quit();
	}
	
}







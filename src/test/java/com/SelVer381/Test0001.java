package com.SelVer381;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0001 {

	public void test01(){
		
		System.setProperty("webdriver.chrome.driver","E:\\MySelFolder\\chromedriver_win32\\2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		

	}

}

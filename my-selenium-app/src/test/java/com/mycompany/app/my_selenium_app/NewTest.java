package com.mycompany.app.my_selenium_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() 
  {
	  System.out.println("welcome to selnium maven project"); 
  }
  @Test
  public void LaunchChrome() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\imran\\eclipse-workspace\\selenium\\selenium_java\\Binary\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
  }
}

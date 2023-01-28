package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Skip_Ignore_Disabled { 
	WebDriver driver;
	
	  @Test(enabled=false)
	  public void twitter() {
		  driver.get("https://www.twitter.com");
	  }
	  
	  @Test(priority=0,enabled=false)
	  public void google() {
		  driver.get("https://www.google.com");
		  
	  } 
	 
	  @Test
	  public void gmail() {
		  driver.get("https://www.gmail.com");
	  } 
	 
	  @Test(priority=2)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  } 
	 
	  @Test(enabled=true,priority=1)
	  public void seleniumdev() {
		  driver.get("https://www.selenium.dev");
	  } 
	 
	  @BeforeTest
	  public void beforeTest1() { 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
	      driver=new ChromeDriver(); 
	      driver.manage().window().maximize();
	  }

  @Test
  public void f() {
  }

  @AfterTest
  public void afterTest() {
  }

}

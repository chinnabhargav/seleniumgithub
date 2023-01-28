package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_RegressionSanity {
	WebDriver driver;
	
  @Test(groups="sanity")
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  
  @Test(groups="regression")
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	  
  } 
 
  @Test(groups="smoke")
  public void gmail() {
	  driver.get("https://www.gmail.com");
  } 
 
  @Test(groups="sanity")
  public void facebook() {
	  driver.get("https://www.facebook.com");
  } 
 
  @Test
  public void seleniumdev() {
	  driver.get("https://www.selenium.dev");
  } 
 
  @BeforeTest(groups="regression")
  public void beforeTest() { 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

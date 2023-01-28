package testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestNG_TimeOut { 
	WebDriver driver; 
	
  @Test
  public void searchTestNG(){
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("TestNG");
	  driver.findElement(By.name("q")).sendKeys("Keys.ENTER");
	  
  } 
  
  @Test(timeOut=1000)
  public void searchSelenium() { 
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Selenium");
	  driver.findElement(By.name("q")).sendKeys("Keys.ENTER");
	  
  } 
  
  @BeforeClass
  public void beforeClass() { 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize();   
  }

}

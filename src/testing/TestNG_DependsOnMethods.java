package testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestNG_DependsOnMethods { 
	WebDriver driver; 
	
  @Test(dependsOnMethods="method2")
  public void method1(){
	  driver.findElement(By.name("q")).sendKeys("TestNG");
	  driver.findElement(By.name("q")).sendKeys("Keys.ENTER");
	  
  } 
  
  @Test
  public void method2(){
	  driver.get("https://www.google.com");
	 
	  
  } 
  
  @BeforeClass
  public void beforeClass() { 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize();   
  }

}

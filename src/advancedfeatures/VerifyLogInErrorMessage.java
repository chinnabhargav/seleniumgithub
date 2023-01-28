package advancedfeatures;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyLogInErrorMessage {
	WebDriver driver;
	
  
  @Test
  public void verifyseleniumlevelsponserssection() throws Exception {
	  driver.get("https://www.redmine.org/login");
	  Thread.sleep(3000);
	  
	  String experrortext = "Invalid user or password";
	 
	  
	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")).click();
	 
	  String acterrortext = driver.findElement(By.xpath("//*[@id=\"flash_error\"]")).getText();
	 
	  
	  Assert.assertEquals(acterrortext,experrortext);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize(); 
  }

}

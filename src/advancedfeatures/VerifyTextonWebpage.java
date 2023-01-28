package advancedfeatures;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyTextonWebpage {
	WebDriver driver;
	
  
  @Test
  public void verifyseleniumlevelsponserssection() throws Exception {
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(3000);
	  
	  String exptext = "Selenium Level Sponsors";
	 
	  
	  String acttext = driver.findElement(By.xpath("/html/body/div/main/div[3]/h2")).getText();
	 
	  
	  Assert.assertEquals(acttext,exptext);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize(); 
  }

}

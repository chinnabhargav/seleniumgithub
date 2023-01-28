package advancedfeatures;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyWebURL {
	WebDriver driver;
  
  @Test
  public void verifyweburl() throws Exception {
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(3000);
	  
	 String expurl = "https://www.selenium.dev/";
	 
	 String acturl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(acturl,expurl);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize(); 
  }

}

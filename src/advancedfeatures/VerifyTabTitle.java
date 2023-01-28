package advancedfeatures;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyTabTitle {
	WebDriver driver;

   
  @Test
  public void verifywebapplicationtabtitle() throws Exception {
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(3000);
	  
	  String exptabtitle = "Selenium";
	  System.out.println("Expected Web Title is :"+exptabtitle);
	  
	  String acttabtitle = driver.getTitle(); 
	  System.out.println("Actual Web Title is :"+acttabtitle); 
	  
	  Assert.assertEquals(acttabtitle,exptabtitle);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize(); 
  }

}

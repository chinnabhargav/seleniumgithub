package actionsclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseOver {
	WebDriver driver; 
	
  @Test
  public void mouseOver() throws Exception {
	    driver.get("http://seleniumlearn.com");
	    
        Thread.sleep(3000);

        Actions act=new Actions(driver);

        act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
        
        Thread.sleep(3000);
        
        act.moveToElement(driver.findElement(By.linkText("Selenium Training"))).click().perform();

    }
	

  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize(); 
  }

}

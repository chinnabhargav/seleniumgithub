package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertCancleButton {
	WebDriver driver;
	
  @Test
  public void alertcancel() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	  Alert alt = driver.switchTo().alert();
	  alt.sendKeys("chinna");
	  alt.accept();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize(); 
  }

}

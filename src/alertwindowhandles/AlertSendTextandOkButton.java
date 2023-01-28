package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertSendTextandOkButton {
	WebDriver driver;
	
  @Test
  public void alertcancel() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
	//driver.switchTo().alert().accept();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize(); 
  }

}

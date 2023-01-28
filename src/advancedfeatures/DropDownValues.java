package advancedfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownValues { 
	WebDriver driver;
	
  @Test
  public void dropdownselect() throws InterruptedException {
	  driver.get("http://baalabharathi.com/upload-story/");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("524101");
			  
	 // new Select(driver.findElement(By.xpath("]//*[@id=\"field-5gVECDat8HE4BHW\""))).selectByVisibleText("Belgium");
	  
	 // new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("AQ");
	  
	    new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(3);
  }
  @BeforeTest
  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver(); 
		 driver.manage().window().maximize();
  }

}

package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class XpathLocator {
	
  static WebDriver driver;
  
	

	@Test
	void locators() throws InterruptedException {
		driver.get("http://prakampanam.com/user");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("Bhargavi");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		Thread.sleep(3000);
		driver.findElement(By.className("form-submit")).click();
	}
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
	      driver=new ChromeDriver(); 
	      driver.manage().window().maximize(); 
	}
}

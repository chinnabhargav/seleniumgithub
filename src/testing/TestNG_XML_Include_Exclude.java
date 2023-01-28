package testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestNG_XML_Include_Exclude { 
	WebDriver driver; 
	
  @Test(description="Registration Module")
  public void rm2() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("bhargavi");
	  driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("Hello@2023");
	  driver.findElement(By.xpath("//*[@id=\"new_user\"]/input")).click();
	  
  } 
  
  @Test(description="Sign-In Module")
  public void rm3() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("bhargavi");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hello@2023");
	  driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")).click();
	  
	  
  } 
  @Test(description="Top Menus Module")
  public void rm4() { 
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[3]/a")).click();
	  
	  
	  
  } 
  @Test(description="Main Menu")
  public void rm5(){
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a")).click(); 
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[4]/a")).click();
	  
	  
	  
  } 
  @BeforeClass
  public void beforeClass() { 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.manage().window().maximize();   
      driver.get("http://www.redmine.org/");
  }

}

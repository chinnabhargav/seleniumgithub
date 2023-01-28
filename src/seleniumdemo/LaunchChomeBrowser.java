package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChomeBrowser {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
		  driver=new ChromeDriver(); 
		  
		  Thread.sleep(2000);
		  
	      driver.manage().window().maximize(); 
	      
	      driver.get("http://www.google.com");
	      
	      Thread.sleep(2000);
	      //driver.quit();
	}

}

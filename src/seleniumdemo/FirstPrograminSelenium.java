package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPrograminSelenium {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
	      driver=new ChromeDriver(); 
	      driver.manage().window().maximize(); 
	      driver.manage().window().minimize(); 
	    //driver.close();
	      driver.quit();
	}

}

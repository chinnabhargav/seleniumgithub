package javademo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{

           System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
           driver=new ChromeDriver(); 
           Thread.sleep(1000);
           driver.manage().window().maximize();// Browser window Maximize4
           Thread.sleep(3000);
           driver.get("http:\\www.google.com/"); 
           driver.navigate().to("http:\\www.facebook.com/");
           Thread.sleep(3000);
           driver.navigate().back();
           Thread.sleep(3000);
           driver.navigate().forward();
           Thread.sleep(3000);
           driver.navigate().refresh();
	}

}
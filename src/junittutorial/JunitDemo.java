package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo {

	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\MYPC\\Documents\\lib\\chromedriver.exe");
	      driver.manage().window().maximize();   
	      driver=new ChromeDriver(); 
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	} 
	
    @Disabled  // Junit 5 version
	@Test
	void test1() {
		driver.get("http://www.google.com");
	}

    @Ignore  // Junit 3&4 versions
	@Test
	void test2() {
		driver.get("http://www.facebook.com");
	}
	
	@Test
	void test3() {
		driver.get("http://www.twitter.com");
	}
	
	@Test
	void test4() {
		driver.get("http://www.Selenium.dev");
	}
}

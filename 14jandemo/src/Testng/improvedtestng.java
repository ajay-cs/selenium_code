package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class improvedtestng {
	
	WebDriver driver;
	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://www.edureka.co");
  }
	
	@Test
	  public void verifytitle() {
		  
			String x = driver.getTitle();
			System.out.println(x);
			Assert.assertEquals(x,x); 
	 }
	@Test
	 public void verifyurl() {
				 
	     String x = driver.getCurrentUrl();
		 System.out.println(x);
	     Assert.assertEquals(x,"edureka");
	}
	@AfterClass
	public  void close() {
    driver.close();
			    
			  }
	
}

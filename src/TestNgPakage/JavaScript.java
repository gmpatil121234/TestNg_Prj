package TestNgPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {
	WebDriver driver;
 /* @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  JavascriptExecutor js =  (JavascriptExecutor) driver;
	  js.executeScript("(window.scrollBy(0,1500))");
	  
  }*/
	
	
	@Test
	  public void jsPageScroll() throws Exception {
	          WebDriverManager.chromedriver().setup();
	          WebDriver driver = new ChromeDriver();
	          driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	       
	     
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("window.scroll(0,800)");
	        Thread.sleep(3000);
	        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	        Thread.sleep(5000);
	       
	        driver.quit();
	  }
	 
	 
	  @Test
	  public void jsListenEventExecute() throws Exception {
	          WebDriverManager.chromedriver().setup();
	          WebDriver driver = new ChromeDriver();
	          driver.get("https://opensource-demo.orangehrmlive.com/");
	          driver.findElement(By.id("btnLogin")).click();
	         
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("document.getElementById(\"btnLogin\").addEventListener(\"click\", function(){ alert(\"Hello World!\");})");
	        Thread.sleep(2000);
	        driver.findElement(By.id("btnLogin")).click();
	        Thread.sleep(5000);
	        driver.switchTo().alert().accept();
	        Thread.sleep(2000);
	        driver.quit();
	  }
}

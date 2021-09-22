package TestNgPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTableCls {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
      driver.findElement(By.name("txtPassword")).sendKeys("admin123");
      driver.findElement(By.id("btnLogin")).click();
      WebElement Admin = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
      Actions action = new Actions(driver);
      action.moveToElement(Admin).build().perform();

	    
	        
  }
}

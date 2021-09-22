package TestNgPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void alert1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.demoqa.com/alerts");
	 
      
      
      
      
      driver.findElement(By.id("alertButton")).click();
      Thread.sleep(2000);
      
      driver.switchTo().alert().accept();
              
      driver.findElement(By.id("timerAlertButton")).click();
      Thread.sleep(6000);
      String str=driver.switchTo().alert().getText();
      System.out.println(str);
      
      driver.switchTo().alert().accept();
      
      driver.findElement(By.id("confirmButton")).click();
      Thread.sleep(2000);
      
      driver.switchTo().alert().dismiss();
              
      driver.findElement(By.id("promtButton")).click();
      Thread.sleep(2000);
      
      driver.switchTo().alert().sendKeys("Selenium");
      
      driver.switchTo().alert().accept();
    
      
  
	  
  }
}

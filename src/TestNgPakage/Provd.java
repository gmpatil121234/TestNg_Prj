package TestNgPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provd {
 	  @Test(dataProvider="getData")
	    
      public void OrangeHRM_Login(String name ) {
 		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          System.out.println(name);
          driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
          driver.findElement(By.name("txtUsername")).clear();
          driver.findElement(By.name("txtUsername")).sendKeys(name);
          driver.findElement(By.name("txtPassword")).clear();
          driver.findElement(By.name("txtPassword")).sendKeys("admin123");
          driver.findElement(By.id("btnLogin")).click();
         // String Element = driver.findElement(By.linkText("Dashboard")).getText();
         // System.out.println(Element);
  
 
 	  }

 	 @DataProvider(name="getData")
     public Object[] getData()
     {
         Object[] data = {"Admin","abcd","XYZ"};
         return data;
     }
	

 
}

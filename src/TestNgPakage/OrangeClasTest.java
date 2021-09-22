package TestNgPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrangeClasTest {
  @Test
  public void assertMetod() {
	  
	//WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
  ChromeDriver driver = new ChromeDriver();
  driver.navigate().to("https://jqueryui.com/droppable/");
  

  
  WebElement frme = driver.findElement(By.className("demo-frame"));    
  driver.switchTo().frame(frme);
  
  WebElement elem1= driver.findElement(By.id("draggable"));
  WebElement elem2= driver.findElement(By.id("droppable"));
          
  Actions act = new Actions(driver);
  act.dragAndDrop(elem1, elem2).build().perform();
  
  
 
  
  
 
  
  
 
  
  /*
  driver.get("https://opensource-demo.orangehrmlive.com/");
  driver.findElement(By.id("txtUsername")).sendKeys("abcd");
  Thread.sleep(3000);
  driver.findElement(By.id("txtUsername")).clear();
  */
  
          
      
      
  
  
  
}
  
 
	  
  }


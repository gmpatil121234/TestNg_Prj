package TestNgPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNgClass {
  @Test
  public void locaterMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
      driver.manage().window().maximize();
    
      //redioButton  && checkBox
      driver.findElement(By.xpath("//input[@value='radio1']")).click();
      driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
      
      /*  driver.get("https://demoqa.com/buttons");
   
      WebElement element= driver.findElement(By.cssSelector("#doubleClickBtn"));
      WebElement element1= driver.findElement(By.cssSelector("#rightClickBtn"));
      WebElement element2= driver.findElement(By.xpath("//button[text()='Click Me']"));
      
      
	String vlu= driver.findElement(By.id("doubleClickBtn")).getAttribute("class");
    System.out.println(vlu);
	driver.findElement(By.tagName("a")).click();////////*[@id="rightClickBtn"]
	driver.findElement(By.tagName("//a[2]")).click();
    
   Actions act = new Actions (driver);
    
      act.moveToElement(element).doubleClick().build().perform();
      act.moveToElement(element1).contextClick().build().perform();
      act.moveToElement(element2).click().build().perform();
      */
      
	  //SrollBy
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scroll(0,800)");
	  js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	  
	  
	  //DropDown
	   Select s = new Select (driver.findElement(By.id("dropdown-class-example")));
      s.selectByIndex(2);
      s.selectByVisibleText("Option2");
	  
	  
	  
  }
 
  
}

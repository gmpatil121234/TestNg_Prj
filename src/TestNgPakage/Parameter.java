package TestNgPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	 WebDriver driver;

	 

	    @BeforeTest
	 //   @Parameters({"browser","url"})
	    public void LaunchBrowser(String browser,String app) throws Exception {

	 

	        if(browser.equalsIgnoreCase("firefox")){
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        }
	        else if(browser.equalsIgnoreCase("chrome")){
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        }
	        else if(browser.equalsIgnoreCase("edge")){
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	        }
	        else if(browser.equalsIgnoreCase("ie")){
	            WebDriverManager.iedriver().setup();
	            driver = new InternetExplorerDriver();
	        }
	        else{
	            //If no browser passed throw exception
	            throw new Exception("Browser is not correct");
	        }
	                
	        driver.get(app);
	    }

	 

	        
	    @Test
	    public void OrangeHRM_Login() {
	            //driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	            driver.findElement(By.name("txtUsername")).clear();
	            driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	            driver.findElement(By.name("txtPassword")).clear();
	            driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	            driver.findElement(By.id("btnLogin")).click();
	            String Element = driver.findElement(By.linkText("Dashboard")).getText();
	            System.out.println(Element);

	 

	    }
	    @AfterTest
	    public void CloseBrowser() {
	        driver.quit();
	    }

	 
}

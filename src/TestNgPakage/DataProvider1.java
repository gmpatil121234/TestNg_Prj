package TestNgPakage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataProvider1 {
  @Test
  public void dtPrd() throws IOException {
	 
		     
	      File file = new File("F:\\Selenium Resources\\SeleniumTest\\src\\test\\resources\\OR.properties");
	     
	      FileInputStream fInput= new FileInputStream(file);
	     
	      Properties prop = new Properties();
	     
	      prop.load(fInput);
	     
	      System.out.println(prop.getProperty("objUsername"));
	  }
  
  
  
	  
  
}

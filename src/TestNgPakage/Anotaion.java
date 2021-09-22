package TestNgPakage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Anotaion {
	
	
	@Test(priority=2)
	void test1() {
		System.out.println("running test 1");
	}
	
	@Test(enabled=false)
	void test3() {
		System.out.println("running test 1");
	}
 
 
	@Test(priority=1)
	void test2() {
		System.out.println("running test 2");
	}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("running beforeMethod2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("running afterMethod");
  }

  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("running afterMethod");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("running afterMethod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("running afterMethod");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("running afterMethod");
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}

package BdynamicTestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
 @Test
public void testcase1() {
System.out.println("testcase1");
  }
 
 @Test
 public void testcase2() {
 System.out.println("testcase2");
   }
 @BeforeMethod //will invoked before  test method/test case
public void beforeMethod() {
System.out.println("testcaselevel =start");
  }

 @AfterMethod //will invoked after test method/test case
 public void afterMethod() {
System.out.println("testcaselevel =end");
  }

  @BeforeClass //will run before 1st test case only
  public void beforeClass() {
System.out.println("class level= start before 1st test case only");
  }

  @AfterClass  //will run after 1st test case only
  public void afterClass() {
	  System.out.println("class level= end after last test case only");
  }

  @BeforeTest
  public void beforeTest() {
  System.out.println("modual level =start");
 
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("modual level =end");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("project level=start");
  }

  @AfterSuite
  public void afterSuite() {
System.out.println("project level=end");
  }}


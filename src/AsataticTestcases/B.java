package AsataticTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
@Test(priority =1)
public void checkTitle()
{
System.setProperty("webdriver.chrome.driver", "F:\\driver\\chrome driver\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver();
driver.get("file:///F:/selenium%20(jbk)/Offline%20Website/index.html");
String actual=driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
String expected="Java By Kiran";
Assert.assertEquals(actual, expected);
driver.close();
System.out.println("checktitle1");
}
@Test(priority =2)
public void checkSubTitle()
{
System.setProperty("webdriver.chrome.driver", "F:\\driver\\chrome driver\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver();
driver.get("file:///F:/selenium%20(jbk)/Offline%20Website/index.html");
String actual=driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText();
String expected="JAVA | SELENIUM | PYTHON";
Assert.assertEquals(actual, expected);
driver.close();
System.out.println("2");
}
@Test(priority =4,description ="check text")
public void checkStartMsg()
{
System.setProperty("webdriver.chrome.driver", "F:\\driver\\chrome driver\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver();
driver.get("file:///F:/selenium%20(jbk)/Offline%20Website/index.html");
String actual=driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
String expected="Sign in to start your session";
Assert.assertEquals(actual, expected);
driver.close();
System.out.println("4");
}

  @Test(description = "enter valid data")
  public void logincheck() {
  System.setProperty("webdriver.chrome.driver","F:\\driver\\chrome driver\\chromedriver.exe"); 
  WebDriver driver=new ChromeDriver();
  driver.get("file:///F:/selenium%20(jbk)/Offline%20Website/index.html");
  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click(); 
  String actual=driver.getTitle();
  String expected="JavaByKiran | Dashboard";
  Assert.assertEquals(actual, expected); 
  driver.close(); 
  System.out.println("defaultpority");
  }
  
  @Test (dependsOnMethods = {"logincheck"})
  public void checkerrormsg() {
  System.setProperty("webdriver.chrome.driver","F:\\driver\\chrome driver\\chromedriver.exe"); 
  WebDriver driver=new ChromeDriver();
  driver.get("file:///F:/selenium%20(jbk)/Offline%20Website/index.html");
  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("");
  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("");
  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click(); 
  String actual=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
  String expected="Please enter email.";
  Assert.assertEquals(actual, expected); 
  driver.close(); 
  }



}

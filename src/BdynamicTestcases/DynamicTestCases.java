package BdynamicTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicTestCases {
@Test
public void checkTitle()
{
WebDriver driver=UtilityClass.openBrowser("chrome");
UtilityClass.openUrl(driver, "file:///F:/selenium%20(jbk)/Offline%20Website/index.html");
Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
UtilityClass.closeBrowser(driver);
}

@Test
public void checklebal1()
{
WebDriver driver=UtilityClass.openBrowser("chrome");
UtilityClass.openUrl(driver, "file:///F:/selenium%20(jbk)/Offline%20Website/index.html");
String actual=UtilityClass.text(driver, "xpath", "/html/body/div/div[1]/a/b");
String expected="Java By Kiran";
UtilityClass.closeBrowser(driver);
Assert.assertEquals(actual, expected);
}
@Test
public void checklebal2()
{
WebDriver driver=UtilityClass.openBrowser("chrome");
UtilityClass.openUrl(driver, "file:///F:/selenium%20(jbk)/Offline%20Website/index.html");
String actual=UtilityClass.text(driver,"xpath","/html/body/div/div[1]/a/h4");
String expected="JAVA | SELENIUM | PYTHON";
UtilityClass.closeBrowser(driver);
Assert.assertEquals(actual, expected);
}

@Test 
public void checkerrormsg() {
WebDriver driver=UtilityClass.openBrowser("chrome");
UtilityClass.openUrl(driver, "file:///F:/selenium%20(jbk)/Offline%20Website/index.html");
UtilityClass.enterText(driver, "xpath", "/html/body/div/div[2]/form/div[1]/input", "");
UtilityClass.enterText(driver, "xpath", "/html/body/div/div[2]/form/div[2]/input", "");
UtilityClass.clickButton(driver, "xpath", "/html/body/div/div[2]/form/div[3]/div/button");
String actual=UtilityClass.text(driver, "xpath","/html/body/div/div[2]/form/div[1]/div");
String expected="Please enter email.";
Assert.assertEquals(actual, expected);
}
}

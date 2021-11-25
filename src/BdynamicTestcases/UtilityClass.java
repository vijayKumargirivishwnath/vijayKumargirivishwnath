package BdynamicTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
//load and open browser 
public static WebDriver openBrowser(String browsername)
{
WebDriver driver=null;
if(browsername.equals("chrome"))
{
System.setProperty("webdriver.chrome.driver", "F:\\driver\\chrome driver\\chromedriver.exe");
driver=new ChromeDriver();	
}
if(browsername.equals("firefox"))
{
System.setProperty("webdriver.gecko.driver", "F:\\driver\\geckodriver driver\\geckodriver.exe");
driver=new FirefoxDriver();	
}
if(browsername.equals("ie"))
{
System.setProperty("webdriver.ie.driver", "F:\\driver\\ie driver\\IEDriverserver.exe");
driver=new InternetExplorerDriver();	
}
return driver;
}

public static void openUrl(WebDriver driver,String urlToOpen)
{
driver.get(urlToOpen);	
}

public static void enterText(WebDriver driver,String locname,String locvalue,String datatoenter)
{
if(locname.equals("id"))
{
driver.findElement(By.id(locvalue)).sendKeys(datatoenter);
}
if(locname.equals("xpath"))
{
driver.findElement(By.xpath(locvalue)).sendKeys(datatoenter);
}
if(locname.equals("name"))
{
driver.findElement(By.name(locvalue)).sendKeys(datatoenter);
}
if(locname.equals("css"))
{
driver.findElement(By.cssSelector(locvalue)).sendKeys(datatoenter);
}
if(locname.equals("tagname"))
{
driver.findElement(By.tagName(locvalue)).sendKeys(datatoenter);
}
}
public static void clickButton(WebDriver driver,String locname,String locvalue)
{
	if(locname.equals("id"))
	{
	driver.findElement(By.id(locvalue)).click();
	}
	if(locname.equals("xpath"))
	{
	driver.findElement(By.xpath(locvalue)).click();
	}
	if(locname.equals("name"))
	{
	driver.findElement(By.name(locvalue)).click();
	}
	if(locname.equals("css"))
	{
	driver.findElement(By.cssSelector(locvalue)).click();
	}
	if(locname.equals("tagname"))
	{
	driver.findElement(By.tagName(locvalue)).click();
	}
	}

public static String text(WebDriver driver,String locname,String locvalue)
{
	String actual=null;
	if(locname.equals("id"))
	{
	actual=driver.findElement(By.id(locvalue)).getText();
	}
	if(locname.equals("xpath"))
	{
	actual=driver.findElement(By.xpath(locvalue)).getText();
	}
	if(locname.equals("name"))
	{
	actual=driver.findElement(By.name(locvalue)).getText();
	}
	if(locname.equals("css"))
	{
	actual=driver.findElement(By.cssSelector(locvalue)).getText();
	}
	if(locname.equals("tagname"))
	{
	actual=driver.findElement(By.tagName(locvalue)).getText();
    }
	return actual;
	}

public static void navigate(WebDriver driver,String navigateto) 
{
if(navigateto.equalsIgnoreCase("back"))
{
driver.navigate().back();
}
if(navigateto.equalsIgnoreCase("forword"))
{
driver.navigate().forward();
}
}

public static void closeBrowser(WebDriver driver)
{
driver.close();
}

public static WebElement element(WebDriver driver,String locname,String locvalue)
{
WebElement we=null;
if(locname.contains("id"))
{
we=driver.findElement(By.id(locvalue))	;
}
if(locname.contains("xpath"))
{
we=driver.findElement(By.xpath(locvalue))	;
}
return we;
}

//select method dynamic
static WebElement we;
public static void selectmethod(String methodname, String methodvalue)
{
Select s=new Select(we);
if(methodname.equalsIgnoreCase("byvisible"))	
{
s.selectByVisibleText(methodvalue);
}

else if(methodname.equalsIgnoreCase("byvalue"))	
{
s.selectByValue(methodvalue);
}
else
{
s.selectByIndex(0);
}
}}
	






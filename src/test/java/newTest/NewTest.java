package newTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Generated by Selenium IDE
//import org.junit;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class NewTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@BeforeClass
public void setUp() {	
 System.setProperty("webdriver.firefox.bin","D:\\firefox\\firefox.exe");  
 System.setProperty("webdriver.gecko.driver","D:\\firefox\\geckodriver.exe");
 driver = new FirefoxDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@AfterClass
public void tearDown() {
 driver.quit();
}
@Test
public void test1() {/*
 driver.get("https://www.baidu.com/");
 driver.manage().window().setSize(new Dimension(1382, 744));
 driver.findElement(By.id("kw")).sendKeys("ϰ���");
 driver.findElement(By.id("su")).click();
 {
   WebElement element = driver.findElement(By.id("su"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
*/}
}


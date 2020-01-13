package Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseLine {
	protected WebDriver driver=null;
	
  @BeforeTest
  public void Config()
  {
			
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Framwork\\Webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.peacksoft.com");
			}
	 
  @BeforeMethod
  public void Window()
    { driver.manage().window().maximize();
  }
@AfterTest
public void Clean()
{
	//driver.close();
}
  
  
  }



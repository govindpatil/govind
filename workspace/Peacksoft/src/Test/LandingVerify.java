package Test;
import Data.*;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Data.BaseLine;

public class LandingVerify extends BaseLine{
	

  @Test
public void Landing()
{
 String CurrentURL = driver.getCurrentUrl();
 System.out.println(CurrentURL);
 
}
  
  
  
  
}

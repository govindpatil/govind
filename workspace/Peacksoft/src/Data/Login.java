package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends BaseLine {
  @BeforeTest
  public void Logininto() {
	  driver.findElement(By.linkText("LOGIN")).click();
	  
  }
  @Test
  public void EnterCredentials()
  {
	  driver.findElement(By.name("j_username")).sendKeys("rajeshr");
	  driver.findElement(By.name("j_password")).sendKeys("rajesh@soft");
	  driver.findElement(By.className("btn-primary")).click();
	  
	  
  }
  
  
}

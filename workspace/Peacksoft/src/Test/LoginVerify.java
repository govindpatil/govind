package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Data.Login;

public class LoginVerify extends Login{
  @Test
  public void VerifyLogin() {
	  String PgaeTitle = driver.getTitle();
	  String LoginTetx= "Login To Peacksoft";
	  
	 if(PgaeTitle.contains("Login"))
	 {
		 System.out.println("user Navigated to correct page that is" +PgaeTitle);
	 }
	 else {
		 System.out.println("User navigated to wrong page");
	  
	  }
  }
  @Test
  public void verifyedirection()
  {
  String Aftrlogin=driver.getTitle();
  System.out.println("After Login user navigated to" +Aftrlogin);
  
}
}
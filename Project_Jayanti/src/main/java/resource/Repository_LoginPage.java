package resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Repository_LoginPage {
	
	public WebDriver driver;
	
     	By Email=By.id("user_email");
     	By Password=By.id("user_password");
     	By loginbtn=By.xpath("//input[@name='commit']");
     	By ForgotPassword=By.cssSelector("[href*='password/new']");
     public Repository_LoginPage(WebDriver driver) {

	 this.driver=driver;
	 
     }
     public  Repository_ResetPassword ResetPassword()
     {
    	 driver.findElement(ForgotPassword).click();
    	 return new Repository_ResetPassword(driver);
    	 
    	 
    	 
    	 
     }

    public  WebElement EmailField()
	{
		return driver.findElement(Email);
		
	}
   public  WebElement PasswordField()
   {
	return driver.findElement(Password);
   }
  public WebElement Loginbtn()
  {
	  return driver.findElement(loginbtn);
  }
}


package resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Repository_ResetPassword {
	
	public WebDriver driver;
	    
     	By Sendmeinstruction = By.xpath("//input[@type='submit']");
     	By Email =By.xpath("//input[@type='email']");

		
		
     public Repository_ResetPassword(WebDriver driver) {

	 this.driver=driver;
	 
     }

  

   public WebElement Email()
   {
	 return  driver.findElement(Email);
	   
   }
   public WebElement SendMeInstruction()
   {
	   return driver.findElement(Sendmeinstruction);
   }
}


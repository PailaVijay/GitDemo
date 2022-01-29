package resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Repository_HomePage {
	
	public WebDriver driver;
	
	By LoginBtn=By.xpath("//span[text()='Login']");
	By Title=By.xpath("//h2[contains(text(),'Featured Courses')]");
    By navigationBar=By.xpath("//nav[@class='navbar-collapse collapse']");
		
     public Repository_HomePage(WebDriver driver) {
     this.driver=driver;
	 
	}

    public  Repository_LoginPage LoginButton()
	{
		 driver.findElement(LoginBtn).click();
		Repository_LoginPage cred= new Repository_LoginPage(driver);
		return cred;
	}
   public WebElement TitleBox()
   {
	   return driver.findElement(Title);
   }
   public WebElement navigate()
   {
	  return driver.findElement(navigationBar);
   }
}

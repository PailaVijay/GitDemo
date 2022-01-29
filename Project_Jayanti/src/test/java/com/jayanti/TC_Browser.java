package com.jayanti;


import java.io.IOException;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resource.Repository_HomePage;
import resource.Repository_LoginPage;
import resource.Repository_ResetPassword;

public class TC_Browser extends Browser_TC {
 public WebDriver driver;
	public static Logger log= LogManager.getLogger(TC_Browser.class.getName());
@BeforeTest
public void initialize() throws IOException
{
	driver=InitializeDriver();
	log.info("initialize the browser");
}
@Test(dataProvider = "getData")
	public void HomePage(String username,String Password) throws IOException
	{
        
	
    driver.get(prop.getProperty("url"));
	log.info("home page should be displayed");
	Repository_HomePage rh=new Repository_HomePage(driver);
	Repository_LoginPage cred=rh.LoginButton();
	cred.EmailField().sendKeys(username);
	cred.PasswordField().sendKeys(Password);
	log.info("successfully login"); 	
     	
	
	Repository_ResetPassword rp=new Repository_ResetPassword(driver);
	cred.ResetPassword();
    rp.Email().sendKeys("vijay");
	rp.SendMeInstruction().click();	
		
		
		
	   
		
		
	}

@DataProvider
		public Object[][] getData()
		{
		Object[][]	data= new Object[2][2];
		data[0][0]="abc@123";
		data[0][1]="1234sde5";

		data [1][0]="kjggj@ee";
		data [1][1]="1246sfg";
		
		return data;
				
			
		}	
		
@AfterTest
public void closebrowser()
{
	driver.close();
	}
	
	

}

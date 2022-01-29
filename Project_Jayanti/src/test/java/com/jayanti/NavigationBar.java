package com.jayanti;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resource.Repository_HomePage;
import resource.Repository_LoginPage;

public class NavigationBar extends Browser_TC {
	public static Logger log= LogManager.getLogger(TC_Browser.class.getName());
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
	    driver.get(prop.getProperty("url"));
		
	}
@Test()
	public void HomePage() throws IOException
	{
	    
		Repository_HomePage rh=new Repository_HomePage(driver);
       
      
       Assert.assertTrue(rh.navigate().isDisplayed());
	log.info("navigation bar should be displayed");	
	}	

@AfterTest
public void closebrowser()
{
	driver.close();
}
		
		
	}
	



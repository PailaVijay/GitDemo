package com.jayanti;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Browser_TC {
public WebDriver driver;
public Properties prop;
	public WebDriver InitializeDriver() throws IOException
	{
		
    prop= new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\Vijay\\eclipse-workspace\\Project_Jayanti\\src\\main\\java\\Data.properties");
	prop.load(fis);
	String BrowserName= prop.getProperty("browser");
	
	System.out.print(BrowserName);
	
	if(BrowserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		 driver= new ChromeDriver();
	}
	
	else if(BrowserName.equals("firefox"))
	{
		 driver= new FirefoxDriver();
	}
	else if(BrowserName.equals("InternetExplorer"))
	{
	
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	 public String getScreenshotPath(String testCaseName,WebDriver driver) throws IOException
	 {
		 
		 TakesScreenshot ts= (TakesScreenshot) driver;
		  File source=ts.getScreenshotAs(OutputType.FILE);
		  String destinationFile= System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		  FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
		 
	 }
	
	
	
	
	
	
	
	
	
	
	}
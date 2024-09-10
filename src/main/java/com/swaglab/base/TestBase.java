package com.swaglab.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.swaglab.util.PropertiesRead;

public class TestBase 
{
	public static WebDriver driver;
	public static PropertiesRead prop;
	
	
	public TestBase ()
	{
		//load the properties
		prop=new PropertiesRead();
		
	}
	
	public static void initialize()
	{
		String bname=prop.getData("browser");
		if(bname.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}if(bname.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		if(bname.equals("edge"))
		{
			driver=new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		
	}
	
	

}

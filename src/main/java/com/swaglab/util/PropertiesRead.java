package com.swaglab.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead 
{
	 public Properties p1;
	public PropertiesRead()
	{
		 //set the path of the file to read
		  File f1=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\swaglab\\config\\config.properties");
		  
		  //to read properties file --Java Class Properties
		p1 =new Properties();
		  //to read data in stream
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			 //load the file
			  p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		}
	
	public String getData(String key)
	{
		return p1.getProperty(key);
	}
}

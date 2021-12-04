package com.base.zomato;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties pro;
				
								TestBase()
								{
									try{
									File source =new File("E:/Selenium Programs/Zomatoapp/src/main/java/com/config/zomato/Configuration.property");
									FileInputStream fis=new FileInputStream(source);
									pro=new Properties();
									pro.load(fis);
									}catch(Exception e){System.out.println("Exception Catch:-"+e.getMessage());}
								}
	
	
}

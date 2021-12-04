package com.base.zomato;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
								public static void initialization()
								{
									String browser1=pro.getProperty("browser");
									
									if(browser1.equals("chrome"))
									{
										System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver_win32\\chromedriver.exe");
										driver=new ChromeDriver();
										driver.manage().deleteAllCookies();
										driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
										driver.manage().window().maximize();
										driver.get(pro.getProperty("url"));
									}
								}
}

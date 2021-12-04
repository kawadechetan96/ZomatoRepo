package com.testcases.zomato;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.zomato.TestBase;
import com.pages.zomato.DelhiPage;
import com.pages.zomato.HomePage;

public class HomePageTest extends TestBase{
	
					HomePage homepage;
					HomePageTest()
					{
						super();
					}
					
					@BeforeMethod
					public void setup()
					{
						initialization();
						homepage=new HomePage();
					}
					
					@Test(priority=1)
					public   void delhi_link_test()
					{
						homepage.verify_delhi_link1();
						String url=driver.getTitle();
						System.out.println(url);
						Assert.assertEquals(url, "Checkout Best Food Places To Eat In Delhi NCR | Zomato");
					}
					
					@Test(priority=2)
					public   void kolkata_link_test()
					{
						homepage.verify_kolkata_link();
						String url=driver.getTitle();
						System.out.println(url);
						Assert.assertEquals(url, "Checkout Best Food Places To Eat In Kolkata | Zomato");
					}
					@AfterMethod
					public void teardown()
					{
						driver.close();
					}
}

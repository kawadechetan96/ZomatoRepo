package com.testcases.zomato;

import org.testng.annotations.Test;

import com.base.zomato.TestBase;

public class HomePageTest extends TestBase{
	
	
					HomePageTest()
					{
						super();
					}
					
					@Test(priority=1)
					public void setup()
					{
						initialization();
					}
}

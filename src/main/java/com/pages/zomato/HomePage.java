package com.pages.zomato;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.zomato.TestBase;

public class HomePage extends TestBase {
	
	
							
	
								@FindBy(xpath="//a[text()='Delhi NCR']")
								WebElement delhi;
								
								@FindBy(xpath="//a[text()='Kolkata']")
								WebElement kolkata;
								
								@FindBy(xpath="//a[text()='Mumbai']")
								WebElement mumbai;
								
								@FindBy(xpath="//a[text()='Pune']")
								WebElement pune;
	
								public HomePage()
								{
									PageFactory.initElements(driver, this);
								}
	
								
								public  DelhiPage verify_delhi_link1()
								{
									delhi.click();
									return new DelhiPage();
								}
								
								public  KolkataPage verify_kolkata_link()
								{
									delhi.click();
									return new KolkataPage();
								}
	

}

package com.lpg.qaTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.lpgBase.TestBase;
import com.lpg.qa.lpgPages.InvalidAUPLogin;


public class  InvalidAUPLoginTest extends TestBase{

	WebDriver driver;
   
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
	//	TestBase.driver.close();
	}
	
	
	@Test
	public void  InvalidAUPLoginPageTest() throws InterruptedException {
		InvalidAUPLogin  DL=new InvalidAUPLogin(TestBase.driver); 
		DL.verifyMyerpagancycode();
		DL.verifyMyerpUserid();
		DL.verifyMyerpPassword();
		DL.VerifyandClickonMyerpLoginwithoutBtn1();
	}
}

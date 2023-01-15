package com.lpg.qaTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.lpgBase.TestBase;
import com.lpg.qa.lpgPages.Login;

public class LoginTest  extends TestBase{

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
	public void LoginPageTest() throws InterruptedException {
		Login lpg=new Login(TestBase.driver); 
		//lpg.VerifyandClickonMyerpLoginwithoutBtn1();
		lpg.verifyMyerpagancycode();
		lpg.verifyMyerpUserid();
		lpg.verifyMyerpPassword();
		lpg.VerifyandClickonMyerpLoginBtn();
		
	   
	} 
}

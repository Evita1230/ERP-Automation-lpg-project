package com.lpg.qa.tvmoduletestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.lpgBase.TestBase;
import com.lpg.qa.tvmodules.PartialTVOut;


		public class PartialTVOutTest extends TestBase{

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
			public void  PartialTVOutPageTest() throws InterruptedException {
				com.lpg.qa.tvmodules.PartialTVOut tvto=new  PartialTVOut(TestBase.driver); 
				
				 tvto.verifyMyerpagancycode();
				 tvto.verifyMyerpUserid();
				 tvto.verifyMyerpPassword();
				 tvto.VerifyandClickonMyerpLoginBtn();
				 tvto.VerifyMyerpTVModule();
				 tvto.VerifyMyerpPartialTVtvoutForm();
				 tvto.VerifyMyerpPTVOutIfConsumernotAvailbleCHK();
				 tvto.VerifyMyerpPTVtvoutConsumerNum();
				 tvto.VerifyMyerpTVSelectProduct();
				 tvto.VerifyMyerpTVNumberOfCylender();
				 tvto.VerifyMyerpTVSelectGodown();
				 tvto.VerifyMyerpTVtvOutSubmitBtn();
				
				 
				 
			}
		}
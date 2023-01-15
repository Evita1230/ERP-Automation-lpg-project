package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.GodownTransaction.UpdateERV;
import com.lpg.qa.lpgBase.TestBase;


		public  class UpdateERVTest extends TestBase{

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
			public void UpdateERVPageTest() throws InterruptedException {
				UpdateERV erv=new  UpdateERV(TestBase.driver); 
				
				 erv.verifyMyerpagancycode();
				 erv.verifyMyerpUserid();
				 erv.verifyMyerpPassword();
				 erv.VerifyandClickonMyerpLoginBtn();
				 erv.VerifyandClickonMyerpGodownTransactionModule();
				 erv.VerifyandClickonMyerpGTUpdateERVForm();
				 erv.VerifyandClickonMyerpErvNumber();
				 erv.VerifyandClickonMyerpClearBtn();
				 erv.VerifyandClickonMyerpErvNumber();
				 erv.VerifyandClickonMyerpSearchBtn();
				 
			}
		}
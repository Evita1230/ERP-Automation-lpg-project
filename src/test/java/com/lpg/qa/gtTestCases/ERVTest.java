package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.GodownTransaction.ERV;
import com.lpg.qa.lpgBase.TestBase;


		public   class ERVTest extends TestBase{

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
			public void ERVPageTest() throws InterruptedException {
				ERV erv=new  ERV(TestBase.driver); 
				
				 erv.verifyMyerpagancycode();
				 erv.verifyMyerpUserid();
				 erv.verifyMyerpPassword();
				 erv.VerifyandClickonMyerpLoginBtn();
				 erv.VerifyandClickonMyerpGodownTransactionModule();
				 erv.VerifyandClickonMyerpGTERVForm();
				 erv.VerifyMyerpERVSelectGodown();
				 erv.VerifyMyerpERVVehicleNumber();
				 erv.VerifyandClickonMyerpEProductTextBox();
				 erv.VerifyandClickonMyerpSoundQantityTextBox();
				 erv.VerifyandClickonMyerpDefective();
				 erv.VerifyandClickonMyerpClearBtn();
				 erv.VerifyandClickonMyerpSumitERVBtn();
				 erv.VerifyandClickonMyerpXMIERV();
				 erv.VerifyMyerpERVSelectGodown();
				 erv.VerifyMyerpERVVehicleNumber();
				 erv.VerifyandClickonMyerpEProductTextBox();
				 erv.VerifyandClickonMyerpSoundQantityTextBox();
				 erv.VerifyandClickonMyerpDefective();
				 erv.VerifyandClickonMyerpSumitERVBtn();
				 
			}
		}

package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.GodownTransaction.DomesticDelievery;
import com.lpg.qa.lpgBase.TestBase;


		public class DomesticDelieveryTest  extends TestBase{

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
			public void DomesticDeliveryPageTest() throws InterruptedException {
				DomesticDelievery erv=new  DomesticDelievery(TestBase.driver); 
				
				 erv.verifyMyerpagancycode();
				 erv.verifyMyerpUserid();
				 erv.verifyMyerpPassword();
				 erv.VerifyandClickonMyerpLoginBtn();
				 erv.VerifyandClickonMyerpGodownTransactionModule();
				 erv.VerifyandClickonMyerpGTDomesticDeliveryForm();
				 erv.VerifyMyerpTVSelectProduct();
				 erv.VerifyandClickonMyerpGTDDSearchBtn();
				 erv.VerifyandClickonMyerpGTDDEmptyCyl();
				 erv.VerifyandClickonMyerpGTDDFullCyl();
				 erv.VerifyandClickonMyerpGTDDESubmitBtn();
			}
		}
package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.GodownTransaction.UpdatedCommercialDelivery;
import com.lpg.qa.lpgBase.TestBase;


public class UpdatedCommercialDeliveryTest  extends TestBase{

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
			public void UpdatedCommercialDeliveryPageTest() throws InterruptedException {
				UpdatedCommercialDelivery ucd=new  UpdatedCommercialDelivery(TestBase.driver); 
				
				 ucd.verifyMyerpagancycode();
				 ucd.verifyMyerpUserid();
				 ucd.verifyMyerpPassword();
				 ucd.VerifyandClickonMyerpLoginBtn();
				 ucd.VerifyandClickonMyerpGodownTransactionModule();
				 ucd.VerifyandClickonMyerpGTUpdatedCommercialDeliveryForm();
				 ucd.VerifyandClickonMyerpUCDGetDtaBtn();
				 ucd.VerifyMyerpUSelectGodown();
				 ucd.VerifyandClickonMyerpGTSelectProduct();
				 ucd.VerifyandClickonMyerpUCDFullCylTxtbox();
				 ucd.VerifyandClickonMyerpUCDEmptyCylTxtbox();
				 ucd.VerifyandClickonMyerpUCDSVCylTextbox();
				 ucd.VerifyandClickonMyerpUCDSubmitBtn();
				 
				 
				 
			}
		}

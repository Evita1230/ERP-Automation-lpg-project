package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.GodownTransaction.PartialPurchase;
import com.lpg.qa.lpgBase.TestBase;


 public class PartialPurchaseTest extends TestBase{

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
			public void PartialPurchasePageTest() throws InterruptedException {
				PartialPurchase pp=new  PartialPurchase(TestBase.driver); 
				
				pp.verifyMyerpagancycode();
				pp.verifyMyerpUserid();
				pp.verifyMyerpPassword();
				pp.VerifyandClickonMyerpLoginBtn();
				pp.VerifyandClickonMyerpGodownTransactionModule();
				pp.VerifyandClickonMyerpGTPartialPurchaseForm();
				pp.VerifyandClickonMyerpGTPPInvoiceNumber();
				pp.VerifyandClickonMyerpGTPPErvNumber();
				pp.VerifyMyerpPPSelectGodown();
				pp.VerifyMyerpPPSelectVehicle();
				pp.VerifyandClickonMyerpGTPPProduct();
				pp.VerifyandClickonMyerpGTPPQauntity();
				pp.VerifyandClickonMyerpGTPPLost();
				pp.VerifyandClickonMyerpGTPPDefective();
				pp.VerifyandClickonMyerpGTPPSubmitBtn();
				
				
			
				 
				 }
		}

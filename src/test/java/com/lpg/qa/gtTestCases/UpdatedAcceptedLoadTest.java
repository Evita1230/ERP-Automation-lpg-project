package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.GodownTransaction.UpdatedAcceptedLoad;
import com.lpg.qa.lpgBase.TestBase;


		public  class UpdatedAcceptedLoadTest extends TestBase{

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
			public void UpdatedAcceptedLoadPageTest() throws InterruptedException {
				UpdatedAcceptedLoad ptvto=new  UpdatedAcceptedLoad(TestBase.driver); 
				
				 ptvto.verifyMyerpagancycode();
				 ptvto.verifyMyerpUserid();
				 ptvto.verifyMyerpPassword();
				 ptvto.VerifyandClickonMyerpLoginBtn();
				 ptvto.VerifyandClickonMyerpGodownTransactionModule();
				 ptvto.VerifyandClickonMyerpGTUpdatedAccepteLoadForm();
				 ptvto.VerifyandClickonMyerpGTInvoiceNumber();
				 ptvto.VerifyandClickonMyerpUALSearchButton();
				 
				 
			}
		}
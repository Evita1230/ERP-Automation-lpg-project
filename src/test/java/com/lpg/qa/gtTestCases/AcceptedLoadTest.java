package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.GodownTransaction.AcceptedLoad;
import com.lpg.qa.lpgBase.TestBase;


		public class AcceptedLoadTest extends TestBase{

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
			public void   AcceptedLoadPageTest() throws InterruptedException {
				 AcceptedLoad ptvto=new   AcceptedLoad(TestBase.driver); 
				
				 ptvto.verifyMyerpagancycode();
				 ptvto.verifyMyerpUserid();
				 ptvto.verifyMyerpPassword();
				 ptvto.VerifyandClickonMyerpLoginBtn();
				 ptvto.VerifyandClickonMyerpGodownTransactionModule();
				 ptvto.VerifyandClickonMyerpGTAccepteLoadForm();
				 ptvto.VerifyandClickonMyerpGTAccepteLoadInvoceNum();
				 ptvto.VerifyandClickonMyerpGTALsubmitbtn();
				 ptvto.VerifyandClickonMyerpGTInvoiceNumber();
				 ptvto.VerifyandClickonMyerpGTAccountTextBox();
				 ptvto.VerifyandClickonMyerpGTClearBtn();
				 ptvto.VerifyandClickonMyerpGTSubmitBtn();
				 ptvto.VerifyMyerpALSelectCompany();
				 ptvto.VerifyMyerpALSelectSupplier();
				 ptvto.VerifyandClickonMyerpALAccountTextbox();
				 ptvto.VerifyandClickonMyerpALSubmitBtn();
				 
			}
		}
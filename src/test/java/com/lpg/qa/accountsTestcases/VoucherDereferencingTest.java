package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.accountsPages.VoucherDereferencing;
import com.lpg.qa.lpgBase.TestBase;


 public class VoucherDereferencingTest  extends TestBase{

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
			public void VoucherDereferencingPageTest() throws InterruptedException {
				VoucherDereferencing vr=new  VoucherDereferencing(TestBase.driver); 
				
				vr.verifyMyerpagancycode();
				vr.verifyMyerpUserid();
				vr.verifyMyerpPassword();
				vr.VerifyandClickonMyerpLoginBtn();
				vr.VerifyandClickonMyerpAccountsModule();
				vr.VerifyandClickonMyerpVoucherDeReferencingForm();
				vr.VerifyandClickonMyerpVRSelectType();
				vr.VerifyandClickonMyerpVDRDocNumber();
				vr.VerifyandClickonMyerpVDRCleareBtn();
				vr.VerifyandClickonMyerpVRSelectType();
				vr.VerifyandClickonMyerpVDRDocNumber();
				vr.VerifyandClickonMyerpVRGetDataBtn();
				vr.VerifyandClickonMyerpVDRDeRefrenceBtn();
			}
 }
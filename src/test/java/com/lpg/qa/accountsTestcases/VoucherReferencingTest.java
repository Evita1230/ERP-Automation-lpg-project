package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.accountsPages.VoucherReferencing;
import com.lpg.qa.lpgBase.TestBase;


 public class VoucherReferencingTest  extends TestBase{

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
			public void VoucherReferencingPageTest() throws InterruptedException {
				VoucherReferencing vr=new  VoucherReferencing(TestBase.driver); 
				
				vr.verifyMyerpagancycode();
				vr.verifyMyerpUserid();
				vr.verifyMyerpPassword();
				vr.VerifyandClickonMyerpLoginBtn();
				vr.VerifyandClickonMyerpAccountsModule();
				vr.VerifyandClickonMyerpVoucherReferencingForm();
				vr.VerifyandClickonMyerpVRSelectDOCType();
				vr.VerifyandClickonMyerpVRSelectRefType();
				vr.VerifyandClickonVRAccountHeadTextBox();
				vr.VerifyandClickonMyerpVRSelectDOCID();
				vr.VerifyandClickonMyerpVRSelectDocDate();
				vr.VerifyandClickonMyerpVRSelectRefDate();
				vr.VerifyandClickonMyerpVRAmountToAdjust();
				vr.VerifyandClickonMyerpVRClearBtn();
				vr.VerifyandClickonMyerpVRSaveBtn();
				
				 }
		}

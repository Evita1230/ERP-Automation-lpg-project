package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.accountsPages.JournalVoucher;
import com.lpg.qa.lpgBase.TestBase;


 public class JournalVoucherTest  extends TestBase{

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
			public void JournalVoucherPageTest() throws InterruptedException {
				JournalVoucher jv=new  JournalVoucher(TestBase.driver); 
				
				jv.verifyMyerpagancycode();
				jv.verifyMyerpUserid();
				jv.verifyMyerpPassword();
				jv.VerifyandClickonMyerpLoginBtn();
				jv.VerifyandClickonMyerpAccountsModule();
				jv.VerifyandClickonMyerpJournalVoucherForm();
				jv.VerifyandClickonMyerpJVTransactionDate();
				jv.VerifyandClickonMyerpJVNarration();
				jv.VerifyandClickonMyerpJVLedger();
				jv.VerifyandClickonMyerpJVAmount();
				jv.VerifyandClickonMyerpJVSelectDebitCredit();
			//	jv.VerifyandClickonMyerpJVNewbtn();
				jv.VerifyandClickonMyerpJVSavebtn();
				jv.VerifyandClickonMyerpJVAddHeaderbtn();
				jv.VerifyandClickonMyerpJVLedger();
				jv.VerifyandClickonMyerpJVAmount();
				jv.VerifyandClickonMyerpJVSavebtn();
				
				
				 }
		}

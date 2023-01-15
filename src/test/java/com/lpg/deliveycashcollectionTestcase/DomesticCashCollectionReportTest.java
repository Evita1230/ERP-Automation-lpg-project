package com.lpg.deliveycashcollectionTestcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.deliverycashcollection.DomesticCashCollectionReport;
import com.lpg.qa.lpgBase.TestBase;


		public class DomesticCashCollectionReportTest extends TestBase{

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
			public void    DomesticCashCollectionReportPageTest() throws InterruptedException {
				DomesticCashCollectionReport ddr=new DomesticCashCollectionReport(TestBase.driver); 
				
				 ddr.verifyMyerpagancycode();
				 ddr.verifyMyerpUserid();
				 ddr.verifyMyerpPassword();
				 ddr.VerifyandClickonMyerpLoginBtn();
				 ddr.VerifyandClickonMyerpGeneralReport();
				 ddr.VerifyandClickonMyerpGRDomesticDeliveryReport();
				 ddr.VerifyandClickonMyerpPlaseSelectDate();
				 ddr.VerifyandClickonMyerpGetdataBtn();
				 
				 
			}
		}
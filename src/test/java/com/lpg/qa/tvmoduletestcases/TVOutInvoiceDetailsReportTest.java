package com.lpg.qa.tvmoduletestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.lpgBase.TestBase;
import com.lpg.qa.tvmodules.TVOutInvoiceDetailsReport;


		public class TVOutInvoiceDetailsReportTest extends TestBase{

			WebDriver driver;
		   
			@BeforeClass
			public void setup() {
				intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
			//	 TestBase.driver.close();
			}	
			
			@Test
			public void  TVOutInvoiceDetailsReporttPageTest() throws InterruptedException {
				TVOutInvoiceDetailsReport tvire=new  TVOutInvoiceDetailsReport(TestBase.driver); 
				tvire.verifyMyerpagancycode();
				tvire.verifyMyerpUserid();
				tvire.verifyMyerpPassword();
				tvire.VerifyandClickonMyerpLoginBtn();
				tvire.VerifyMyerpGenralReportModule();
				tvire.VerifyMyerpTVOUTInvoiceDetailReport();
				tvire.VerifyMyerpTVoutinvoicedetailsReportDocnum();
				tvire.VerifyMyerpGRTVoInvoiveDetailsReportGetDataBtn();
	
				
	         }
	   }
		
		
		
package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.GodownTransaction.DeliverTimeStatement;
import com.lpg.qa.lpgBase.TestBase;


		public class DeliverTimeStatementTest extends TestBase{

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
			public void    DeliverTimeStatementPageTest() throws InterruptedException {
				DeliverTimeStatement ddr=new DeliverTimeStatement(TestBase.driver); 
				
				 ddr.verifyMyerpagancycode();
				 ddr.verifyMyerpUserid();
				 ddr.verifyMyerpPassword();
				 ddr.VerifyandClickonMyerpLoginBtn();
				 ddr.VerifyandClickonMyerpGeneralReport();
				 ddr.VerifyandClickonMyerpDeliveryTimeStatementReport();
				 ddr.VerifyandClickonMyerpPlaseSelectDate();
				 ddr.VerifyMyerpGRDTSSelectProduct();
				 ddr.VerifyMyerpALSelectDeliveryMan();
				 ddr.VerifyandClickonMyerpGetdataBtn();
				 
				 
			}
		}

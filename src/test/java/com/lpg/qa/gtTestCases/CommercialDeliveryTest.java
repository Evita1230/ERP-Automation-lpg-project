package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.GodownTransaction.CommercialDelivery;
import com.lpg.qa.lpgBase.TestBase;


public class CommercialDeliveryTest  extends TestBase{

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
			public void CommercialDeliveryPageTest() throws InterruptedException {
				CommercialDelivery cd=new  CommercialDelivery(TestBase.driver); 
				
				 cd.verifyMyerpagancycode();
				 cd.verifyMyerpUserid();
				 cd.verifyMyerpPassword();
				 cd.VerifyandClickonMyerpLoginBtn();
				 cd.VerifyandClickonMyerpGodownTransactionModule();
				 cd.VerifyandClickonMyerpGTCommercialDeliveryForm();
				 cd.VerifyMyerpTVSelectGodown();
				 cd.VerifyMyerpTVSelectDeliveryMan();
				 cd.VerifyandClickonMyerpGTSelectProductType();
				 cd.VerifyandClickonMyerpFullCyl();
				 cd.VerifyandClickonMyerpEmptyCyl();
				 cd.VerifyandClickonMyerpGTclearBtn();
				 cd.VerifyMyerpTVSelectGodown();
				 cd.VerifyMyerpTVSelectDeliveryMan();
				 cd.VerifyandClickonMyerpGTSelectProductType();
				 cd.VerifyandClickonMyerpFullCyl();
				 cd.VerifyandClickonMyerpEmptyCyl();
				 cd.VerifyandClickonMyerpGTSubmitBtn();
				 
				 
			}
		}
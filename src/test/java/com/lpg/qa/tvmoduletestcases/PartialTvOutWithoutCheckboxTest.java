package com.lpg.qa.tvmoduletestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.lpgBase.TestBase;
import com.lpg.qa.tvmodules.PartialTvOutWithoutCheckbox;


public class PartialTvOutWithoutCheckboxTest extends TestBase{

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
			public void  PartialTvOutWithoutCheckboxPageTest() throws InterruptedException {
				PartialTvOutWithoutCheckbox ptvto=new  PartialTvOutWithoutCheckbox(TestBase.driver); 
				
				 ptvto.verifyMyerpagancycode();
				 ptvto.verifyMyerpUserid();
				 ptvto.verifyMyerpPassword();
				 ptvto.VerifyandClickonMyerpLoginBtn();
				 ptvto.VerifyMyerpTVModule();
				 ptvto.VerifyMyerpPartialTVtvoutForm();
				 ptvto.VerifyMyerpPTVtvoutConsumerNum();
				 ptvto.VerifyMyerpTVtvOutGeyCylenderBtn();
				 ptvto.VerifyMyerpTVSelectGodown();
				ptvto.VerifyMyerpTVtvOutSubmitBtn();
				
				 
				 
			}
		}
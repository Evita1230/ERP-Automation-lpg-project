package com.lpg.qaTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.lpgBase.TestBase;
import com.lpg.qa.lpgPages.ParentProductCategory;
	
public class ParentProductCategoryTest  extends TestBase{

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
		public void ParentProductCategoryPageTest() throws InterruptedException {
			ParentProductCategory ps=new ParentProductCategory(TestBase.driver); 
			ps.verifyMyerpagancycode();
			ps.verifyMyerpUserid();
			ps.verifyMyerpPassword();
			ps.VerifyandClickonMyerpLoginBtn();
			ps.VerifyMyerpMasterModule();
			ps.VerifyMyerpGenralMasterModule();
			ps.VerifyMyerpParentProductCtegoryForm();
			ps.VerifyMyerpPCategoryName();
			ps.VerifyMyerpPActiveBtn();
			ps.VerifyMyerpPClearBtn();
			ps.VerifyMyerpPCategoryName1();
			ps.VerifyMyerpPActiveBtn1();
			ps.VerifyMyerpPSubmitBtn();
			ps.VerifyMyerpPSubmitOKBtn();
			ps.VerifyandClickonPSearchbar1();
			ps.VerifyMyerpPEditBtn();
			ps.VerifyMyerpPYesUpdateitBtn();
			ps.VerifyMyerpPCategoryName2();
			ps.VerifyMyerpPUpdateBtn();
			ps.VerifyMyerpPUpdateokBtn();
			ps.VerifyandClickonPSearchbar2();
			ps.VerifyMyerpPExportBtn();
			
		}
}

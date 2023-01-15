package com.lpg.qaTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.lpgBase.TestBase;
import com.lpg.qa.lpgPages.Designation;

 
	public class DesignationTest  extends TestBase{

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
		public void DesignationPageTest() throws InterruptedException {
			Designation des=new Designation(TestBase.driver);  
		des.verifyMyerpagancycode();
		des.verifyMyerpUserid();
		des.verifyMyerpPassword();
		des.VerifyandClickonMyerpLoginBtn();
		des.VerifyMyerpMasterModule();
		des.VerifyMyerpGenralMasterModule();
		des.VerifyDesignationform();
		des.VerifyDesignationName1();
		des.VerifyShortName1();
		des.VerifyDesignationActiveCheckbox1();
		des.VerifyDesignationClearbtn();
		des.VerifyDesignationName();
		des.VerifyShortName();
		des.VerifyDesignationActiveCheckbox();
	    des.VerifyDesignationSubmitbtn();
	    des.Verifyalreadyexistalertokbtn();
	    des.VerifyDesignationEditbtn();
	    des.VerifyDesignationYesupdateitbtn();
	    des.VerifyUpdateShortName11();
	    des.VerifydesignationUpdatebtn();
	    des.VerifyDesignationupdatedmsgok();
	    des.VerifyDesignatiosearchoption();
	    des.VerifyDesignationexportbtn();
	    des.VerifyDesignatiosearchoption1();
		   
		} 
	}

	
	

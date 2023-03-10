package com.lpg.qaTestcases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.lpgPages.Userpageform;



public class UserpageTest extends LpgTestBase{


	// Open browser ==> Test Registration page ==> ==>close the browser.
	
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void Userpagetest() throws InterruptedException{
		Userpageform uf = new Userpageform(LpgTestBase.driver);
		uf.verifyMyerpagancycode();
		uf.verifyMyerpusrname();
		uf.verifyMyerppassword();
		uf.verifyMyerploginbtn();
		uf.verifyMyerpMasterModule();
		uf.verifyMyerpGeneralMaster();
		uf.verifyMyerpPageNavigation();
		uf.verifyMyerpUserMaster();
		uf.verifyMyerpSelectEmployee1();
		uf.verifyMyerpSelectUserType();
		uf.verifyMyerpSelectCompany();
		uf.verifyMyerpUseridname();
		uf.verifyMyerpUserpass();
		uf.verifyMyerpUseremail();
		uf.verifyMyerpUserMob();
		uf.verifyMyerpcheckboxcl();
        uf.VerifyClearBtn();
        uf.verifyMyerpSelectEmployee1();
		uf.verifyMyerpSelectUserType();
		uf.verifyMyerpSelectCompany();
		uf.verifyMyerpUseridname();
		uf.verifyMyerpUserpass();
		uf.verifyMyerpUseremail();
		uf.verifyMyerpUserMob();
		uf.verifyMyerpcheckboxcl();
		uf.verifyMyerpsubmitbtn();
		uf.VerifySubmitOKBtn();
		uf.VerifyandClickonPSearchbar1();
		uf.VerifyEditBtn();
		uf.VerifyYesUpdateItBtn();
		uf.verifyMyerpSelectUserType1();
		uf.verifyMyerpUseremail1();
		uf.verifyMyerpUserMob1();
		uf.VerifyPUpdateBtn();
		uf.VerifyUpdateOKBtn();
		uf.VerifyExportBtn();
		uf.VerifyandClickonPSearchbar2();
	
	
		
	}
}

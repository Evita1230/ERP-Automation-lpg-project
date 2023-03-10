package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.accpages.NewLedgers;
import com.lpg.qa.lpgBase.TestBase;


public class NewLedgersTest extends TestBase{

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
	public void NewLegersPageTest() throws InterruptedException {
		NewLedgers nl=new NewLedgers(TestBase.driver); 
		
		nl.verifyMyerpagancycode();
		nl.verifyMyerpUserid();
		nl.verifyMyerpPassword();
		nl.VerifyandClickonMyerpLoginBtn();
		nl.VerifyMyerpMasterModule();
		nl.VerifyMyerpAccountMasterModule();
		nl.VerifyMyerpNewLedgersForm();
		nl.VerifyMyerpNewLedgersClickHereTextbtn();
		nl.VerifyMyerpMasterModule();
		nl.VerifyMyerpAccountMasterModule();
		nl.VerifyMyerpNewLedgersForm();
		nl.VerifyMyerpNLDXLSFILE();
		nl.VerifyMyerpNLChooseFILE();
		nl.VerifyMyerpUploadBtn();
		nl.VerifyMyerpNLNameOfLedgers();
		nl.NLSelectGroup();
		nl.VerifyMyerpNLAliasOfLedgers();
		nl.VerifyMyerClearBtn();
		nl.VerifyMyerpNLNameOfLedgers();
		nl.NLSelectGroup();
		nl.VerifyMyerpNLAliasOfLedgers();
		nl.VerifyMyerNLSaveBtn();
		nl.VerifyandClickonPSearchbar();
		nl.VerifyMyerpNLSaveOKBtn();
		nl.VerifyMyerpNLGetListBtn();
		nl.VerifyMyerpNLEditBtn();
		nl.VerifyMyerpNLYesUpdateBtn(); 
		nl.VerifyMyerpNLUpdateBtn();
		nl.VerifyMyerpNLUpdateokBtn();
		nl.VerifyMyerpNLExportBtn();
		
	   
	} 
}

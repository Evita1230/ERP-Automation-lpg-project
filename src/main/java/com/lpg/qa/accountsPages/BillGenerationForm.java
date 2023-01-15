package com.lpg.qa.accountsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class BillGenerationForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Accounts']")private WebElement accounts;
	@FindBy(xpath="//a[text()=' Bill Generation']")private WebElement billgeneration;
	@FindBy(xpath="//select[@id='ddlBillingType']")private WebElement billingtype;
	@FindBy(xpath="//input[@id='BillingDate']")private WebElement billingdate;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	//initialization
		public BillGenerationForm(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}

	//usage
		
		public void verifyMyerpagancycode() {
			Assert.assertTrue(agancycode.isEnabled(),"agancycode find is enable");
			Reporter.log("verifyMyerpagancycode",true);
			agancycode.sendKeys("ERP_00001");
			
		}
		public void verifyMyerpusrname() {
			Assert.assertTrue(userid.isEnabled(),"username find is enable");
			Reporter.log("verifyMyerpUserid",true);
			userid.sendKeys("admin");
		}
		public void verifyMyerppassword() {
			Assert.assertTrue(password.isEnabled(),"password find is enable");
			Reporter.log("verifyMyerppassword",true);
			password.sendKeys("admin@123");
		}
		public void verifyMyerploginbtn() {
			Assert.assertTrue(login.isEnabled(),"loginbtn is enable");
			Reporter.log("verifyMyerplogin",true);
			login.click();
		}
		public void verifyMyerpAccounts() {
			Assert.assertTrue(accounts.isEnabled(),"Accounts is enable");
			Reporter.log("verifyMyerpaccounts",true);
			accounts.click();
		}
		public void verifyMyerpBillgeneration() {
			Assert.assertTrue(billgeneration.isEnabled(),"Billgeneration is enable");
			Reporter.log("verifyMyerpbillgeneration",true);
			billgeneration.click();
		}
		public void Billingtype() throws InterruptedException {
			Select bt = new Select(billingtype);
			Thread.sleep(1000);
			Assert.assertTrue(billingtype.isDisplayed(),"Billingtype is  displayed");
			Assert.assertFalse(billingtype.isSelected());
			bt.selectByVisibleText("Daily");
		}
		public void verifyMyerpBillingdate() {
			Assert.assertTrue(billingdate.isEnabled(),"Billingdate is enable");
			Reporter.log("verifyMyerpbillingdate",true);
			billingdate.sendKeys("16/12/2022");
		}
		public void verifyMyerpSubmitbtn() {
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}
}

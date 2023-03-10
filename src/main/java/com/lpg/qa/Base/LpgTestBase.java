package com.lpg.qa.Base;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.apache.maven.surefire.shared.utils.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;

public class LpgTestBase {
	
      public static  WebDriver driver;
			 
			public WebDriver intializeBrowser(String browser) {
				if(browser.equalsIgnoreCase("chrome")) {
		     System.setProperty("webdriver.chrome.driver", "C:\\Users\\YOGESH\\Desktop\\Selenium all jar file\\chromedriver.exe");
					 driver=new ChromeDriver();
				System.out.println("Chrome driver sucessfully open");
				}
				driver.get("http://myerp.mygasagency.com/");
			    driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='txtAgencyCode']")).sendKeys("ERP_00001");
				driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("admin@123");
				driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
				return driver;
				
			}
		
              public static Boolean isAlertPresent(WebDriver driver) throws InterruptedException
              {
				try {
					WebDriverWait wait=new WebDriverWait(driver,20);
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert=driver.switchTo().alert();
                    Thread.sleep(1000);
                    String alert_msg=driver.getTitle(); System.out.println(alert_msg);
					alert.accept();
				} catch (UnhandledAlertException u) {
					// TODO Auto-generated catch block
					u.printStackTrace();
				}
				return false;
			}
			
			@AfterMethod
			public void screenshotCapture(ITestResult result) throws IOException, InterruptedException {
				if(result.getStatus()==ITestResult.FAILURE) {
					Date d=new Date();
					String name = d.toString().replace(" ", "").replace(":", "")+".png";
					File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
					FileUtils.copyFile(source, new File("C:\\Users\\YOGESH\\Desktop\\Lpg Screenshot\\lpg"+name));
				}
				/*
				 * if (isAlertPresent(driver)) { System.out.println("alert is present");
				 * 
				 * }else { System.out.println("alert is not present"); }
				 * 
				 * } public static boolean isAlertPresent(WebDriver driver) throws
				 * InterruptedException { try { Alert al=driver.switchTo().alert();
				 * Thread.sleep(1000); al.sendKeys("text"); al.accept(); String
				 * alert_msg=driver.getTitle(); System.out.println(alert_msg); return true; }
				 * catch (UnhandledAlertException u) { // TODO Auto-generated catch block
				 * u.printStackTrace(); } return false;
				 */
				
		
			}
}

	



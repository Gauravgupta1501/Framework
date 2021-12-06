package com.metlife.components.businessLogic;


import com.google.common.base.Throwables;
import com.metlife.components.PageObjects.PageObject_Home;
import com.metlife.components.Reporting.Extent_Reporting;
import com.metlife.components.Utilities.ElementAction;
import com.metlife.components.Utilities.Excel_Handling;
import com.metlife.components.Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;



@SuppressWarnings("static-access")
public class BusinessLogic_Home extends PageObject_Home {

	PageObject_Home metlink=new PageObject_Home();

	static WebDriver driver = null;
	static String TC_ID = null;
	ElementAction action = new ElementAction();
	static Log log = null;

	/**
	 * 
	 * @param driver
	 * @param TC_ID
	 */
	public BusinessLogic_Home(WebDriver driver, String TC_ID) {
		this.driver = driver;
		this.TC_ID = TC_ID;
		log = new Log(this.getClass().getName());
	}

	public void switchwindow() throws InterruptedException{
//        action.WaitUntilNumberofWindowHandleOpen(driver, 1);
        action.waitForPageToLoad(driver);
        Thread.sleep(6000);
        for(String winhandle:driver.getWindowHandles()){
               driver.switchTo().window(winhandle);
               driver.manage().window().maximize();
               log.info("Switchwindow() method successful");
        }
}





	public void waitForElementExplicitly(WebDriver driver, String xpath) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		} catch (Exception e) {
			log.error("Error Message -->" + e.getMessage());
			throw new Exception("NO element found with Xpath : "+xpath);
		}
	}

	/**
	 * @Description:Explicitly wait
	 * @param xpath
	 * @return
	 */
	public boolean waitForElementToBeLoad(String xpath){ 
		boolean status = false;
		try {
			WebDriverWait waitObj = new WebDriverWait(driver, 60);
			waitObj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		} catch (Exception e) {
			status = true;
			System.out.println("NO element found with Xpath : "+xpath);
		}
		return status;
	}

	public void JavascriptExecutor_forClick(WebDriver driver ,String XpathObject,String ObjectName) throws Throwable {
		try
		{
			WebElement e=driver.findElement(By.xpath(XpathObject));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", e);
			Extent_Reporting.Log_Pass(ObjectName+" clicked", ObjectName+" Ciicked");
			js=null;
			e=null;
		}
		catch(Throwable t)
		{
			Extent_Reporting.Log_Fail(ObjectName+" Not Present", ObjectName+" Not Present", driver);
			t.printStackTrace();
			new Exception(ObjectName+" not present");
		}
	}

	/**
	 * Scroll-Used for scrolling to the particular location of element
	 * @param xpath
	 * @throws Exception
	 */
	public void Scroll(String xpath) throws Exception
	{
		try{
			WebElement ele=driver.findElement(By.xpath(xpath));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",ele);
			jse.executeScript("return arguments[0].text", ele);

			log.info("Scrolled successfully");
		}catch(Exception e)
		{
			log.error("scroll method failed");
			throw new Exception("scroll method failed");
		}
	}
	/*
	 * Always write function as in sample
	 */
	
				//  Login Method
	public void login() throws Exception
			{
				try 
				{
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
						Extent_Reporting.Log_report_img("username is available","username is available", driver);
						action.inputText(driver, username, Excel_Handling.Get_Data(TC_ID, "Username"), "Username entered");
					
						Extent_Reporting.Log_report_img("password is available","username is available", driver);
						action.enterText(driver, password, Excel_Handling.Get_Data(TC_ID, "Password"), "Password entered");

					
						action.Clickbtn(driver,signIn, "Login button clicked");
						driver.findElement(By.xpath(Acesscode)).sendKeys("111111");
						action.clickButton(driver, NextBtn, "next button");
						action.clickButton(driver, portalAccount, "account");

				}
					catch (Exception e) 
				{
					log.error("login() failed " + Throwables.getStackTraceAsString(e));
					Extent_Reporting.Log_Fail("login", " Failed", driver);
					e.printStackTrace();
					throw new Exception(e.getMessage());
				}
			}


				public void Disability() throws Throwable
			{
				int size=driver.findElements(By.id("mainFrame")).size();
				System.out.println(size);
				driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='mainFrame']")));
				action.clickButton(driver, disability, "Disability link");
				System.out.println("next page");
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='mainFrame']")));
				System.out.println("next page");

				
				//driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
				Thread.sleep(5000);
				//action.isElementDisplayed(driver, "//*[@id='app']/div/div/div[2]/div/div/div/select", "");
				
				
				
				//action.isElementDisplayed(driver, "//label[contains(text(),'Customer Name: ')]", "");
				
				//action.selectDropBoxValue(driver, "//div//select/.", "0110105", "");
				//Extent_Reporting.Log_report_img("password is available","username is available", driver);
				//Thread.sleep(5000);
				
				action.Javascriptexecutor_forClick(driver, "//label[contains(text(),'Customer Name:')]//following::select", "");
		        Thread.sleep(1000);
		        action.Clickbtn(driver, "//option[contains(text(),'ADVOCATE HEALTH CARE-0119159')]", "");
		        Thread.sleep(3000);
				action.clickButton(driver, goButton, "goButton link");
				
				
				
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Extent_Reporting.Log_report_img("password is available","username is available", driver);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				action.clickButton(driver, HRHome, "HR Home link");
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Extent_Reporting.Log_report_img("password is available","username is available", driver);
				
				action.clickButton(driver, search2, "search1 link");
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Extent_Reporting.Log_report_img("password is available","username is available", driver);
				action.isElementDisplayed(driver, downloadView1, "download View link");
				Extent_Reporting.Log_report_img("password is available","username is available", driver);
				action.isElementDisplayed(driver, printOption, "print link");
				Extent_Reporting.Log_report_img("password is available","username is available", driver);
				
			}
			
			
			public void fileaClaim()
			{
				try {
					action.waitForPageToLoad(driver);
					driver.switchTo().defaultContent();
					driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/MetLinkPortal/displayHomepage.do?mode=P']")));
					System.out.println("frame switched");
					//driver.findElement(By.linkText("File a Claim")).click();
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.Javascriptexecutor_forClick(driver, fileClaim, "fileClaim");
					action.Javascriptexecutor_forClick(driver, fileClaim, "claim");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					action.clickButton(driver, finishincomClaimsDD, "dropdown");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.clickButton(driver, finishincomClaimsOp, "option");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.clickButton(driver, goClaim, "go claim");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					action.clickButton(driver, editClaim, "edit claim");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					action.clickButton(driver, nextClaim, "next button");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.switchTo().defaultContent();
					driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/MetLinkPortal/displayHomepage.do?mode=P']")));
					System.out.println("frame switched");
					driver.findElement(By.xpath(nextClaim)).click();
					action.Javascriptexecutor_forClick(driver, "//button[contains(text(),'Next')]", "next button");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					
					//action.isElementDisplayed(driver, nextClaim, "");   
					//driver.findElement(By.xpath(nextClaim)).click();
                    //action.Javascriptexecutor_forClick(driver, "//button[contains(text(),'Next')]", "next button");
                    //Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
                    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    System.out.println("next button clicked");
                    action.clickButton(driver, checkboxClaim, "checkbox");
					//System.out.println("next button clicked");
					//action.clickButton(driver, checkboxClaim, "checkbox");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.enterText(driver, passwd, Excel_Handling.Get_Data(TC_ID, "Password"), "Password entered");
					action.clickButton(driver, nextClaim, "submit button");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					action.clickButton(driver, claimConfirm, "claim number");
					
				} catch (Exception e) {
					
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			public void empsumary() throws Throwable
			{
				try {
					
					action.clickButton(driver, empsum, "emp summary tab");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.findElement(By.xpath(empLN)).sendKeys("aa");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.clickButton(driver, empGo, "go button");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.clickButton(driver, empName1, "emp name");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.clickButton(driver, currentClaims, "claim nmber");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					//edit emp info
                    action.clickButton(driver, editEmpInfo, "editEmpInfo");
                    //driver.findElement(By.xpath(empPhone)).click();
                    //action.clickButton(driver, empPhone, "name field");
                    Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
                    action.isElementDisplayed(driver, "//*[@id='Main-Content-Section']/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/ul/li[5]/a", "");
                    Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
                    action.Javascriptexecutor_forClick(driver, "//*[@id='Main-Content-Section']/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/ul/li[5]/a", "");
                    Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
                    action.clearAndInputTextValue(driver, MI, Excel_Handling.Get_Data(TC_ID, "CustomerGroup"), "");
                //    driver.findElement(By.xpath(MI)).sendKeys("aa");
                    Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
                    action.clickButton(driver, saveEmp, "save button");
                    Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
                    action.clickButton(driver, submitEmp, "submitEmp button");
                    Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
                    action.Clickbtn(driver, okEmp, "ok emp");
                    Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					//add msg attachemnts
					action.clickButton(driver, addmsgAttachments, "add msg attachemnts");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					action.isElementDisplayed(driver, mailAddress, "mail address");
					action.clickButton(driver, submitMsg1, "submit");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					action.Clickbtn(driver, okEmp, "ok emp");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);

					//dairy notes
					action.clickButton(driver, dairynotes, "dairy notes");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					action.isElementDisplayed(driver, dairynotesheading, "page heading");
					action.clickButton(driver, returntoClaim, "return to claim page");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					//RTW
					action.isElementDisplayed(driver, RTWtext, "RTWtext");
					Extent_Reporting.Log_report_img("home.RTWedit", "home.RTWedit", driver);
					action.Clickbtn(driver, RTWedit, "RTWedit");
					 Extent_Reporting.Log_report_img("home.returnwork", "home.returnwork", driver);
					action.isElementDisplayed(driver, returnwork, "returnwork");
					action.clickButton(driver, cancelRTW, "cancel button");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					
					//edit claim info
					action.Clickbtn(driver, editclaimInfo, "edit claim info");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.clickButton(driver, hoursPerWeek, "hours per week");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.findElement(By.xpath(hoursperweek)).clear();
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					driver.findElement(By.xpath(hoursperweek)).sendKeys("1");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.clickButton(driver, saveHPW, "save");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.clickButton(driver, submitHPW, "submit");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.Clickbtn(driver, okEmp, "ok emp");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					
					//view leave details
					action.clickButton(driver, viewLeaveDetails, "view leave details");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.isElementDisplayed(driver, leaveHistory, "leave history");
					//activityHistory
					action.clickButton(driver, activityHistory, "activity hstory");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.isElementDisplayed(driver, activityHistory1, "actibity hstory tab");
					//absence tracking history
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.clickButton(driver, absenceTrackinghistory, "absenceTrackinghistory");
					Extent_Reporting.Log_report_img("claim is available","claim is available", driver);
					action.isElementDisplayed(driver, absenceTrackinghistory1, "absence tab");

					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public void claiminquiry() throws Throwable
			{
				try {
					action.clickButton(driver, claimenquiry, "claimEnquiry clicked");
					System.out.println(" claimEnquiry clicked");
					
					action.waitForPageToLoad(driver);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(5000);
					action.Javascriptexecutor_forClick(driver, Select, "select option clicked");
					//action.clickButton(driver, select, "name");
					driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
					Extent_Reporting.Log_report_img("option is available","option is available", driver);
					driver.findElement(By.xpath("//option[@value='Claim Summary View']")).click();
					
					if(action.isElementDisplayed(driver, STD, "STD"))
					Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);
					{
						action.clickButton(driver, STD, "STD");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.waitForPageToLoad(driver);
						driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.isElementDisplayed(driver, empname, "Employee name");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.isElementDisplayed(driver, eess, "EE#SS#");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.isElementDisplayed(driver, claim1, "Claim#");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.isElementDisplayed(driver, ReceivedDate, "Received date");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.isElementDisplayed(driver, DisabilityDate, "DisabilityDate");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.isElementDisplayed(driver, claimEnddate, "claimEnddate");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.isElementDisplayed(driver, status, "Status");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.isElementDisplayed(driver, group, "group");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

						action.clickButton(driver, returnToPreviousPage, "returnToPreviousPage");
						Extent_Reporting.Log_report_img("STD option is available","STD option is available", driver);

					}
					
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					 js.executeScript("window.scrollBy(0,500)");
					if(action.isElementDisplayed(driver, LtD, "LTD"))
						Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);
						{
							action.clickButton(driver, LtD, "LTD");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

							action.waitForPageToLoad(driver);
							driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
							((JavascriptExecutor)driver).executeScript("scroll(0,-400)");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

							action.isElementDisplayed(driver, empname, "Employee name");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

							action.isElementDisplayed(driver, eess, "EE#SS#");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

							action.isElementDisplayed(driver, claim1, "Claim#");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

							action.isElementDisplayed(driver, ReceivedDate, "Received date");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

							action.isElementDisplayed(driver, DisabilityDate, "DisabilityDate");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

							action.isElementDisplayed(driver, claimEnddate, "claimEnddate");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

							action.isElementDisplayed(driver, status, "Status");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

							action.isElementDisplayed(driver, group, "group");
							Extent_Reporting.Log_report_img("LTD option is available","STLTDD option is available", driver);

							action.clickButton(driver, returnToPreviousPage, "returnToPreviousPage");
							Extent_Reporting.Log_report_img("LTD option is available","LTD option is available", driver);

						}
					
						 js.executeScript("window.scrollBy(0,500)");
						if(action.isElementDisplayed(driver, FMLA, "FMLA"))
							Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);
							{
								action.clickButton(driver, FMLA, "FMLA");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.waitForPageToLoad(driver);
								driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
								((JavascriptExecutor)driver).executeScript("scroll(0,-400)");

								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.isElementDisplayed(driver, empname, "Employee name");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.isElementDisplayed(driver, eess, "EE#SS#");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.isElementDisplayed(driver, claim1, "Claim#");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.isElementDisplayed(driver, ReceivedDate, "Received date");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.isElementDisplayed(driver, DisabilityDate, "DisabilityDate");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.isElementDisplayed(driver, claimEnddate, "claimEnddate");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.isElementDisplayed(driver, status, "Status");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.isElementDisplayed(driver, group, "group");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

								action.clickButton(driver, returnToPreviousPage, "returnToPreviousPage");
								Extent_Reporting.Log_report_img("FMLA option is available","FMLA option is available", driver);

							}
							
							 js.executeScript("window.scrollBy(0,500)");
							if(action.isElementDisplayed(driver, PFL, "PFL"))
								Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);
								{
									action.clickButton(driver, PFL, "PFL");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.waitForPageToLoad(driver);
									driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
									((JavascriptExecutor)driver).executeScript("scroll(0,-400)");

									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.isElementDisplayed(driver, empname, "Employee name");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.isElementDisplayed(driver, eess, "EE#SS#");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.isElementDisplayed(driver, claim1, "Claim#");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.isElementDisplayed(driver, ReceivedDate, "Received date");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.isElementDisplayed(driver, DisabilityDate, "DisabilityDate");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.isElementDisplayed(driver, claimEnddate, "claimEnddate");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.isElementDisplayed(driver, status, "Status");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.isElementDisplayed(driver, group, "group");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

									action.clickButton(driver, returnToPreviousPage, "returnToPreviousPage");
									Extent_Reporting.Log_report_img("PFL option is available","PFL option is available", driver);

								}
								action.clickButton(driver, claimenquiry, "claimEnquiry clicked");
								//driver.findElement(By.xpath("(//li[@class='menu-active'])[4]//a[@href='/tamwa/disability/rest/wrap/claiminquiry'][contains(text(),'Claim Inquiry')]")).click();
								action.Javascriptexecutor_forClick(driver, claimenquiry, "claimEnquiry");
								System.out.println(" claimEnquiry clicked");
								
								action.waitForPageToLoad(driver);
								driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
								Thread.sleep(5000);
								action.isElementDisplayed(driver, currentclaimsView, "currentclaimsView option");
								Extent_Reporting.Log_report_img("currentclaimsView option is available","currentclaimsView option is available", driver);

								
								action.isElementDisplayed(driver, advancedFilters, "advancedFilters option");
								Extent_Reporting.Log_report_img("advancedFilters option is available","advancedFilters option is available", driver);
								action.clickButton(driver, advancedFilters, "advancedFilters");
								
								action.Javascriptexecutor_forClick(driver, filtersSelect, "select option clicked");
								//action.clickButton(driver, select, "name");
								driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
								Extent_Reporting.Log_report_img("select option is available","select option is available", driver);
								driver.findElement(By.xpath("(//option[@value='3'])[1]")).click();
								Extent_Reporting.Log_report_img("option is available","option is available", driver);
								
								JavascriptExecutor js1 = (JavascriptExecutor) driver;
								 js1.executeScript("window.scrollBy(0,100)");
								
								if(action.isElementDisplayed(driver, disabilityPFL, "disability/PFL"))
									Extent_Reporting.Log_report_img("disabilityPFL option is available","disabilityPFL option is available", driver);

								{
									action.isElementDisplayed(driver, approved, "approved");
									Extent_Reporting.Log_report_img("approved option is available","approved option is available", driver);

									action.isElementDisplayed(driver, closed, "closed");
									Extent_Reporting.Log_report_img("closed option is available","closed option is available", driver);

									// js.executeScript("window.scrollBy(0,300)");
									action.isElementDisplayed(driver, decisionPending, "decisionPending");
									Extent_Reporting.Log_report_img("decisionPending option is available","decisionPending option is available", driver);

									action.isElementDisplayed(driver, denied, "denied");
									Extent_Reporting.Log_report_img("denied option is available","denied option is available", driver);

									action.isElementDisplayed(driver, pending, "pending");
									Extent_Reporting.Log_report_img("pending option is available","pending option is available", driver);
									
									action.isElementDisplayed(driver, suspended, "suspended");
									Extent_Reporting.Log_report_img("suspended option is available","suspended option is available", driver);

								}
								
								 js.executeScript("window.scrollBy(0,300)");
								 if(action.isElementDisplayed(driver, fmlClaims, "fmlClaims/PFL"))
										Extent_Reporting.Log_report_img("fmlClaims option is available","fmlClaims option is available", driver);

									{
										action.isElementDisplayed(driver, abandoned, "abandoned");
										Extent_Reporting.Log_report_img("abandoned option is available","abandoned option is available", driver);

										action.isElementDisplayed(driver, approved1, "approved1");
										Extent_Reporting.Log_report_img("approved1 option is available","approved1 option is available", driver);

										action.isElementDisplayed(driver, cancelled, "cancelled");
										Extent_Reporting.Log_report_img("cancelled option is available","cancelled option is available", driver);

										action.isElementDisplayed(driver, closed1, "closed1");
										Extent_Reporting.Log_report_img("closed1 option is available","closed1 option is available", driver);

										
										action.isElementDisplayed(driver, denied1, "denied1");
										Extent_Reporting.Log_report_img("denied1 option is available","denied1 option is available", driver);
										
										Extent_Reporting.Log_report_img("newStatus option is available","newStatus option is available", driver);
										action.isElementDisplayed(driver, newStatus, "newStatus");
										action.clickButton(driver, newStatus, "newStatus");
										Extent_Reporting.Log_report_img("newStatus option is available","newStatus option is available", driver);
										
										action.isElementDisplayed(driver, pending1, "pending1");
										Extent_Reporting.Log_report_img("pending1 option is available","pending1 option is available", driver);

										action.isElementDisplayed(driver, reopened, "reopened");
										Extent_Reporting.Log_report_img("reopened option is available","reopened option is available", driver);

										action.isElementDisplayed(driver, suspended1, "suspended1");
										Extent_Reporting.Log_report_img("suspended1 option is available","suspended1 option is available", driver);

									}
								action.clickButton(driver, approved, "approved");
								Extent_Reporting.Log_report_img("approved option is available","approved option is available", driver);
								
								action.clickButton(driver, closed, "closed");
								Extent_Reporting.Log_report_img("closed option is available","closed option is available", driver);
								
								action.clickButton(driver, suspended1, "suspended1");
								Extent_Reporting.Log_report_img("suspended1 option is available","suspended1 option is available", driver);

								action.clickButton(driver, reopened, "reopened");
								Extent_Reporting.Log_report_img("reopened option is available","reopened option is available", driver);

								action.Javascriptexecutor_forClick(driver, filtersSelect, "select option clicked");
								//action.clickButton(driver, select, "name");
								driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
								Extent_Reporting.Log_report_img("select option is available","select option is available", driver);
								driver.findElement(By.xpath("//option[@value='4']")).click();
								Extent_Reporting.Log_report_img("option is available","option is available", driver);
								
								action.clickButton(driver, AK, "AK option field");
								Extent_Reporting.Log_report_img("AK option is available","AK option is available", driver);
								
								action.clickButton(driver, DE, "DE option field");
								Extent_Reporting.Log_report_img("DE option is available","DE option is available", driver);

								action.clickButton(driver, NH, "Nh option field");
								Extent_Reporting.Log_report_img("NH option is available","NH option is available", driver);

				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public void dailystatusview() throws Throwable
			{
				try {
					action.Javascriptexecutor_forClick(driver, dailyStatus, "daily status");
					System.out.println(" dailyStatus clicked");
					
					action.waitForPageToLoad(driver);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					Thread.sleep(5000);
					
					Extent_Reporting.Log_report_img("calender icon is available","calender icon is available", driver);
					action.clickButton(driver, calender, "calender icon");
					Extent_Reporting.Log_report_img("date is available","date is available", driver);
					action.clickButton(driver, nov23, "date");
					Extent_Reporting.Log_report_img("search button is available","search button is available", driver);
					action.clickButton(driver, search, "search button");
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Extent_Reporting.Log_report_img("All Activities View is available","All Activities View is available", driver);
					action.isElementDisplayed(driver, AllactivitiesView, "All Activities View");
					Extent_Reporting.Log_report_img("AllactivitiesView is available","AllactivitiesView is available", driver);
					action.clickButton(driver, AllactivitiesView, "AllactivitiesView");
					
					driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
					js.executeScript("window.scrollBy(0,-100)");
					
					
					Extent_Reporting.Log_report_img("back to daily status is available","back to daily status is available", driver);
					action.clickButton(driver, backDailystatus, "back to daily status");
					
										
					js.executeScript("window.scrollBy(0,-400)");

					Extent_Reporting.Log_report_img("calender icon is available","calender icon is available", driver);
					action.clickButton(driver, calender, "calender");
					Extent_Reporting.Log_report_img("date is available","date is available", driver);
					action.clickButton(driver, dec4, "date");
					Extent_Reporting.Log_report_img("search button is available","search button is available", driver);
					action.clickButton(driver, search, "search button");
					
					js.executeScript("window.scrollBy(0,400)");

					Extent_Reporting.Log_report_img("All Activities View is available","All Activities View is available", driver);
					action.isElementDisplayed(driver, AllactivitiesView, "All Activities View");
					
										
					

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
					}
			

							
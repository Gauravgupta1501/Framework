package com.metlife.components.Tests;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.metlife.components.businessLogic.BusinessLogic_Home;
import com.metlife.components.setup.DriverSetup;
import com.metlife.components.PageObjects.PageObject_Home;
import com.metlife.components.Utilities.Log;


public class Metlink_Regression extends DriverSetup {

	public static WebDriver webDriver = null;
	public static String tcID = null;
	Log log = new Log(this.getClass().getName());
	
	//Business Logic Class Object list
	/*BusinessLogic_Login login= null;*/
	BusinessLogic_Home Login= null;
	PageObject_Home home1=null;
	

	@Test
	public void setup() throws Throwable
	{
		log.info("Setup the variable for Test");
		webDriver = driver; // for WebDriver - Chrome/IE/Firefox/Headless
		tcID = TC_ID;
		//Business Logic Object assignment
		/*login= new BusinessLogic_Login(webDriver, tcID);*/
		Login= new BusinessLogic_Home(webDriver, tcID);
		home1=new PageObject_Home();
		log.info("Setup completed for the variable");
		try {
			log.info("Driver details -->"+webDriver);
			log.info("Test ARS Page");
			log.info(webDriver.getTitle());
			driver.manage().window().maximize();
			Login.login();
	 		Login.Disability();
       	  	Login.fileaClaim();//Pass
       	  	Login.empsumary();//pass
       	  	Login.claiminquiry();//Pass
       	  	Login.dailystatusview();//Pass

     

			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}



}
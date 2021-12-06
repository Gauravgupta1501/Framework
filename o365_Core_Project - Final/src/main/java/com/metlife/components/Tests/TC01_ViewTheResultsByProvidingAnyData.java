package com.metlife.components.Tests;

import com.metlife.components.setup.DriverSetup;
import com.metlife.components.Reporting.Extent_Reporting;
import com.metlife.components.Utilities.Log;
import com.metlife.components.businessLogic.BL_LogIn;
import org.testng.annotations.Test;

public class TC01_ViewTheResultsByProvidingAnyData extends DriverSetup {
	Log log = new Log(this.getClass().getName());

	@Test
	public void TC01() throws Throwable {
		BL_LogIn login = new BL_LogIn(driver,TC_ID);


		try {
			log.info("Setup the variable for Test");

			login.logIn();



		} catch (Throwable t) {
			t.printStackTrace();
			Extent_Reporting.Log_Fail("Failed", "TestCase failed", driver);
		}
	}
}
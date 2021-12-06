package com.metlife.components.businessLogic;

import com.google.common.base.Throwables;
import com.metlife.components.PageObjects.PO_LogIn;
import com.metlife.components.Reporting.Extent_Reporting;
import com.metlife.components.Utilities.Excel_Handling;
import com.metlife.components.Utilities.ElementAction;
import com.metlife.components.Utilities.Log;
import org.openqa.selenium.WebDriver;


public class BL_LogIn extends PO_LogIn {

    static WebDriver driver = null;
    static String TC_ID = null;
    ElementAction action = new ElementAction();
    static Log log = null;
    boolean blnExecFlag = true;

    public BL_LogIn(WebDriver driver, String TC_ID) {
        this.driver = driver;
        this.TC_ID = TC_ID;
        log = new Log(this.getClass().getName());

    }

    /**************************************************************************************************************
     * Login() function is used to login into the application and update report based on the login status.
     * @throws Throwable
     * @author Saurabh
     **************************************************************************************************************/

    public void logIn() throws Throwable {
        try {
            action.explicitWait(driver,input_username,5,"visibilityOfElementLocated");
            action.inputText(driver, input_username, Excel_Handling.Get_Data(TC_ID, "UserName"), "UserName");
            Extent_Reporting.Log_report_img("IDI MSR","IDI MSR",driver);

            action.inputText(driver, input_password, Excel_Handling.Get_Data(TC_ID, "Password"), "Password");
            Extent_Reporting.Log_report_img("IDI MSR","IDI MSR",driver);

            action.clickButton(driver, button_Login, "Login");
            //action.javascriptExecutorClick(driver,button_Login,"xpath");
            //action.waitForPageToLoad(driver);
            action.getWindowHandle(driver,"M-System");
            driver.manage().window().maximize();

            action.isElementDisplayed(driver,GSI_Enrollment,"GSI_Enrollment");
            Extent_Reporting.Log_Pass_Screenshot("Login","Login application Successfully",driver);

        } catch (Exception e) {
            log.error("login() failed " + Throwables.getStackTraceAsString(e));
            Extent_Reporting.Log_Fail("login", " Failed", driver);
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
}
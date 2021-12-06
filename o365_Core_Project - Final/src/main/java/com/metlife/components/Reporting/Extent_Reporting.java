package com.metlife.components.Reporting;

import com.metlife.components.Utilities.Common_Functions;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Extent_Reporting {
    static Common_Functions c = new Common_Functions();

    public Extent_Reporting() {
    }

    public static void Log_Pass(String stepName, String passMessage) {
        ExtentTestManager.getTest().log(LogStatus.PASS, stepName, passMessage);
        WordGenerator.LogPass(passMessage, DocTestManager.getTest());
    }

    public static void Log_Fail(String stepName, String failMessage, WebDriver driver) {
        ExtentTestManager.getTest().log(LogStatus.FAIL, stepName, failMessage);
        String imgp = c.captureScreenshot(driver, stepName);
        String img = ExtentTestManager.getTest().addScreenCapture(imgp);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Image", "Application snap: " + img);
        String imgt = imgp.replace("../Snapshots/", ".\\src\\main\\resources\\com\\metlife\\components\\Results\\Graphical Reporting\\Snapshots\\");
        WordGenerator.LogFail(failMessage, DocTestManager.getTest(), imgt);
        Log_report_img_alrt(stepName, failMessage);
    }

    public static void Log_Pass_Screenshot(String stepName, String passMessage, WebDriver driver) throws Exception {
        ExtentTestManager.getTest().log(LogStatus.PASS, stepName, passMessage);
        Thread.sleep(2000L);
        String imgp = c.captureScreenshot(driver, stepName);
        String img = ExtentTestManager.getTest().addScreenCapture(imgp);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Image", "Application snap: " + img);
        String imgt = imgp.replace("../Snapshots/", ".\\src\\main\\resources\\com\\metlife\\components\\Results\\Graphical Reporting\\Snapshots\\");
        WordGenerator.LogPass_Img(passMessage, DocTestManager.getTest(), imgt);
    }

    public static void Log_report_img_alrt(String stepName, String string) {
        String imgp = c.captureScreenshotalert(stepName);
        String img = ExtentTestManager.getTest().addScreenCapture(imgp);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Image", "Application snap: " + img);
        String imgt = imgp.replace("../Snapshots/", ".\\src\\main\\resources\\com\\metlife\\components\\Results\\Graphical Reporting\\Snapshots\\");
        WordGenerator.LogPass_Img(string, DocTestManager.getTest(), imgt);
    }

    public static void Log_report_img(String stepName, String string, WebDriver driver) {
        String imgp = c.captureScreenshot(driver, stepName);
        String img = ExtentTestManager.getTest().addScreenCapture(imgp);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Image", "Application snap: " + img);
        String imgt = imgp.replace("../Snapshots/", ".\\src\\main\\resources\\com\\metlife\\components\\Results\\Graphical Reporting\\Snapshots\\");
        WordGenerator.LogPass_Img(string, DocTestManager.getTest(), imgt);
    }

    public static void Log_report(String string) {
        ExtentTestManager.getTest().log(LogStatus.PASS, string, string);
        WordGenerator.LogPass(string, DocTestManager.getTest());
    }

    public static void Log_Fail(String stepName, String failMessage) {
        ExtentTestManager.getTest().log(LogStatus.FAIL, stepName, failMessage);
    }

    public static void Log_report_img_alrt(String stepName, String string, Alert a) {
        String imgp = c.captureScreenshotalert(stepName);
        String img = ExtentTestManager.getTest().addScreenCapture(imgp);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Image", "Application snap: " + img);
        String imgt = imgp.replace("../Snapshots/", ".\\src\\main\\resources\\com\\metlife\\components\\Results\\Graphical Reporting\\Snapshots\\");
        WordGenerator.LogPass_Img(string, DocTestManager.getTest(), imgt);
    }

    public static void Log_Info(String stepName, String string) {
        ExtentTestManager.getTest().log(LogStatus.INFO, stepName, string);
        WordGenerator.LogPass(string, DocTestManager.getTest());
    }

    public static void Log_report_img(String string, WebDriver driver) {
        String img = ExtentTestManager.getTest().addScreenCapture(c.captureScreenshot(driver, string));
        ExtentTestManager.getTest().log(LogStatus.INFO, string + img);
    }

    public static void Log_Fail_without_src(String stepName, String failMessage) throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.FAIL, stepName, failMessage);
        Thread.sleep(5000L);
    }

    public static void Log_stepInfo(String stepName, String string) {
        ExtentTestManager.getTest().log(LogStatus.INFO, stepName, string);
    }

    public static void Log_imgwithTitle(String stepName, String passMessage, String imagepath, String custompath) throws Exception {
        String img = ExtentTestManager.getTest().addScreenCapture(custompath);
        ExtentTestManager.getTest().log(LogStatus.INFO, stepName, passMessage + img);
        WordGenerator.LogPass_Img(stepName, DocTestManager.getTest(), imagepath);
    }

    public static void Log_Fail_noImg(String stepName, String Message) throws Exception {
        ExtentTestManager.getTest().log(LogStatus.FAIL, stepName, Message);
        WordGenerator.LogPass(Message, DocTestManager.getTest());
    }

    }


package com.metlife.components.Utilities;

//import com.metlife.components.FinalSetup.QCConnection;

import com.metlife.components.Reporting.Extent_Reporting;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;

import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Common_Functions {
    static String snappath = null;
    static String driverName = null;
    static String autoITExecutable = null;
    public static final String workingDir = System.getProperty("user.dir");
    public static final String homeDir = System.getProperty("user.home");
    public static final String downloadPath = homeDir + File.separator + Constants.DOWNLOADPATH;

    public Common_Functions() {

    }

    public String[] GetMultipleTagXMLValue(String tagname) {
        String[] sheetName = null;
        if (tagname.contains(",")) {
            sheetName = new String[tagname.split(",").length];
            sheetName = tagname.split(",");
        } else {
            sheetName = new String[]{tagname};
        }

        return sheetName;
    }

    public String captureScreenshotalert(String StepName) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
            Date date = new Date();
            dateFormat.format(date);
            Robot robot = new Robot();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss_a");
            Calendar now = Calendar.getInstance();
            BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            System.out.print("taking screenshot");
            String name1 = "Summary" + formatter.format(now.getTime()) + StepName + formatter.format(now.getTime());
            ImageIO.write(screenShot, "PNG", new File(".\\src\\main\\resources\\com\\metlife\\components\\Results\\Graphical Reporting\\Snapshots\\" + name1 + ".png"));
            snappath = "../Snapshots/" + name1 + ".png";
        } catch (Exception var10) {
            System.out.println("Issue with snapshot capture");
        }

        return snappath;
    }

    public String GetXMLTagValue(String xmlpath, String tagname) {
        String val = null;

        try {
            File f = new File(xmlpath);
            DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = docBuilder.parse(f);
            val = doc.getElementsByTagName(tagname).item(0).getTextContent();
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return val;
    }

    public By locatorParser(String locator) {
        By loc = By.id(locator);
        if (locator.contains("id")) {
            loc = By.id(locator.substring(locator.indexOf("\"") + 1, locator.length() - 2));
        } else if (locator.contains("name")) {
            loc = By.name(locator.substring(locator.indexOf("\"") + 1, locator.length() - 2));
        } else if (locator.contains("cssSelector")) {
            loc = By.cssSelector(locator.substring(locator.indexOf("\"") + 1, locator.length() - 2));
        }

        if (locator.contains("xpath")) {
            loc = By.xpath(locator.substring(locator.indexOf("\"") + 1, locator.length() - 2));
        }

        return loc;
    }

    public String captureScreenshot(WebDriver driver) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
            Date date = new Date();
            String d = dateFormat.format(date);
            File scrFile = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String name = d + scrFile.getName();
            FileUtils.copyFile(scrFile, new File(".\\src\\main\\resources\\com\\metlife\\components\\Results\\Graphical Reporting\\Snapshots\\" + name));
            snappath = ".\\src\\main\\resources\\com\\metlife\\components\\Results\\Graphical Reporting\\Snapshots\\" + name;
            snappath = "../Snapshots/" + name + ".png";
        } catch (Exception var7) {
            System.out.println("Issue with snapshot capture");
        }

        return snappath;
    }

    public String captureScreenshot(WebDriver driver, String StepName) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
            Date date = new Date();
            String d = dateFormat.format(date);
            System.out.println("Capture Screen shot -->" + driver);
            File scrFile = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            StepName = StepName.replace(" ", "_");
            String name = Constants.Resultfilename + StepName + d + ".png";
            name = name.replace(".html", "_");
            File destFile = new File(".\\src\\main\\resources\\com\\metlife\\components\\Results\\Graphical Reporting\\Snapshots\\" + name);
            FileUtils.copyFile(scrFile, destFile);
            String str = destFile.getAbsolutePath();
            str = str.replace("\\.\\", "\\");
            snappath = str;
            snappath = "../Snapshots/" + name;
        } catch (Exception var10) {
            System.out.println("Issue with snapshot capture->" + var10.getMessage());
        }

        return snappath;
    }

    public static String getFutureDate(int days) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(5, days);
        String futureDate = sdf.format(cal.getTime());
        return futureDate;

    }

    public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String currentdate = sdf.format(date);
        return currentdate;
    }

//    public static void UpdateTestCaseQC(String TC_ID, String status, String testcase) {
//        QCConnection.update(TC_ID, status, testcase);
//    }


    /**
     * @author Aradhana Jamwal
     * @Folowing method is to upload a file (present in the working Directory) using AutoIT
     */

    public static void uploadFileFromDownloads(WebDriver driver, String fileName, String
            chromeUploadAutoITExe, String iEUploadAutoITExe) throws Exception {
        driverName = String.valueOf(driver);
        String fileToBeUploaded = downloadPath + File.separator + fileName;//  passed as a command line parameter to AutoIT executable below
        System.out.println(fileToBeUploaded);
        if (driverName.contains("ChromeDriver") || driverName.contains("Edge")) {
            autoITExecutable = workingDir + Constants.AUTOITSCRIPTPATH + chromeUploadAutoITExe;
            autoITExecutable = workingDir + Constants.AUTOITSCRIPTPATH + chromeUploadAutoITExe + " " + fileToBeUploaded;
            Runtime.getRuntime().exec(autoITExecutable);
            Extent_Reporting.Log_Pass_Screenshot("AutoIT Script Run Pass", "Uploaded " + fileName + " successfully", driver);
        } else if (driverName.contains("InternetExplorerDriver")) {
            autoITExecutable = workingDir + Constants.AUTOITSCRIPTPATH + iEUploadAutoITExe;
            Thread.sleep(3000);
            Runtime.getRuntime().exec(autoITExecutable);
            Extent_Reporting.Log_Pass_Screenshot("AutoIT Script Run Pass", "Uploaded " + fileName + " successfully", driver);
        } else
            Extent_Reporting.Log_Fail("driver is neither IE or Chrome", "failed");
    }

    /**
     * @author Aradhana Jamwal
     * @Folowing method is to upload a file (present in the working Directory) using AutoIT
     */

    public static void uploadFile(WebDriver driver, String fileName, String chromeUploadAutoITExe, String iEUploadAutoITExe) throws Exception {
        Thread.sleep(4000);
        String fileToBeUploaded = workingDir + Constants.AUTOITSCRIPTPATH + fileName;//  passed as a command line parameter to AutoIT executable below
        driverName = String.valueOf(driver);
        if (driverName.contains("EdgeDriver")) {
            autoITExecutable = workingDir + Constants.AUTOITSCRIPTPATH + chromeUploadAutoITExe + " " + fileToBeUploaded;
            Runtime.getRuntime().exec(autoITExecutable);
            Extent_Reporting.Log_Pass_Screenshot("Upload File AutoIT Script Run Pass", "Uploaded " + fileName + " successfully", driver);
        } else if (driverName.contains("InternetExplorerDriver")) {
            autoITExecutable = workingDir + Constants.AUTOITSCRIPTPATH + iEUploadAutoITExe + " " + fileToBeUploaded;
            Runtime.getRuntime().exec(autoITExecutable);
            Extent_Reporting.Log_Pass_Screenshot("Upload File AutoIT Script Run Pass", "Uploaded " + fileName + " successfully", driver);
        } else
            Extent_Reporting.Log_Fail("Upload File AutoIT Script Run Pass", "Failed to Upload " + fileName);
    }


    /**
     * @Following is generic method used to verify that attachment/file is downloaded successfully and deleted from Downloads folder of Home Directory
     */
    public static boolean verifyFileDownloadAndDelete(WebDriver driver, String fileName, String iEDownloadAutoITExeName) throws Exception {
        Thread.sleep(10000);
        driverName = String.valueOf(driver);
        System.out.println("driverName================> " + driverName);
        if (driverName.contains("ChromeDriver") || driverName.contains("Edge")) {
            File dir = new File(downloadPath);
            File[] dirContents = dir.listFiles();
            for (int i = 0; i < dirContents.length; i++) {
                if (dirContents[i].getName().equals(fileName)) {
                    dirContents[i].delete();
                    Extent_Reporting.Log_Pass_Screenshot("verifyFileDownloadAndDelete", "Verified " + fileName + " downloaded Successfully", driver);
                    return true;
                }
            }
            Extent_Reporting.Log_Fail("verifyFileDownloadAndDelete", "Failed to download " + fileName);
            return false;

        } else if (driverName.contains("InternetExplorerDriver")) {
            String autoITExecutable = workingDir + Constants.AUTOITSCRIPTPATH + iEDownloadAutoITExeName;
            Thread.sleep(3000);
            Runtime.getRuntime().exec(autoITExecutable);
            Thread.sleep(3000);
            Extent_Reporting.Log_Pass_Screenshot("AutoIT Script To Download File", "Downloaded and saved the  " + fileName + " successfully", driver);
            Thread.sleep(5000);
            File dir = new File(downloadPath);
            File[] dirContents = dir.listFiles();

            for (int i = 0; i < dirContents.length; i++) {
                if (dirContents[i].getName().equals(fileName)) {
                    Thread.sleep(2000);
                    dirContents[i].delete();
                    Thread.sleep(2000);
                    Extent_Reporting.Log_Pass_Screenshot("verifyFileDownloadAndDelete", "Verified " + fileName + " downloaded Successfully", driver);
                    return true;
                }
            }
            Extent_Reporting.Log_Fail("verifyFileDownloadAndDelete", "Failed to download " + fileName);
            return false;
        } else
            Extent_Reporting.Log_Fail("verifyFileDownload", "failed");
        return false;
    }

    /**
     * @Following is generic method used to verify that attachment/file is downloaded successfully
     */

    public static boolean verifyFileDownload(WebDriver driver, String fileName, String iEDownloadAutoITExeName) throws
            Exception {
        Thread.sleep(6000);
        driverName = String.valueOf(driver);
        System.out.println("driverName================> " + driverName);
        if (driverName.contains("ChromeDriver") || driverName.contains("Edge")) {
            File dir = new File(downloadPath);
            File[] dirContents = dir.listFiles();
            for (int i = 0; i < dirContents.length; i++) {
                if (dirContents[i].getName().equals(fileName)) {
                    Extent_Reporting.Log_Pass_Screenshot("verifyFileDownload", "Verified " + fileName + " downloaded Successfully", driver);
                    return true;
                }
            }
            Extent_Reporting.Log_Fail("verifyFileDownload", "Failed to download " + fileName);
            return false;

        } else if (driverName.contains("InternetExplorerDriver")) {
            String autoITExecutable = workingDir + Constants.AUTOITSCRIPTPATH + iEDownloadAutoITExeName;
            Runtime.getRuntime().exec(autoITExecutable);
            Thread.sleep(5000);
            Extent_Reporting.Log_Pass_Screenshot("AutoIT Script To Download File", "Downloaded and saved the  " + fileName + " successfully", driver);
            File dir = new File(downloadPath);
            File[] dirContents = dir.listFiles();

            for (int i = 0; i < dirContents.length; i++) {
                if (dirContents[i].getName().equals(fileName)) {
                    Extent_Reporting.Log_Pass_Screenshot("verifyFileDownload", "Verified " + fileName + " downloaded Successfully", driver);
                    return true;
                }
            }
            Extent_Reporting.Log_Fail("verifyFileDownload", "Failed to download " + fileName);
            return false;

        } else
            Extent_Reporting.Log_Fail("verifyFileDownload", "failed");
        return false;

    }

    /*----- @Folowing method is to used to verify the downloaded file and delete the file after verification-------*/
    public static boolean isFileDownloadedAndDelete(WebDriver driver, String fileName) throws Exception {
        String downloadPath = homeDir + File.separator + Constants.DOWNLOADPATH;
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();
        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                /* File has been found, it can now be deleted:*/
                dirContents[i].delete();
                Extent_Reporting.Log_Pass_Screenshot("isFileDownloaded", "Verified " + fileName + " downloaded Successfully", driver);
                return true;
            }
        }
        Extent_Reporting.Log_Fail("isFileDownloaded", "Failed to download " + fileName);
        return false;
    }

    /*------- @Following method is to used to verify the downloaded file-----*/
    public static boolean isFileDownloaded(WebDriver driver, String fileName) throws Exception {
        String downloadPath = homeDir + File.separator + Constants.DOWNLOADPATH;
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();
        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                Extent_Reporting.Log_Pass_Screenshot("isFileDownloaded", "Verified " + fileName + " downloaded Successfully", driver);
                return true;
            }
        }
        Extent_Reporting.Log_Fail("isFileDownloaded", "Failed to download " + fileName);
        return false;
    }


    /**
     * @author Aradhana Jamwal
     * @Folowing method is to open a file after download using AutoIT
     */

    public static void openFile(WebDriver driver, String fileName, String openFileAutoITExe) throws Exception {
        Thread.sleep(4000);
        driverName = String.valueOf(driver);
        if (driverName.contains("ChromeDriver") || driverName.contains("Edge")) {
            autoITExecutable = workingDir + Constants.AUTOITSCRIPTPATH + openFileAutoITExe;
            Runtime.getRuntime().exec(autoITExecutable);
            Extent_Reporting.Log_Pass_Screenshot("Open File AutoIT Script Run Pass", "Opened " + fileName + " successfully", driver);
        } else
            Extent_Reporting.Log_Fail("Open File AutoIT Script Run Pass", "Failed to Open " + fileName);
    }



    public static int generateRandomDigits(int n) {
        int number = (int) Math.pow(10, n - 1);
        int newNumber = number + new Random().nextInt(9 * number);
        System.out.println("newNumber = "+ newNumber);
        return newNumber;
    }

    public static void closeOpenFile(WebDriver driver, String fileName, String closeOpenFileAutoITExe) throws Exception {
        Thread.sleep(4000);
        driverName = String.valueOf(driver);
        if (driverName.contains("ChromeDriver") || driverName.contains("Edge")) {
            autoITExecutable =  workingDir + Constants.AUTOITSCRIPTPATH + closeOpenFileAutoITExe;
            Runtime.getRuntime().exec(autoITExecutable);
            Extent_Reporting.Log_Pass_Screenshot("Close File AutoIT Script Run Pass", "Closed " + fileName + " successfully", driver);
        } else
            Extent_Reporting.Log_Fail("Close File AutoIT Script Run Pass", "Failed to close " + fileName);
    }

}

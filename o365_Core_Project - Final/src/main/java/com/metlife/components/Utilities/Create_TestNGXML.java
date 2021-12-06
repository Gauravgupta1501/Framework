package com.metlife.components.Utilities;

//import com.metlife.components.FinalSetup.QCConnection;

import com.metlife.components.setup.WindowsProcess;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.*;
import java.net.URL;
import java.util.*;

public class Create_TestNGXML {
    String Mode;
    public String UrlType;
    private static final String TASKLIST = "tasklist";
    private static final String KILL = "taskkill /F /IM ";
    //static QCConnection qc = null;
    static XmlTest test = null;
    static XmlClass testClass = null;
    static TestNG testNG = new TestNG();
    static XmlSuite suite = new XmlSuite();
    Map<String, HashMap> ConfigData = null;
    ArrayList<String> mobileDetails = new ArrayList();
    ArrayList<String> webDetails = new ArrayList();
    ArrayList<String> desktopWeb = new ArrayList();
    ArrayList<String> headless = new ArrayList();
    ArrayList<String> rwdConfig = new ArrayList();
    public static String[][] mobileValue = (String[][]) null;
    public static String[][] WebValue = (String[][]) null;
    public static String[][] desktopValue = (String[][]) null;
    public static String[][] headLess = (String[][]) null;
    public static String[][] rwd = (String[][]) null;
    String[] mobKeys = null;
    String[] webKeys = null;
    String[] desktopKeys = null;
    String[] headlessKeys = null;
    String[] rwdKeys = null;
    public static String[][] configDataV = (String[][]) null;
    public static int len = 0;
    Log log = null;
    int in = 0;

    public Create_TestNGXML() {
        /*not using this code currently*/
           System.out.println("Calling copydriver()");
     this.copyDriver();
        System.out.println("Done copydriver()");

        this.readConfigData();
        /*not using this code currently*/
       // System.out.println("Config-->" + getConfigData("QC_Flag"));

       //qc = new QCConnection(getConfigData("QC_Flag"));
        this.log = new Log(this.getClass().getName());
    }

    void copy(String path, String driverName, String folder) {
         URL inputUrl = null;
         File dest = null;

         try {
             System.out.println(driverName);
             inputUrl = this.getClass().getResource(path + "/" + driverName);
             dest = new File(System.getProperty("java.io.tmpdir") + "/" + folder + "/" + driverName);
             FileUtils.copyURLToFile(inputUrl, dest);
         } catch (Exception var7) {
             this.log.error(var7.getMessage());
         }

     }

     public void copyDriver() {
         try {
             URL inputUrl = null;
             File dest = null;
             File source = null;
             if (!(new File(System.getProperty("java.io.tmpdir") + "/Drivers/chromedriver.exe")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Drivers/chromedriver.exe");
                     source = new File(System.setProperty("webdriver.chrome.driver", "dependencies\\chromedriver.exe"));
                     dest = new File(System.getProperty("java.io.tmpdir") + "/Drivers/chromedriver.exe");
                     FileUtils.copyFile(source, dest);
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var14) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/Drivers/geckodriver.exe")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Drivers/geckodriver.exe");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/Drivers/geckodriver.exe");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var13) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/Drivers/IEDriverServer64.exe")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Drivers/IEDriverServer64.exe");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/Drivers/IEDriverServer64.exe");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var12) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/Drivers/IEDriverServer32.exe")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Drivers/IEDriverServer32.exe");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/Drivers/IEDriverServer32.exe");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var12) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/Drivers/msedgedriver.exe")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Drivers/msedgedriver.exe");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/Drivers/msedgedriver.exe");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var12) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/Drivers/IEHeadLess.exe")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Drivers/IEHeadLess.exe");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/Drivers/IEHeadLess.exe");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var11) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/Drivers/phantomjs.exe")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Drivers/phantomjs.exe");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/Drivers/phantomjs.exe");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var10) {
                 }
             }



             if (!(new File(System.getProperty("java.io.tmpdir") + "/DLL/jacob-1.18-M2-x64.dll")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Dll/jacob-1.18-M2-x64.dll");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/DLL/jacob-1.18-M2-x64.dll");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var8) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/DLL/jacob-1.18-M2-x86.dll")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Dll/jacob-1.18-M2-x86.dll");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/DLL/jacob-1.18-M2-x86.dll");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var7) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/DLL/OTAClient.dll")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Dll/OTAClient.dll");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/DLL/OTAClient.dll");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var6) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/DLL/opencv_java320.dll")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/Dll/opencv_java320.dll");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/DLL/opencv_java320.dll");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var5) {
                 }
             }

             if (!(new File(System.getProperty("java.io.tmpdir") + "/BatchFile/DeleteAllTemporaryFiles.bat")).exists()) {
                 try {
                     inputUrl = this.getClass().getResource("/com/metlife/components/BatchFile/DeleteAllTemporaryFiles.bat");
                     dest = new File(System.getProperty("java.io.tmpdir") + "/BatchFile/DeleteAllTemporaryFiles.bat");
                     FileUtils.copyURLToFile(inputUrl, dest);
                 } catch (Exception var4) {
                 }
             }
         } catch (Exception var15) {
             System.err.println(var15.getMessage());
         }

     }

    public List<XmlInclude> constructIncludes(String... methodNames) {
        List<XmlInclude> includes = new ArrayList();
        String[] var3 = methodNames;
        int var4 = methodNames.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            String eachMethod = var3[var5];
            includes.add(new XmlInclude(eachMethod));
        }

        return includes;
    }

     public void releaseMemory() {
         this.mobileDetails = null;
         this.webDetails = null;
         this.desktopWeb = null;
         this.headless = null;
         mobileValue = (String[][]) null;
         WebValue = (String[][]) null;
         desktopValue = (String[][]) null;
         headLess = (String[][]) null;
         this.mobKeys = null;
         this.webKeys = null;
         this.desktopKeys = null;
         this.headlessKeys = null;
         configDataV = (String[][]) null;
     }

    @Test
    public void createXMLfile() throws Exception {
        System.out.println("1");
        int sheetCount = Integer.parseInt(getConfigData("sheetCount"));
        System.out.println("SheetCount -->" + sheetCount);
        String[] sheetName = (new Common_Functions()).GetMultipleTagXMLValue(getConfigData("sheetName"));
        System.out.println("SheetName Length -->" + sheetName.length);

        int i;
        for (i = 0; i < sheetCount; ++i) {
            System.out.println(sheetName[i]);
        }

        if (sheetCount == 1) {
            this.createTestNG(sheetName[0]);
        } else {
            for (i = 0; i < sheetCount; ++i) {
                this.createTestNG(sheetName[i]);
            }
        }

    }

    public void readConfigData() {
        Excel_Handling config = new Excel_Handling();
        config.ExcelReader(".\\src\\main\\resources\\com\\metlife\\components\\Config\\Config.xlsx", "Configuration", ".\\src\\main\\resources\\com\\metlife\\components\\Config\\Config.xlsx", "Configuration");

        try {
            this.ConfigData = config.getExcelDataAll("Configuration", "Select", "Y", "Config_Property");
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        len = this.ConfigData.size();
        configDataV = new String[2][this.ConfigData.size()];
        this.in = 0;
        String[] Keys = new String[this.ConfigData.size()];

        for (Iterator var3 = this.ConfigData.keySet().iterator(); var3.hasNext(); ++this.in) {
            String key = (String) var3.next();
            Keys[this.in] = key;
        }

        for (int cIndex = 0; cIndex < this.ConfigData.size(); ++cIndex) {
            configDataV[0][cIndex] = Excel_Handling.Get_Data(Keys[cIndex], "Config_Property");
            configDataV[1][cIndex] = Excel_Handling.Get_Data(Keys[cIndex], "Property_Value");
        }

        Excel_Handling.close();
    }

    public void createTestNG(String sheetName) throws Exception {
        WindowsProcess w = new WindowsProcess();
        w.kill("chromedriver.exe");
        w.kill("geckodriver.exe");
        w.kill("IEDriverServer.exe");
        w.kill("IEHeadLess.exe");
        w.kill("ALM-Client.exe");
        DOMConfigurator.configure("log4j.xml");
        Map<String, HashMap> mobileDeviceConfigData = null;
        Map<String, HashMap> perfectoWebDeviceConfigData = null;
        Map<String, HashMap> deskTopDeviceConfigData = null;
        Map<String, HashMap> headlessDeviceConfigData = null;
        Map<String, HashMap> rwdDevicesConfigData = null;
        Map<String, HashMap> pdfDevicesConfigData = null;
        Excel_Handling deviceConfig = new Excel_Handling();
        deviceConfig.ExcelReader(".\\src\\main\\resources\\com\\metlife\\components\\Config\\Config.xlsx", "DeviceConfig", ".\\src\\main\\resources\\com\\metlife\\components\\Config\\Config.xlsx", "DeviceConfig");
        String DeviceCapability_Value = "DeviceCapability_Value";

        Iterator var11;
        String key;
        int k;
        int l;
        try {
            this.in = 0;
            mobileDeviceConfigData = deviceConfig.getExcelDataAll("DeviceConfig", "DeviceType", "Perfecto Mobile", "Variable_Name");
            System.out.println("mobileDeviceConfigData-->" + mobileDeviceConfigData.size());
            mobileValue = new String[5][mobileDeviceConfigData.size()];
            this.mobKeys = new String[mobileDeviceConfigData.size()];

            for (var11 = mobileDeviceConfigData.keySet().iterator(); var11.hasNext(); ++this.in) {
                key = (String) var11.next();
                this.mobKeys[this.in] = key;
            }

            for (k = 0; k < 5; ++k) {
                for (l = 0; l < mobileDeviceConfigData.size(); ++l) {
                    mobileValue[k][l] = Excel_Handling.Get_Data(this.mobKeys[l], DeviceCapability_Value + (k + 1));
                }
            }
        } catch (Exception var32) {
            var32.printStackTrace();
        }

        try {
            perfectoWebDeviceConfigData = deviceConfig.getExcelDataAll("DeviceConfig", "DeviceType", "Perfecto Web", "Variable_Name");
            this.webKeys = new String[perfectoWebDeviceConfigData.size()];
            WebValue = new String[5][perfectoWebDeviceConfigData.size()];
            this.in = 0;

            for (var11 = perfectoWebDeviceConfigData.keySet().iterator(); var11.hasNext(); ++this.in) {
                key = (String) var11.next();
                this.webKeys[this.in] = key;
            }

            for (k = 0; k < 5; ++k) {
                for (l = 0; l < perfectoWebDeviceConfigData.size(); ++l) {
                    WebValue[k][l] = Excel_Handling.Get_Data(this.webKeys[l], DeviceCapability_Value + (k + 1));
                }
            }
        } catch (Exception var31) {
            var31.printStackTrace();
        }

        try {
            deskTopDeviceConfigData = deviceConfig.getExcelDataAll("DeviceConfig", "DeviceType", "Desktop Web", "Variable_Name");
            desktopValue = new String[5][deskTopDeviceConfigData.size()];
            this.desktopKeys = new String[deskTopDeviceConfigData.size()];
            this.in = 0;

            for (var11 = deskTopDeviceConfigData.keySet().iterator(); var11.hasNext(); ++this.in) {
                key = (String) var11.next();
                this.desktopKeys[this.in] = key;
            }

            for (k = 0; k < 5; ++k) {
                for (l = 0; l < 1; ++l) {
                    desktopValue[k][l] = Excel_Handling.Get_Data(this.desktopKeys[l], DeviceCapability_Value + (k + 1));
                }
            }
        } catch (Exception var30) {
            var30.printStackTrace();
        }

        try {
            headlessDeviceConfigData = deviceConfig.getExcelDataAll("DeviceConfig", "DeviceType", "HeadLess", "Variable_Name");
            headLess = new String[5][headlessDeviceConfigData.size()];
            this.headlessKeys = new String[headlessDeviceConfigData.size()];
            this.in = 0;

            for (var11 = headlessDeviceConfigData.keySet().iterator(); var11.hasNext(); ++this.in) {
                key = (String) var11.next();
                this.headlessKeys[this.in] = key;
            }

            for (k = 0; k < 5; ++k) {
                for (l = 0; l < 1; ++l) {
                    headLess[k][l] = Excel_Handling.Get_Data(this.headlessKeys[l], DeviceCapability_Value + (k + 1));
                }
            }
        } catch (Exception var29) {
            var29.printStackTrace();
        }

        try {
            rwdDevicesConfigData = deviceConfig.getExcelDataAll("DeviceConfig", "DeviceType", "RWD", "Variable_Name");
            this.rwdKeys = new String[rwdDevicesConfigData.size()];
            rwd = new String[5][rwdDevicesConfigData.size()];
            this.in = 0;

            for (var11 = rwdDevicesConfigData.keySet().iterator(); var11.hasNext(); ++this.in) {
                key = (String) var11.next();
                this.rwdKeys[this.in] = key;
            }

            for (k = 0; k < 5; ++k) {
                for (l = 0; l < rwdDevicesConfigData.size(); ++l) {
                    rwd[k][l] = Excel_Handling.Get_Data(this.rwdKeys[l], DeviceCapability_Value + (k + 1));
                }
            }
        } catch (Exception var28) {
            var28.printStackTrace();
        }

        Excel_Handling.close();

        try {
            this.UrlType = getConfigData("URLType");
        } catch (Exception var27) {
            this.UrlType = "Single";
        }

        if (!this.UrlType.contains("Single") && !this.UrlType.contains("Multiple") && !this.UrlType.contains("BambooURL")) {
            this.UrlType = "Single";
        }

        try {
            this.Mode = getConfigData("Execution_Type");
        } catch (Exception var26) {
            this.Mode = "Single";
        }

        if (!this.Mode.contains("Single") && !this.Mode.contains("CBT") && !this.Mode.contains("Multiple") && !this.Mode.contains("Hybrid") && !this.Mode.contains("RWD") && !this.Mode.contains("PDF")) {
            this.Mode = "Single";
        }

        Excel_Handling excel = new Excel_Handling();
        excel.ExcelReader(".\\src\\main\\resources\\com\\metlife\\components\\TestData\\Datasheet.xlsx", sheetName, ".\\src\\main\\resources\\com\\metlife\\components\\TestData\\Datasheet.xlsx", sheetName);

        try {
            this.ConfigData = excel.getExcelDataAll(sheetName, "Execute", "Y", "TC_ID");
        } catch (Exception var25) {
            var25.printStackTrace();
        }

        if (!this.ConfigData.isEmpty() && !this.Mode.contains("PDF")) {
            Map<String, HashMap> map = Excel_Handling.TestData;
            System.out.println("TestData ->" + Excel_Handling.TestData);
            System.out.println("Mode -->" + this.Mode);
            System.out.println("Test Start");
            int browserIns = Integer.parseInt(getConfigData("Browser_Instance"));
            Iterator var36;
//            String key;
            int i;
            if (!this.Mode.contains("Single") && !this.Mode.contains("CBT")) {
                if (this.Mode.contains("Multiple")) {
                    String tcount = getConfigData("TreadCount");
                    int threadcount = Integer.parseInt(tcount);
                    if (tcount.equals(String.valueOf(threadcount))) {
                        System.out.println("Same");
                    }

                    int keycount = map.keySet().size();
                    System.out.println(keycount);
                    if (threadcount > keycount) {
                        threadcount = keycount;
                    }

                    String[] KeysSets = new String[keycount + 1];
                    i = 1;
                    int TestCaseId = 0;

                    for (Iterator var21 = map.keySet().iterator(); var21.hasNext(); ++i) {
                        key = (String) var21.next();
                        KeysSets[i] = key;
                    }

                    for (int j = 1; j <= keycount; j += threadcount) {
                        suite.setName(getConfigData("Regression_Suite_Name"));
                        suite.setParallel("tests");
                        System.out.println("here u go");
                        if (keycount - TestCaseId < threadcount) {
                            System.out.println("here u went");
                            i = keycount - TestCaseId;
                        } else {
                            System.out.println("here u left");
                            i = threadcount;
                        }

                        System.out.println("outerloop " + j + " TestCaseId:" + TestCaseId + " keycount:" + keycount + " loopcount:" + i);
                        suite.setThreadCount(i);

                        for (k = 1; k <= i; ++k) {
                            ++TestCaseId;
                            System.out.println("inner loop " + k + " " + KeysSets[TestCaseId]);
                            key = KeysSets[TestCaseId];
                            test = new XmlTest(suite);
                            test.setName(key);
                            test.setPreserveOrder("true");
                            test.addParameter("deviceType", Excel_Handling.Get_Data(key, "DeviceType"));
                            test.addParameter("deviceValue", Excel_Handling.Get_Data(key, "DeviceValue"));
                            test.addParameter("tcID", key);
                            test.addParameter("reportID", key);
                            if (this.UrlType.equalsIgnoreCase("Single")) {
                                test.addParameter("appURL", getConfigData("AppUrl"));
                            } else if (this.UrlType.equalsIgnoreCase("Multiple")) {
                                test.addParameter("appURL", Excel_Handling.Get_Data(key, "URL"));
                            } else if (this.UrlType.equalsIgnoreCase("BambooURL")) {
                                test.addParameter("appURL", "${bamboo_URL}");
                            }

                            test.addParameter("temp", "temp");
                            testClass = new XmlClass();
                            testClass.setName("com.metlife.components.Tests." + Excel_Handling.Get_Data(key, "Class_Name"));
                            test.setXmlClasses(Arrays.asList(testClass));
                        }
                    }
                } else if (!this.Mode.contains("Hybrid")) {
                    if (this.Mode.contains("RWD")) {
                        var36 = map.keySet().iterator();

                        while (var36.hasNext()) {
                            key = (String) var36.next();
                            suite.setName(getConfigData("Regression_Suite_Name"));
                            test = new XmlTest(suite);
                            test.setName(key);
                            test.addParameter("deviceType", Excel_Handling.Get_Data(key, "DeviceType"));
                            test.addParameter("deviceValue", Excel_Handling.Get_Data(key, "DeviceValue"));
                            test.addParameter("tcID", key);
                            test.addParameter("reportID", key);
                            if (this.UrlType.equalsIgnoreCase("Single")) {
                                test.addParameter("appURL", getConfigData("AppUrl"));
                            } else if (this.UrlType.equalsIgnoreCase("Multiple")) {
                                test.addParameter("appURL", Excel_Handling.Get_Data(key, "URL"));
                            } else if (this.UrlType.equalsIgnoreCase("BambooURL")) {
                                test.addParameter("appURL", "${bamboo_URL}");
                            }

                            test.addParameter("temp", "temp");
                            testClass = new XmlClass();
                            testClass.setName("com.metlife.components.Tests." + Excel_Handling.Get_Data(key, "Class_Name"));
                            test.setXmlClasses(Arrays.asList(testClass));
                        }
                    }
                } else {
                    var36 = map.keySet().iterator();

                    label284:
                    while (true) {
                        while (true) {
                            while (true) {
                                if (!var36.hasNext()) {
                                    break label284;
                                }

                                key = (String) var36.next();
                                suite.setName(getConfigData("Regression_Suite_Name"));
                                if (this.Mode.contains("Hybrid")) {
                                    if (Integer.parseInt(getConfigData("Browser_Instance")) > 1) {
                                        suite.setParallel("tests");
                                        suite.setThreadCount(browserIns);

                                        for (i = 1; i <= browserIns; ++i) {
                                            test = new XmlTest(suite);
                                            test.setName(key + "_Instance_" + i);
                                            test.addParameter("deviceType", Excel_Handling.Get_Data(key, "DeviceType"));
                                            test.addParameter("deviceValue", Excel_Handling.Get_Data(key, "DeviceValue"));
                                            test.addParameter("tcID", key);
                                            test.addParameter("reportID", key + "_Instance_" + i);
                                            if (this.UrlType.equalsIgnoreCase("Single")) {
                                                test.addParameter("appURL", getConfigData("AppUrl"));
                                            } else if (this.UrlType.equalsIgnoreCase("Multiple")) {
                                                test.addParameter("appURL", Excel_Handling.Get_Data(key, "URL"));
                                            } else if (this.UrlType.equalsIgnoreCase("BambooURL")) {
                                                test.addParameter("appURL", "${bamboo_URL}");
                                            }

                                            test.addParameter("temp", "temp" + i);
                                            testClass = new XmlClass();
                                            testClass.setName("com.metlife.components.Tests." + Excel_Handling.Get_Data(key, "Class_Name"));
                                            test.setXmlClasses(Arrays.asList(testClass));
                                        }
                                    } else {
                                        test = new XmlTest(suite);
                                        test.setName(key);
                                        test.addParameter("deviceType", Excel_Handling.Get_Data(key, "DeviceType"));
                                        test.addParameter("deviceValue", Excel_Handling.Get_Data(key, "DeviceValue"));
                                        test.addParameter("tcID", key);
                                        test.addParameter("reportID", key);
                                        if (this.UrlType.equalsIgnoreCase("Single")) {
                                            test.addParameter("appURL", getConfigData("AppUrl"));
                                        } else if (this.UrlType.equalsIgnoreCase("Multiple")) {
                                            test.addParameter("appURL", Excel_Handling.Get_Data(key, "URL"));
                                        } else if (this.UrlType.equalsIgnoreCase("BambooURL")) {
                                            test.addParameter("appURL", "${bamboo_URL}");
                                        }

                                        test.addParameter("temp", "temp");
                                        testClass = new XmlClass();
                                        testClass.setName("com.metlife.components.Tests." + Excel_Handling.Get_Data(key, "Class_Name"));
                                        test.setXmlClasses(Arrays.asList(testClass));
                                    }
                                } else if (this.Mode.contains("CBT")) {
                                }
                            }
                        }
                    }
                }
            } else {
                var36 = map.keySet().iterator();

                label305:
                while (true) {
                    while (true) {
                        while (true) {
                            if (!var36.hasNext()) {
                                break label305;
                            }

                            key = (String) var36.next();
                            suite.setName(getConfigData("Regression_Suite_Name"));
                            if (this.Mode.contains("Single")) {
                                if (Integer.parseInt(getConfigData("Browser_Instance")) > 1) {
                                    suite.setParallel("tests");
                                    suite.setThreadCount(browserIns);

                                    for (i = 1; i <= browserIns; ++i) {
                                        test = new XmlTest(suite);
                                        test.setName(key + "_Instance_" + i);
                                        test.addParameter("deviceType", Excel_Handling.Get_Data(key, "DeviceType"));
                                        test.addParameter("deviceValue", Excel_Handling.Get_Data(key, "DeviceValue"));
                                        test.addParameter("tcID", key);
                                        test.addParameter("reportID", key + "_Instance_" + i);
                                        if (this.UrlType.equalsIgnoreCase("Single")) {
                                            test.addParameter("appURL", getConfigData("AppUrl"));
                                        } else if (this.UrlType.equalsIgnoreCase("Multiple")) {
                                            test.addParameter("appURL", Excel_Handling.Get_Data(key, "URL"));
                                        } else if (this.UrlType.equalsIgnoreCase("BambooURL")) {
                                            test.addParameter("appURL", "${bamboo_URL}");
                                        }

                                        test.addParameter("temp", "temp" + i);
                                        testClass = new XmlClass();
                                        testClass.setName("com.metlife.components.Tests." + Excel_Handling.Get_Data(key, "Class_Name"));
                                        test.setXmlClasses(Arrays.asList(testClass));
                                    }
                                } else {
                                    test = new XmlTest(suite);
                                    test.setName(key);
                                    test.addParameter("deviceType", Excel_Handling.Get_Data(key, "DeviceType"));
                                    test.addParameter("deviceValue", Excel_Handling.Get_Data(key, "DeviceValue"));
                                    test.addParameter("tcID", key);
                                    test.addParameter("reportID", key);
                                    if (this.UrlType.equalsIgnoreCase("Single")) {
                                        test.addParameter("appURL", getConfigData("AppUrl"));
                                    } else if (this.UrlType.equalsIgnoreCase("Multiple")) {
                                        test.addParameter("appURL", Excel_Handling.Get_Data(key, "URL"));
                                    } else if (this.UrlType.equalsIgnoreCase("BambooURL")) {
                                        test.addParameter("appURL", "${bamboo_URL}");
                                    }

                                    test.addParameter("temp", "temp");
                                    testClass = new XmlClass();
                                    testClass.setName("com.metlife.components.Tests." + Excel_Handling.Get_Data(key, "Class_Name"));
                                    test.setXmlClasses(Arrays.asList(testClass));
                                }
                            } else if (this.Mode.contains("CBT")) {
                            }
                        }
                    }
                }
            }

            List<String> suites = new ArrayList();
            key = "testNG_" + sheetName + ".xml";
            File f = new File(key);
            f.createNewFile();
            FileWriter fw = new FileWriter(f.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(suite.toXml());
            bw.close();
            suites.add(f.getPath());
            testNG.setTestSuites(suites);
            testNG.run();
            f.delete();
            test = null;
            testClass = null;
            testNG = new TestNG();
            suite = new XmlSuite();

            try {
                if (getConfigData("ExecuteFailCase").equalsIgnoreCase("Yes")) {
                    TestNG failRunner = new TestNG();
                    List<String> suitesFail = new ArrayList();
                    key = System.getProperty("user.dir") + "\\test-output\\testng-failed.xml";
                    f = new File(key);
                    System.out.println(f.getPath());
                    suitesFail.add(f.getPath());
                    failRunner.setTestSuites(suitesFail);
                    failRunner.run();
                }
            } catch (Exception var24) {
            }

            Excel_Handling.close();
        } else if (this.Mode.contains("PDF")) {
            suite.setName(getConfigData("Regression_Suite_Name"));
            test = new XmlTest(suite);
            test.setName("PDFAutomationTestDriver");
            testClass = new XmlClass();
            testClass.setName("com.metlife.PDF.PDFUtility.PDFAutomationTestDriver");
            test.setXmlClasses(Arrays.asList(testClass));
            List<String> suites = new ArrayList();
            String fileName = "testNG_" + sheetName + ".xml";
            File f = new File(fileName);
            f.createNewFile();
            FileWriter fw = new FileWriter(f.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(suite.toXml());
            bw.close();
            suites.add(f.getPath());
            testNG.setTestSuites(suites);
            testNG.run();
            f.delete();
            Excel_Handling.close();
            test = null;
            testClass = null;
            testNG = new TestNG();
            suite = new XmlSuite();
        }

    }


    public boolean killProcessRunning(String serviceName) throws Exception {
        boolean flag = false;

        try {
            Process p = Runtime.getRuntime().exec("tasklist");
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(serviceName)) {
                    Runtime.getRuntime().exec("taskkill /F /IM " + serviceName);
                    flag = true;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        return flag;
    }


    public static String getConfigData(String Config_Property) {
        String value = null;

        try {
            for (int i = 0; i < len; ++i) {
                if (configDataV[0][i].equalsIgnoreCase(Config_Property)) {
                    value = configDataV[1][i];
                    break;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return value;
    }

    public static void main(String[] args) throws Exception {
        Create_TestNGXML c = new Create_TestNGXML();
        c.createXMLfile();
    }
}

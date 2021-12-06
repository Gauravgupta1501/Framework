package com.metlife.components.setup;

import com.metlife.base.TestBase.TestDevice;
import com.metlife.components.Reporting.DocTestManager;
import com.metlife.components.Reporting.ExtentManager;
import com.metlife.components.Reporting.ExtentTestManager;
import com.metlife.components.Utilities.Create_TestNGXML;
import com.metlife.components.Utilities.Log;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverSetup {
    static Properties properties = null;
    //    public static AppiumDriver<WebElement> appiumdriver = null;
//    ATUTestRecorder recorder = null;
//    public String driverPath = "/com/metlife/components/Drivers";
    public static WebDriver driverAppTwo = null;
    public WebDriver driver = null;
    public String TC_ID = null;
    public String appURL = null;
    WindowsProcess process = new WindowsProcess();
    public String host = null;
    public String perfectoUserName = null;
    public String perfectoPassword = null;
    public String url = null;
    public static String bFlag = null;
    public static Log log = null;
    public static String[] device = null;
    public static boolean bRWDflag = false;
    public static String devValue = null;
    public static String deviceType = null;
    public static String deviceValue = null;
    public static int TimeOut = 0;

    public DriverSetup() {
        this.host = Create_TestNGXML.getConfigData("Perfecto_Hostname");
        this.perfectoUserName = Create_TestNGXML.getConfigData("Perfecto_UserName");
        this.perfectoPassword = Create_TestNGXML.getConfigData("Perfecto_Password");
        this.url = "https://" + this.host + "/nexperience/perfectomobile/wd/hub";
        bFlag = Create_TestNGXML.getConfigData("RecordingFlag");
        log = new Log(this.getClass().getName());
    }

    private void setDriver(int i, String[] deviceDetail) throws InterruptedException {
        /*if (i == 1) {
            bRWDflag = false;
            if (deviceDetail[8].equalsIgnoreCase("Web")) {
                if (deviceDetail[0].equalsIgnoreCase("iOS")) {
                    appiumdriver = this.initIOSDriver(deviceDetail);
                } else if (deviceDetail[0].equalsIgnoreCase("Android")) {
                    appiumdriver = this.initAndroidDriver(deviceDetail);
                }
            } else if (deviceDetail[8].equalsIgnoreCase("Native_iOS")) {
                appiumdriver = this.initNativeIOSDriver(deviceDetail);
            } else if (deviceDetail[8].equalsIgnoreCase("Native_Android")) {
                appiumdriver = this.initNativeAndroidDriver(deviceDetail);
            }
        }*/
        if (i == 2) {
            bRWDflag = false;
            this.driver = this.initPerfectoWebDriver(deviceDetail);
        } else if (i == 3) {
            bRWDflag = false;
            if (this.appURL.split(",").length == 2) {
                if (deviceDetail[0].equalsIgnoreCase("Chrome")) {
                    this.driver = this.initChromeDriver(this.appURL.split(",")[0], 2);
                    driverAppTwo = this.initChromeDriver(this.appURL.split(",")[1], 2);
                } else if (deviceDetail[0].equalsIgnoreCase("IE")) {
                    this.driver = this.initIEDriver(this.appURL.split(",")[0]);
                    driverAppTwo = this.initIEDriver(this.appURL.split(",")[1]);
                } else if (deviceDetail[0].equalsIgnoreCase("firefox")) {
                    this.driver = this.initFirefoxDriver(this.appURL.split(",")[0]);
                    driverAppTwo = this.initFirefoxDriver(this.appURL.split(",")[1]);
                } else if (deviceDetail[0].equalsIgnoreCase("Edge")) {
                    this.driver = this.initEdgeDriver(this.appURL.split(",")[0]);
                    driverAppTwo = this.initEdgeDriver(this.appURL.split(",")[1]);
                }
            } else if (deviceDetail[0].equalsIgnoreCase("Chrome")) {
                this.driver = this.initChromeDriver(this.appURL, 1);
            } else if (deviceDetail[0].equalsIgnoreCase("IE")) {
                this.driver = this.initIEDriver(this.appURL);
            } else if (deviceDetail[0].equalsIgnoreCase("firefox")) {
                this.driver = this.initFirefoxDriver(this.appURL);
            } else if (deviceDetail[0].equalsIgnoreCase("Edge")) {
                this.driver = this.initEdgeDriver(this.appURL);
            }
        } else if (i == 4) {
            bRWDflag = false;
            if (deviceDetail[0].equalsIgnoreCase("HeadLessChrome")) {
                this.driver = this.initHeadLessChromeDriver(this.appURL);
            } else if (deviceDetail[0].equalsIgnoreCase("HeadLessIE")) {
                this.driver = this.initIEHeadLessDriver(this.appURL);
            } else if (deviceDetail[0].equalsIgnoreCase("HeadLessFireFox")) {
                this.driver = this.initHeadLessFirefoxDriver(this.appURL);
            }else if (deviceDetail[0].equalsIgnoreCase("HeadLessEdge")) {
                this.driver = this.initHeadLessEdgeDriver(this.appURL);
            }

        } else if (i == 5) {
            System.out.println("RWD Test");
            bRWDflag = true;
        } else if (i == 6) {
            if (deviceDetail[0].equalsIgnoreCase("Chrome")) {
                this.driver = this.initChromeDriver(this.appURL, 1);
            } else if (deviceDetail[0].equalsIgnoreCase("IE")) {
                this.driver = this.initIEDriver(this.appURL);
            } else if (deviceDetail[0].equalsIgnoreCase("firefox")) {
                this.driver = this.initFirefoxDriver(this.appURL);
            }

            bRWDflag = true;
        }

        if (!bRWDflag) {
            TimeOut = Integer.parseInt(Create_TestNGXML.getConfigData("TimeOut"));
            if (this.driver != null) {
                this.driver.manage().timeouts().implicitlyWait((long) TimeOut, TimeUnit.SECONDS);
            }

            if (driverAppTwo != null) {
                driverAppTwo.manage().timeouts().implicitlyWait((long) TimeOut, TimeUnit.SECONDS);
            }

           /* if (appiumdriver != null) {
                appiumdriver.manage().timeouts().implicitlyWait((long)TimeOut, TimeUnit.SECONDS);
            }*/
        }

    }

    private WebDriver initWindowsDriver(String appURL) {
        return null;
    }

    private WebDriver initHeadLessChromeDriver(String appURL) {
        try {
            this.process.kill("chromedriver.exe");
            System.out.println("Launching google chrome with new profile..");
            System.setProperty("webdriver.chrome.driver", System.getProperty("java.io.tmpdir") + "/Drivers/chromedriver.exe");
        //  System.setProperty("webdriver.chrome.driver", Constants.driverPath+"chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments(new String[]{"headless"});
            options.addArguments(new String[]{"window-size=1366x3500"});
            options.addArguments(new String[]{"disable-dev-shm-usage"});
            this.driver = new ChromeDriver(options);
            this.driver.manage().window().maximize();
            this.driver.navigate().to(appURL);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return this.driver;
    }

    private WebDriver initIEHeadLessDriver(String appURL) {
        try {
            System.out.println("Launching Internet Explorer with new profile..");
            System.out.println("Launching Internet Explorer with new profile..");
            System.setProperty("webdriver.ie.driver", System.getProperty("java.io.tmpdir") + "/Drivers/IEHeadLess.exe");
 //         System.setProperty("webdriver.ie.driver", Constants.driverPath+"IEHeadLess.exe");

            DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
            cap.setCapability("ignoreProtectedModeSettings", true);
            cap.setCapability("requireWindowFocus", true);
            cap.setCapability("nativeEvents", false);
            cap.setCapability("unexpectedAlertBehaviour", "accept");
            cap.setCapability("ignoreProtectedModeSettings", true);
            cap.setCapability("disable-popup-blocking", true);
            cap.setCapability("enablePersistentHover", true);
            cap.setCapability("ignoreZoomSetting", true);
            cap.setJavascriptEnabled(true);
            this.driver = new InternetExplorerDriver(cap);
            this.driver.manage().window().maximize();
            this.driver.navigate().to(appURL);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return this.driver;
    }

    private WebDriver initPerfectoWebDriver(String[] deviceDetail) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (deviceDetail[0].trim().length() > 0) {
                capabilities.setCapability("platformName", deviceDetail[0]);
            }

            if (deviceDetail[1].trim().length() > 0) {
                capabilities.setCapability("platformVersion", deviceDetail[1]);
            }

            if (deviceDetail[2].trim().length() > 0) {
                capabilities.setCapability("browserName", deviceDetail[2]);
            }

            if (deviceDetail[3].trim().length() > 0) {
                capabilities.setCapability("browserVersion", deviceDetail[3]);
            }

            if (deviceDetail[4].trim().length() > 0) {
                capabilities.setCapability("resolution", deviceDetail[4]);
            }

            if (deviceDetail[5].trim().length() > 0) {
                capabilities.setCapability("location", deviceDetail[5]);
            }

            capabilities.setCapability("user", this.perfectoUserName);
            capabilities.setCapability("password", this.perfectoPassword);
            capabilities.setJavascriptEnabled(true);
            this.driver = new RemoteWebDriver(new URL(this.url), capabilities);
            this.driver.get(this.appURL);
            System.out.println(this.driver);
        } catch (Exception var3) {
            System.out.println("Error in getting driver ->" + var3.getMessage());
            var3.printStackTrace();
        }

        return this.driver;
    }

    /*private AppiumDriver<WebElement> initNativeIOSDriver(String[] deviceDetails) throws InterruptedException {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("bundleId", Create_TestNGXML.getConfigData("AppPackageName"));
            capabilities.setCapability("autoInstrument", true);
            capabilities.setCapability("fullReset", false);
            if (deviceDetails[0].trim().length() > 0) {
                capabilities.setCapability("platformName", deviceDetails[0]);
            }

            if (deviceDetails[1].trim().length() > 0) {
                capabilities.setCapability("platformVersion", deviceDetails[1]);
            }

            if (deviceDetails[2].trim().length() > 0) {
                capabilities.setCapability("manufacturer", deviceDetails[2]);
            }

            if (deviceDetails[3].trim().length() > 0) {
                capabilities.setCapability("model", deviceDetails[3]);
            }

            if (deviceDetails[4].trim().length() > 0) {
                capabilities.setCapability("location", deviceDetails[4]);
            }

            if (deviceDetails[5].trim().length() > 0) {
                capabilities.setCapability("resolution", deviceDetails[5]);
            }

            if (deviceDetails[6].trim().length() > 0) {
                capabilities.setCapability("network", deviceDetails[6]);
            }

            if (deviceDetails[7].trim().length() > 0) {
                capabilities.setCapability("deviceName", deviceDetails[7]);
            }

            capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("orientation", deviceDetails[9]);
            capabilities.setCapability("user", this.perfectoUserName);
            capabilities.setCapability("password", this.perfectoPassword);
            capabilities.setCapability("cameraInstrument", true);
            appiumdriver = new IOSDriver(new URL(this.url), capabilities);
            System.out.println(appiumdriver);
        } catch (Exception var4) {
            System.out.println("error ->" + var4.getMessage());
            var4.printStackTrace();
            String ErrToRep = var4.getMessage().substring(0, var4.getMessage().indexOf("Command duration") - 1);
            System.out.println(ErrToRep);
            return null;
        }

        if (appiumdriver != null) {
            Thread.sleep(25000L);
            appiumdriver.launchApp();
        }

        return appiumdriver;
    }

    private AppiumDriver<WebElement> initNativeAndroidDriver(String[] deviceDetails) throws InterruptedException {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            System.out.println(Create_TestNGXML.getConfigData("AppPackageName"));
            capabilities.setCapability("appPackage", Create_TestNGXML.getConfigData("AppPackageName"));
            capabilities.setCapability("autoInstrument", true);
            capabilities.setCapability("fullReset", false);
            if (deviceDetails[0].trim().length() > 0) {
                capabilities.setCapability("platformName", deviceDetails[0]);
            }

            if (deviceDetails[1].trim().length() > 0) {
                capabilities.setCapability("platformVersion", deviceDetails[1]);
            }

            if (deviceDetails[2].trim().length() > 0) {
                capabilities.setCapability("manufacturer", deviceDetails[2]);
            }

            if (deviceDetails[3].trim().length() > 0) {
                capabilities.setCapability("model", deviceDetails[3]);
            }

            if (deviceDetails[4].trim().length() > 0) {
                capabilities.setCapability("location", deviceDetails[4]);
            }

            if (deviceDetails[5].trim().length() > 0) {
                capabilities.setCapability("resolution", deviceDetails[5]);
            }

            if (deviceDetails[6].trim().length() > 0) {
                capabilities.setCapability("network", deviceDetails[6]);
            }

            if (deviceDetails[7].trim().length() > 0) {
                capabilities.setCapability("deviceName", deviceDetails[7]);
            }

            capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("user", this.perfectoUserName);
            capabilities.setCapability("password", this.perfectoPassword);
            capabilities.setCapability("cameraInstrument", true);
            appiumdriver = new AndroidDriver(new URL(this.url), capabilities);
            System.out.println(appiumdriver);
        } catch (Exception var4) {
            String ErrToRep = var4.getMessage().substring(0, var4.getMessage().indexOf("Command duration") - 1);
            System.out.println(ErrToRep);
            return null;
        }

        if (appiumdriver != null) {
            Thread.sleep(25000L);
            appiumdriver.launchApp();
        }

        return appiumdriver;
    }

    private AppiumDriver<WebElement> initIOSDriver(String[] deviceDetails) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (deviceDetails[0].trim().length() > 0) {
                capabilities.setCapability("platformName", deviceDetails[0]);
            }

            if (deviceDetails[1].trim().length() > 0) {
                capabilities.setCapability("platformVersion", deviceDetails[1]);
            }

            if (deviceDetails[2].trim().length() > 0) {
                capabilities.setCapability("manufacturer", deviceDetails[2]);
            }

            if (deviceDetails[3].trim().length() > 0) {
                capabilities.setCapability("model", deviceDetails[3]);
            }

            if (deviceDetails[4].trim().length() > 0) {
                capabilities.setCapability("location", deviceDetails[4]);
            }

            if (deviceDetails[5].trim().length() > 0) {
                capabilities.setCapability("resolution", deviceDetails[5]);
            }

            if (deviceDetails[6].trim().length() > 0) {
                capabilities.setCapability("network", deviceDetails[6]);
            }

            if (deviceDetails[7].trim().length() > 0) {
                capabilities.setCapability("deviceName", deviceDetails[7]);
            }

            capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("user", this.perfectoUserName);
            capabilities.setCapability("password", this.perfectoPassword);
            appiumdriver = new IOSDriver(new URL(this.url), capabilities);
            System.out.println(appiumdriver);
            appiumdriver.get(this.appURL);
        } catch (Exception var3) {
            System.out.println(var3.getMessage());
            log.error("Error in getting driver");
            var3.printStackTrace();
        }

        return appiumdriver;
    }

    private AppiumDriver<WebElement> initAndroidDriver(String[] deviceDetails) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (deviceDetails[0].trim().length() > 0) {
                capabilities.setCapability("platformName", deviceDetails[0]);
            }

            if (deviceDetails[1].trim().length() > 0) {
                capabilities.setCapability("platformVersion", deviceDetails[1]);
            }

            if (deviceDetails[2].trim().length() > 0) {
                capabilities.setCapability("manufacturer", deviceDetails[2]);
            }

            if (deviceDetails[3].trim().length() > 0) {
                capabilities.setCapability("model", deviceDetails[3]);
            }

            if (deviceDetails[4].trim().length() > 0) {
                capabilities.setCapability("location", deviceDetails[4]);
            }

            if (deviceDetails[5].trim().length() > 0) {
                capabilities.setCapability("resolution", deviceDetails[5]);
            }

            if (deviceDetails[6].trim().length() > 0) {
                capabilities.setCapability("network", deviceDetails[6]);
            }

            if (deviceDetails[7].trim().length() > 0) {
                capabilities.setCapability("deviceName", deviceDetails[7]);
            }

            capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("orientation", deviceDetails[9]);
            capabilities.setCapability("user", this.perfectoUserName);
            capabilities.setCapability("password", this.perfectoPassword);
            appiumdriver = new AndroidDriver(new URL(this.url), capabilities);
            appiumdriver.get(this.appURL);
            System.out.println(appiumdriver);
            this.driver = appiumdriver;
        } catch (Exception var3) {
            System.out.println("Error in getting driver ->" + var3.getMessage());
            var3.printStackTrace();
        }

        return appiumdriver;
    }
*/
    private WebDriver initIEDriver(String appURL) {
        try {
            System.out.println("Launching Internet Explorer with new profile..");
            System.setProperty("webdriver.ie.driver", System.getProperty("java.io.tmpdir") + "/Drivers/IEDriverServer64.exe");
      //    System.setProperty("webdriver.ie.driver", Constants.driverPath+"IEDriverServer64.exe");
            DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
            System.out.println("t1");
            cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            cap.setCapability("ignoreProtectedModeSettings", true);
            cap.setCapability("requireWindowFocus", true);
            System.out.println("Ignore Protected Mode Settings and Require Window Focus is set to True");
            cap.setCapability("nativeEvents", false);
            cap.setCapability("unexpectedAlertBehaviour", "accept");
            System.out.println("Native Events is set to False and Unexpected Alert Behaviour is set to Accept");
            cap.setCapability("disable-popup-blocking", true);
            System.out.println("disable-popup-blocking set to True");
            cap.setCapability("enablePersistentHover", true);
            System.out.println("enablePersistentHover set to True");
            cap.setCapability("ignoreZoomSetting", true);
            System.out.println("ignoreZoomSetting set to True");
            cap.setCapability("javascriptEnabled", true);
            System.out.println("javascriptEnabled set to True");
            cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            System.out.println("ACCEPT_SSL_CERTS set to True");
            cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
            System.out.println("Cleaned the Cache");
            System.out.println("INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS -->" + cap.getCapability("ignoreProtectedModeSettings"));
            System.out.println("ignoreProtectedModeSettings -->" + cap.getCapability("ignoreProtectedModeSettings"));
            InternetExplorerOptions opt = new InternetExplorerOptions(cap);
            this.driver = new InternetExplorerDriver(opt);
            System.out.println("t1");
            this.driver.manage().window().maximize();
            this.driver.get(appURL);
        } catch (Exception var4) {
            System.out.println("Error in InternetExplorer-->" + var4.getMessage());
        }

        return this.driver;
    }

    private WebDriver initPhantomJSDriver(String appURL) {
        try {
            System.out.println("Launching PhantomJS browser with new profile..");
            String src = System.getProperty("java.io.tmpdir") + "/Drivers/phantomjs.exe";
            System.out.println(src);
            System.setProperty("phantomjs.binary.path", src);
            DesiredCapabilities cap = DesiredCapabilities.phantomjs();
            cap.setJavascriptEnabled(true);
            cap.setCapability("phantomjs.binary.path", System.getProperty("phantomjs.binary.path"));
            this.driver = new PhantomJSDriver(cap);
            this.driver.manage().window().maximize();
            this.driver.navigate().to(appURL);
        } catch (Exception var4) {
        }

        return this.driver;
    }

    private WebDriver initChromeDriver(String appURL, int index) {
        try {
            new Dimension(1366, 4000);
            System.out.println("Launching google chrome with new profile..");
            System.setProperty("webdriver.chrome.driver", System.getProperty("java.io.tmpdir") + "/Drivers/chromedriver.exe");
  //          System.setProperty("webdriver.chrome.driver", Constants.driverPath+"chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments(new String[]{"window-size=1366x4000"});
            options.addArguments(new String[]{"--disable-dev-shm-usage"});
            if (index == 1) {
                this.driver = new ChromeDriver(options);
                this.driver.manage().window().maximize();
                this.driver.get(appURL);
                return this.driver;
            }

            if (index == 2) {
                driverAppTwo = new ChromeDriver(options);
                this.driver.manage().window().maximize();
                driverAppTwo.get(appURL);
                return driverAppTwo;
            }
        } catch (Exception var5) {
            System.out.println(var5.getMessage());
        }

        return this.driver;
    }

    private WebDriver initFirefoxDriver(String appURL) {
        boolean flag = false;

        try {
            System.out.println("Launching Firefox browser..");
            String path = Create_TestNGXML.getConfigData("FireFoxBinaryPath");
            System.out.println("path-->" + path);

            try {
                if (path.contains("exe")) {
                    flag = true;
                }
            } catch (Exception var10) {
                flag = false;
            }

            if (flag) {
                File pathToBinary = new File(path);
                FirefoxBinary binary = new FirefoxBinary(pathToBinary);
                System.setProperty("webdriver.gecko.driver", System.getProperty("java.io.tmpdir") + "/Drivers/geckodriver.exe");
          //      System.setProperty("webdriver.gecko.driver", Constants.driverPath+"geckodriver.exe");
                FirefoxProfile fp = new FirefoxProfile();
                ProfilesIni profileIni = new ProfilesIni();
                fp.setPreference("network.proxy.type", 0);
                fp = profileIni.getProfile("developer");
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                FirefoxOptions opt = new FirefoxOptions(capabilities);
                opt.setAcceptInsecureCerts(true);
                opt.setBinary(binary);
                opt.setProfile(fp);
                opt.setCapability("acceptSslCerts", true);
                this.driver = new FirefoxDriver(opt);
                System.out.println(this.driver);
                this.driver.manage().window().maximize();
                this.driver.get(appURL);
            } else {
                System.setProperty("webdriver.gecko.driver", System.getProperty("java.io.tmpdir") + "/Drivers/geckodriver.exe");
          //      System.setProperty("webdriver.gecko.driver", Constants.driverPath+"geckodriver.exe");
                FirefoxProfile fp = new FirefoxProfile();
                ProfilesIni profileIni = new ProfilesIni();
                fp.setPreference("network.proxy.type", 0);
                fp = profileIni.getProfile("developer");
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                FirefoxOptions opt = new FirefoxOptions(capabilities);
                opt.setAcceptInsecureCerts(true);
                opt.setProfile(fp);
                opt.setCapability("acceptSslCerts", true);
                this.driver = new FirefoxDriver(opt);
                this.driver.manage().window().maximize();
                this.driver.navigate().to(appURL);
            }
        } catch (Exception var11) {
            var11.printStackTrace();
            log.error(var11.getMessage());
        }

        return this.driver;
    }

    private WebDriver initEdgeDriver(String appURL) {
        System.out.println("Launching Edge browser..");
      System.setProperty("webdriver.edge.driver", System.getProperty("java.io.tmpdir") + "/Drivers/msedgedriver.exe");

      //  System.setProperty("webdriver.edge.driver", Constants.driverPath+"msedgedriver.exe");
      //  DesiredCapabilities capabilities = DesiredCapabilities.edge();
        EdgeOptions capabilities = new EdgeOptions();
        capabilities.setCapability("acceptSslCerts", true);
        capabilities.setCapability("requireWindowFocus", true);
       // capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability("ignoreProtectedModeSettings", true);
        capabilities.setCapability("requireWindowFocus", true);
        System.out.println("Ignore Protected Mode Settings and Require Window Focus is set to True");
        capabilities.setCapability("nativeEvents", false);
        capabilities.setCapability("unexpectedAlertBehaviour", "accept");
        System.out.println("Native Events is set to False and Unexpected Alert Behaviour is set to Accept");
        capabilities.setCapability("disable-popup-blocking", true);
        System.out.println("disable-popup-blocking set to True");
        capabilities.setCapability("enablePersistentHover", true);
        System.out.println("enablePersistentHover set to True");
        capabilities.setCapability("ignoreZoomSetting", true);
        System.out.println("ignoreZoomSetting set to True");
        capabilities.setCapability("javascriptEnabled", true);
        System.out.println("javascriptEnabled set to True");
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        System.out.println("ACCEPT_SSL_CERTS set to True");
        //capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        this.driver = new EdgeDriver(capabilities);
        this.driver.manage().window().maximize();
        this.driver.navigate().to(appURL);
        return this.driver;
    }




    private WebDriver initHeadLessEdgeDriver(String appURL) {
        System.out.println("Launching Edge browser..");
        System.setProperty("webdriver.edge.driver", System.getProperty("java.io.tmpdir") + "/Drivers/msedgedriver.exe");

        //       System.setProperty("webdriver.edge.driver", Constants.driverPath+"msedgedriver.exe");
        //DesiredCapabilities capabilities = DesiredCapabilities.edge();
        EdgeOptions capabilities = new EdgeOptions();
        capabilities.setCapability("acceptSslCerts", true);
        capabilities.setCapability("requireWindowFocus", true);
        // capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability("ignoreProtectedModeSettings", true);
        capabilities.setCapability("requireWindowFocus", true);
        System.out.println("Ignore Protected Mode Settings and Require Window Focus is set to True");
        capabilities.setCapability("nativeEvents", false);
        capabilities.setCapability("unexpectedAlertBehaviour", "accept");
        System.out.println("Native Events is set to False and Unexpected Alert Behaviour is set to Accept");
        capabilities.setCapability("disable-popup-blocking", true);
        System.out.println("disable-popup-blocking set to True");
        capabilities.setCapability("enablePersistentHover", true);
        System.out.println("enablePersistentHover set to True");
        capabilities.setCapability("ignoreZoomSetting", true);
        System.out.println("ignoreZoomSetting set to True");
        capabilities.setCapability("javascriptEnabled", true);
        System.out.println("javascriptEnabled set to True");
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        System.out.println("ACCEPT_SSL_CERTS set to True");
        //capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        this.driver = new EdgeDriver(capabilities);
        this.driver.manage().window().maximize();
        this.driver.navigate().to(appURL);
        return this.driver;
    }

    private WebDriver initHeadLessFirefoxDriver(String appURL) {
        boolean flag = false;

        try {
            System.out.println("Launching Firefox browser..");
            String path = Create_TestNGXML.getConfigData("FireFoxBinaryPath");
            System.out.println("path-->" + path);

            try {
                if (path.contains("exe")) {
                    flag = true;
                }
            } catch (Exception var10) {
                flag = false;
            }

            if (flag) {
                File pathToBinary = new File(path);
                FirefoxBinary binary = new FirefoxBinary(pathToBinary);
                binary.addCommandLineOptions(new String[]{"--headless"});
               System.setProperty("webdriver.gecko.driver", System.getProperty("java.io.tmpdir") + "/Drivers/geckodriver.exe");
 //               System.setProperty("webdriver.gecko.driver",Constants.driverPath+"geckodriver.exe");
                new FirefoxProfile();
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", false);
                FirefoxOptions opt = new FirefoxOptions(capabilities);
                capabilities.setCapability("moz:firefoxOptions", opt.setBinary(binary));
                this.driver = new FirefoxDriver(opt);
                this.driver.manage().window().maximize();
                this.driver.navigate().to(appURL);
            } else {
                FirefoxBinary binary = new FirefoxBinary();
                binary.addCommandLineOptions(new String[]{"--headless"});
                System.setProperty("webdriver.gecko.driver", System.getProperty("java.io.tmpdir") + "/Drivers/geckodriver.exe");
//              System.setProperty("webdriver.gecko.driver", Constants.driverPath+"geckodriver.exe");
                new FirefoxProfile();
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", false);
                FirefoxOptions opt = new FirefoxOptions(capabilities);
                this.driver = new FirefoxDriver(opt);
                this.driver.manage().window().maximize();
                this.driver.navigate().to(appURL);
            }
        } catch (Exception var10) {
            log.error(var10.getMessage());
        }

        return this.driver;
    }

    @Parameters({"deviceType", "reportID", "deviceValue", "appURL", "tcID"})
    @BeforeClass
    public void initializeTestBaseSetup(String deviceType, String reportID, String deviceValue, String appURL, String tcID) throws Exception {
        System.out.println("initializeTestBaseSetup()");
        ExtentTestManager.startTest(tcID);
        DocTestManager.startTest(tcID);
        System.out.println("Test-->" + deviceType);
        this.TC_ID = tcID;
        this.appURL = appURL;
        String temp = null;
        DriverSetup.deviceType = deviceType;
        DriverSetup.deviceValue = deviceValue;
        /*if (bFlag.equalsIgnoreCase("true")) {
            this.VideoRecorderStart();
        }*/

        try {
            if (deviceType.equalsIgnoreCase("Perfecto Web")) {
                temp = "Perfecto Web";
                device = this.getDeviceParameter(deviceType, deviceValue);
                this.setDriver(2, device);
            }

            if (deviceType.equalsIgnoreCase("Perfecto Mobile")) {
                temp = "Perfecto Mobile";
                device = this.getDeviceParameter(deviceType, deviceValue);
                this.setDriver(1, device);
            }

            if (deviceType.equalsIgnoreCase("Desktop Web")) {
                temp = "Desktop";
                System.out.println("temp-->" + temp);
                device = this.getDeviceParameter(deviceType, deviceValue);
                this.setDriver(3, device);
            }

            if (deviceType.equalsIgnoreCase("HeadLess")) {
                temp = "Headless";
                device = this.getDeviceParameter(deviceType, deviceValue);
                this.setDriver(4, device);
            }

            if (deviceType.equalsIgnoreCase("RWD")) {
                temp = "RWD";
                device = this.getDeviceParameter(deviceType, deviceValue);
                if (device[0].equalsIgnoreCase("Perfecto Mobile") || device[0].equalsIgnoreCase("Perfecto Web")) {
                    devValue = deviceValue;
                }

                this.setDriver(5, device);
            }
        } catch (Exception var8) {
            log.error(temp);
            log.error("Error in initialize Test Base Setup function....." + var8.getMessage());
        }

    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void reinitiateDriver(String url) throws InterruptedException {
        this.appURL = url;
        this.setDriver(6, device);
    }

    @AfterClass
    public void classTearDown() throws Exception {
        try {
            /*if (appiumdriver != null) {
                appiumdriver.manage().deleteAllCookies();
                appiumdriver.close();
            }*/

            if (this.driver != null) {
                this.driver.quit();
            }

            if (driverAppTwo != null) {
                driverAppTwo.quit();
            }
        } catch (Exception var2) {
            log.error(var2.getMessage());
        }

        ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
        ExtentManager.getReporter().flush();
        this.process.kill("WerFault.exe");
        DocTestManager.endTest(DocTestManager.getTest());
//        System.out.println(QCConnection.QC_Flag);
        System.out.println("test case status->" + ExtentTestManager.getTest().getRunStatus().toString());
        /*if (QCConnection.QC_Flag.equalsIgnoreCase("Yes")) {
            if (Excel_Handling.Get_Data(this.TC_ID, "QCtestCaseName").contains(",")) {
                String[] testcase = Excel_Handling.Get_Data(this.TC_ID, "QCtestCaseName").split(",");
                System.out.println(testcase.length);
                QCConnection.update(this.TC_ID, ExtentTestManager.getTest().getRunStatus().toString(), testcase);
            } else {
                QCConnection.update(this.TC_ID, ExtentTestManager.getTest().getRunStatus().toString());
            }
        }*/

       /* if (bFlag.equalsIgnoreCase("true")) {
            this.VideoRecordingStop();
        }

    */
    }

    public String[] getDeviceParameter(String deviceType, String deviceValue) {
        String[] value = null;
        int index = 0;
        if (deviceValue.equalsIgnoreCase("DeviceCapability_Value1")) {
            index = 0;
        }

        if (deviceValue.equalsIgnoreCase("DeviceCapability_Value2")) {
            index = 1;
        }

        if (deviceValue.equalsIgnoreCase("DeviceCapability_Value3")) {
            index = 2;
        }

        if (deviceValue.equalsIgnoreCase("DeviceCapability_Value4")) {
            index = 3;
        }

        if (deviceValue.equalsIgnoreCase("DeviceCapability_Value5")) {
            index = 4;
        }

        int i;
        if (deviceType.equalsIgnoreCase("Perfecto Web")) {
            value = new String[6];

            for (i = 0; i < value.length; ++i) {
                value[i] = Create_TestNGXML.WebValue[index][i];
            }
        }

        if (deviceType.equalsIgnoreCase("Perfecto Mobile")) {
            value = new String[10];

            for (i = 0; i < value.length; ++i) {
                value[i] = Create_TestNGXML.mobileValue[index][i];
            }
        }

        if (deviceType.equalsIgnoreCase("Desktop Web")) {
            value = new String[]{Create_TestNGXML.desktopValue[index][0]};
        }

        if (deviceType.equalsIgnoreCase("HeadLess")) {
            value = new String[]{Create_TestNGXML.headLess[index][0]};
        }

        if (deviceType.equalsIgnoreCase("RWD")) {
            value = new String[7];

            for (i = 0; i < value.length; ++i) {
                value[i] = Create_TestNGXML.rwd[index][i];
            }
        }

        return value;
    }

/*    private void VideoRecorderStart() {
        try {
            this.recorder = new ATUTestRecorder(".\\src\\main\\resources\\com/metlife/components/Results/VideoEvidence/", this.TC_ID, false);
            this.recorder.start();
        } catch (ATUTestRecorderException var2) {
            var2.printStackTrace();
        }

    }*/

   /* private void VideoRecordingStop() {
        try {
            this.recorder.stop();
        } catch (ATUTestRecorderException var2) {
            var2.printStackTrace();
        }

    }*/

    private void setScreen(Object[] args) {
        if (args.length > 0 && args[0] != null && args[0] instanceof TestDevice) {
            TestDevice device = (TestDevice) args[0];
            if (device.getScreenSize() != null) {
                this.driver.manage().window().setSize(device.getScreenSize());
            }
        }

    }

    public WebDriver createDriver(Object[] args) {
        if (bRWDflag) {
            System.out.println("createDriver()");
            if (device[0].equalsIgnoreCase("Chrome")) {
                this.driver = this.initChromeDriver(this.appURL, 1);
                this.setScreen(args);
            } else if (device[0].equalsIgnoreCase("IE")) {
                this.driver = this.initIEDriver(this.appURL);
                this.setScreen(args);
            } else if (device[0].equalsIgnoreCase("Edge")) {
                this.driver = this.initEdgeDriver(this.appURL);
                this.setScreen(args);
            } else if (device[0].equalsIgnoreCase("firefox")) {
                this.driver = this.initFirefoxDriver(this.appURL);
                this.setScreen(args);
            } else if (device[0].equalsIgnoreCase("HeadLessChrome")) {
                this.driver = this.initHeadLessChromeDriver(this.appURL);
                this.setScreen(args);
            } else if (device[0].equalsIgnoreCase("HeadLessIE")) {
                this.driver = this.initIEHeadLessDriver(this.appURL);
                this.setScreen(args);
            } else if (device[0].equalsIgnoreCase("HeadLessFireFox")) {
                this.driver = this.initHeadLessFirefoxDriver(this.appURL);
                this.setScreen(args);
            }else if (device[0].equalsIgnoreCase("HeadLessEdge")) {
                this.driver = this.initHeadLessEdgeDriver(this.appURL);
                this.setScreen(args);

            }else if (device[0].equalsIgnoreCase("Perfecto Mobile")) {
                device = this.getDeviceParameter(device[0], devValue);

                try {
                    this.setDriver(1, device);
//                    this.driver = appiumdriver;
                    System.out.println("driver under RWD ->" + this.driver);
                } catch (InterruptedException var4) {
                    var4.printStackTrace();
                }
            } else if (device[0].equalsIgnoreCase("Perfecto Web")) {
                device = this.getDeviceParameter(device[0], devValue);

                try {
                    this.setDriver(2, device);
                    this.setScreen(args);
                } catch (InterruptedException var3) {
                    var3.printStackTrace();
                }
            }
        }

        return this.driver;
    }
}

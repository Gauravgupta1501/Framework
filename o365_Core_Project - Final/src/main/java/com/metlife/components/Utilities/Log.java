package com.metlife.components.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log {
    Logger log = null;

    public Log(String className) {
        this.log = Logger.getLogger(className);
        PropertyConfigurator.configure(".\\src\\main\\resources\\com\\metlife\\components\\Config\\HTMLLayout.properties");
    }

    public void startTestCase(String sTestCaseName) {
        this.log.info("****************************************************************************************");
        this.log.info("****************************************************************************************");
        this.log.info("$$$$$$$$$$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");
        this.log.info("****************************************************************************************");
        this.log.info("****************************************************************************************");
    }

    public void endTestCase(String sTestCaseName) {
        this.log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        this.log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        this.log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX-E---N---D-XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        this.log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        this.log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void info(String message) {
        this.log.info(message);
    }

    public void warn(String message) {
        this.log.warn(message);
    }

    public void error(String message) {
        this.log.error(message);
    }

    public void fatal(String message) {
        this.log.fatal(message);
    }

    public void debug(String message) {
        this.log.debug(message);
    }

    public void info(boolean flag) {
        this.log.info(flag);
    }

    public void info(int length) {
        this.log.info(length);
    }
}


package com.metlife.components.Utilities;

import com.metlife.components.Reporting.Extent_Reporting;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitAction {
    public static Logger Log = null;
    Extent_Reporting r = null;

    public waitAction() {
        Log = Logger.getLogger(this.getClass().getSimpleName());
        this.r = new Extent_Reporting();
    }

    public void waitForElemenetToBeDisplayed(WebDriver driver, String TC_ID, String elementXpath) throws InterruptedException {
        int maxTimeWait = Integer.parseInt(Excel_Handling.Get_Data(TC_ID, "MaxTimeToWaitInSec")) * 1000;
        int intervelTime = Integer.parseInt(Excel_Handling.Get_Data(TC_ID, "IntervalTimeInSec"));
        System.out.println("maxTimeWait : " + maxTimeWait);
        System.out.println("intervelTime : " + intervelTime);
        System.out.println("elementXpath : " + elementXpath);
        int maxLoopCount = Integer.parseInt(Excel_Handling.Get_Data(TC_ID, "MaxTimeToWaitInSec")) / intervelTime;
        System.out.println("maxLoopCount : " + maxLoopCount);

        for(int i = 0; i < maxLoopCount; ++i) {
            int elementCount = 0;

            try {
                elementCount = driver.findElements(By.xpath(elementXpath)).size();
            } catch (Exception var10) {
            }

            if (elementCount != 0) {
                break;
            }

            Thread.sleep((long)(intervelTime * 1000));
            System.out.println(" i : " + i);
        }

    }

    public void waitForElemenetToBeDisplayedAndWaitFewSec(WebDriver driver, String TC_ID, String elementXpath, int waitSeconds) throws InterruptedException {
        int maxTimeWait = Integer.parseInt(Excel_Handling.Get_Data(TC_ID, "MaxTimeToWaitInSec")) * 1000;
        int intervelTime = Integer.parseInt(Excel_Handling.Get_Data(TC_ID, "IntervalTimeInSec"));
        System.out.println("maxTimeWait : " + maxTimeWait);
        System.out.println("intervelTime : " + intervelTime);
        System.out.println("elementXpath : " + elementXpath);
        int maxLoopCount = Integer.parseInt(Excel_Handling.Get_Data(TC_ID, "MaxTimeToWaitInSec")) / intervelTime;
        System.out.println("maxLoopCount : " + maxLoopCount);

        for(int i = 0; i < maxLoopCount; ++i) {
            int elementCount = 0;

            try {
                elementCount = driver.findElements(By.xpath(elementXpath)).size();
            } catch (Exception var11) {
            }

            if (elementCount != 0) {
                Thread.sleep((long)(1000 * waitSeconds));
                System.out.println("Wait & loop break");
                break;
            }

            Thread.sleep((long)(intervelTime * 1000));
            System.out.println(" i : " + i);
        }

        Thread.sleep((long)(1000 * waitSeconds));
    }

    public boolean waitForElemenetToBeDisplayedAndClickable(WebDriver driver, String TC_ID, String elementXpath) throws InterruptedException {
        boolean status = false;
        int maxTimeWait = Integer.parseInt(Excel_Handling.Get_Data(TC_ID, "MaxTimeToWaitInSec")) * 1000;
        int intervelTime = Integer.parseInt(Excel_Handling.Get_Data(TC_ID, "IntervalTimeInSec"));
        System.out.println("maxTimeWait : " + maxTimeWait);
        System.out.println("intervelTime : " + intervelTime);
        System.out.println("elementXpath : " + elementXpath);
        int maxLoopCount = Integer.parseInt(Excel_Handling.Get_Data(TC_ID, "MaxTimeToWaitInSec")) / intervelTime;
        System.out.println("maxLoopCount : " + maxLoopCount);

        for(int i = 0; i < maxLoopCount; ++i) {
            System.out.println("Iteration : " + i);
            int elementCount = 0;

            try {
                elementCount = driver.findElements(By.xpath(elementXpath)).size();
            } catch (Exception var12) {
            }

            if (elementCount != 0) {
                status = true;
                break;
            }

            Thread.sleep((long)(intervelTime * 1000));
            System.out.println(" i : " + i);
            if (status) {
                try {
                    WebDriverWait waitObj = new WebDriverWait(driver, (long)(intervelTime * 1000));
                    waitObj.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
                    status = true;
                } catch (Exception var11) {
                }
            } else {
                status = false;
            }
        }

        return status;
    }

    public static void main(String[] args) {
    }
}

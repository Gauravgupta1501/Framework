package com.metlife.components.Utilities;

import com.metlife.components.setup.DriverSetup;
import com.metlife.components.Reporting.Extent_Reporting;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ElementAction extends waitAction {
    public static Logger Log = null;
    Extent_Reporting r = null;

    public ElementAction() {
        Log = Logger.getLogger(this.getClass().getSimpleName());
        this.r = new Extent_Reporting();
    }

    public boolean isElementPresentByXpath(String xpath, WebDriver driver, String Element_Name) throws InterruptedException {
        try {
            driver.findElement(By.xpath(xpath));
            Extent_Reporting.Log_Pass_Screenshot(Element_Name + " Exist", Element_Name + " Exist", driver);
            Log.info(Element_Name + " Exist");
            return true;
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            return false;
        }
    }

    public boolean isElementPresentByLinkText(String linkText, WebDriver driver) throws InterruptedException {
        try {
            driver.findElement(By.linkText(linkText));
            Extent_Reporting.Log_Pass(linkText + " Exist", linkText + " Exist");
            return true;
        } catch (Throwable var4) {
            Extent_Reporting.Log_Fail(linkText + " does not Exist", linkText + " does not Exist", driver);
            var4.printStackTrace();
            Log.error(var4.getMessage());
            return false;
        }
    }

    public boolean isElementPresentByID(String ID, WebDriver driver, String Element_Name) throws InterruptedException {
        try {
            driver.findElement(By.id(ID));
            Extent_Reporting.Log_Pass(Element_Name + " Exist", Element_Name + " Exist");
            return true;
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            return false;
        }
    }

    public boolean isElementPresentByName(String Name, WebDriver driver, String Element_Name) throws InterruptedException {
        try {
            driver.findElement(By.name(Name));
            Extent_Reporting.Log_Pass(Element_Name + " Exist", Element_Name + " Exist");
            return true;
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            return false;
        }
    }

    public boolean isElementPresentByClassName(String className, WebDriver driver, String Element_Name) throws InterruptedException {
        try {
            driver.findElement(By.className(className));
            Extent_Reporting.Log_Pass(Element_Name + " Exist", Element_Name + " Exist");
            return true;
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            return false;
        }
    }

    public void clickButtonID(WebDriver screenName, String ID, String Element_Name) throws Exception {
        try {
            WebElement webButton = screenName.findElement(By.id(ID));
            webButton.click();
            Extent_Reporting.Log_Pass(Element_Name + " Clicked", Element_Name + " Clicked");
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void clickButton(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement webButton = screenName.findElement(By.xpath(ObjectxPath));
            webButton.click();
            Extent_Reporting.Log_Pass(Element_Name + " Clicked", Element_Name + " Clicked");
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void clickWebElement(WebDriver screenName, WebElement element, String Element_Name) throws Exception {
        try {
            element.click();
            Extent_Reporting.Log_Pass(Element_Name + " Clicked", Element_Name + " Clicked");
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void clickLink(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement webButton = screenName.findElement(By.xpath(ObjectxPath));
            webButton.click();
            Extent_Reporting.Log_Pass(Element_Name + " Clicked", Element_Name + " Clicked");
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void clickLinkByLinkText(WebDriver screenName, String linkText, String Element_Name) throws Exception {
        try {
            WebElement webButton = screenName.findElement(By.linkText(linkText));
            webButton.click();
            Extent_Reporting.Log_Pass(Element_Name + " Clicked", Element_Name + " Clicked");
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public boolean clickFirst(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        boolean flag = true;

        try {
            WebElement webButton = screenName.findElement(By.xpath(ObjectxPath));
            webButton.click();
            Extent_Reporting.Log_Pass(Element_Name + " Clicked", Element_Name + " Clicked");
            return flag;
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void inputText(WebDriver screenName, String ObjectxPath, String sValue, String Element_Name) throws Exception {
        try {
            WebElement inputText = screenName.findElement(By.xpath(ObjectxPath));
            inputText.clear();
            inputText.sendKeys(sValue);
            Extent_Reporting.Log_Pass_Screenshot(Element_Name + " Entered", sValue + " entered in " + Element_Name, screenName);
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void removeAttribute(WebDriver driver) {
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        Iterator var3 = inputs.iterator();

        while (var3.hasNext()) {
            WebElement input = (WebElement) var3.next();
            ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", new Object[]{input});
        }

    }

    public void typeNonEditable(WebDriver driver, String ObjectxPath, String sValue, String Element_Name) throws Exception {
        this.removeAttribute(driver);
        this.inputText(driver, ObjectxPath, sValue, Element_Name);
    }

    public void enterText(WebDriver screenName, String ObjectxPath, String sValue, String Element_Name) throws Exception {
        Actions actions = new Actions(screenName);

        try {
            WebElement inputText = screenName.findElement(By.xpath(ObjectxPath));
            actions.moveToElement(inputText);
            actions.click();
            actions.sendKeys(sValue);
            actions.build().perform();
            Extent_Reporting.Log_Pass(Element_Name + " Entered", sValue + " entered in " + Element_Name);
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var7.printStackTrace();
            Log.error(var7.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void inputTextByID(WebDriver screenName, String ID, String sValue, String Element_Name) throws Exception {
        try {
            WebElement inputText = screenName.findElement(By.id(ID));
            inputText.sendKeys(sValue);
            Extent_Reporting.Log_Pass(Element_Name + " Entered", sValue + " entered in " + Element_Name);
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void selectCheckBox(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement checkBox = screenName.findElement(By.xpath(ObjectxPath));
            checkBox.click();
            Extent_Reporting.Log_Pass(Element_Name + " checkbox clicked", Element_Name + " checkbox clicked");
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void selectRadio(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement radioButton = screenName.findElement(By.xpath(ObjectxPath));
            radioButton.click();
            Extent_Reporting.Log_Pass(Element_Name + " radiobutton clicked", Element_Name + " radiobutton clicked");
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public String getInputTextValue(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement inputText = screenName.findElement(By.xpath(ObjectxPath));
            Extent_Reporting.Log_Pass(Element_Name + " exist", Element_Name + " has " + inputText.getText());
            return inputText.getText();
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public String getInputValue(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement inputText = screenName.findElement(By.xpath(ObjectxPath));
            Extent_Reporting.Log_Pass(Element_Name + " exist", Element_Name + " has " + inputText.getText());
            return inputText.getAttribute("value");
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public String getAttributeValue(WebDriver screenName, String ObjectxPath, String attributeName, String Element_Name) throws Exception {
        try {
            WebElement inputText = screenName.findElement(By.xpath(ObjectxPath));
            Extent_Reporting.Log_Pass(Element_Name + " exist", Element_Name + " has " + inputText.getText());
            return inputText.getAttribute(attributeName);
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void clearInputTextValue(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement inputText = screenName.findElement(By.xpath(ObjectxPath));
            inputText.clear();
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void clearInputTextValueByName(WebDriver screenName, String name, String Element_Name) throws Exception {
        try {
            WebElement inputText = screenName.findElement(By.name(name));
            inputText.clear();
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void clearAndInputTextValue(WebDriver screenName, String ObjectxPath, String value, String Element_Name) throws Exception {
        try {
            WebElement inputText = screenName.findElement(By.xpath(ObjectxPath));
            Thread.sleep(1000L);
            inputText.clear();
            Thread.sleep(1000L);
            inputText.sendKeys(value);
            Extent_Reporting.Log_Pass(Element_Name + " cleared & Entered with " + value, Element_Name + " cleared & Entered with " + value);
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void selectDropBoxValue(WebDriver screenName, String ObjectxPath, String value, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.xpath(ObjectxPath));
            Select select = new Select(selectDropBox);
            select.selectByValue(value);
            Extent_Reporting.Log_Pass_Screenshot(Element_Name + " selected with " + value, Element_Name + " selected with " + value, screenName);
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var7.printStackTrace();
            Log.error(var7.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void selectDropBoxValuebyVisibleTextwithoutClick(WebDriver screenName, String ObjectxPath, String value, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.xpath(ObjectxPath));
            Select select = new Select(selectDropBox);
            select.selectByVisibleText(value);
            Extent_Reporting.Log_Pass(Element_Name + " selected with " + value, Element_Name + " selected with " + value);
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var7.printStackTrace();
            throw new Exception("Element Not Present");
        }
    }

    public void selectDropBoxByVisibleText(WebDriver screenName, String ObjectxPath, String value, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.xpath(ObjectxPath));
            Select select = new Select(selectDropBox);
            select.selectByVisibleText(value);
            Extent_Reporting.Log_Pass(Element_Name + " selected with " + value, Element_Name + " selected with " + value);
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var7.printStackTrace();
            Log.error(var7.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void selectDropBoxValueByID(WebDriver screenName, String ID, String value, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.id(ID));
            Select select = new Select(selectDropBox);
            select.selectByValue(value);
            Extent_Reporting.Log_Pass(Element_Name + " selected with " + value, Element_Name + " selected with " + value);
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var7.printStackTrace();
            Log.error(var7.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void selectDropBoxValueByName(WebDriver screenName, String Name, String value, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.name(Name));
            Select select = new Select(selectDropBox);
            select.selectByValue(value);
            Extent_Reporting.Log_Pass(Element_Name + " selected with " + value, Element_Name + " selected with " + value);
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var7.printStackTrace();
            Log.error(var7.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void selectDropBoxValue(WebDriver screenName, String ObjectxPath, int index, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.xpath(ObjectxPath));
            Select select = new Select(selectDropBox);
            select.selectByIndex(index);
            Extent_Reporting.Log_Pass(Element_Name + " selected with " + index, Element_Name + " selected with " + index);
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var7.printStackTrace();
            Log.error(var7.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void selectDropBoxDefaultValue(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.xpath(ObjectxPath));
            Select select = new Select(selectDropBox);
            select.selectByIndex(0);
            Extent_Reporting.Log_Pass(Element_Name + " selected with default value ", Element_Name + " selected with default value ");
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public String getDropBoxDefaultValue(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.xpath(ObjectxPath));
            Select select = new Select(selectDropBox);
            Extent_Reporting.Log_Pass(Element_Name + " selected value is " + select.getFirstSelectedOption().getText(), Element_Name + " selected value is " + select.getFirstSelectedOption().getText());
            return select.getFirstSelectedOption().getText();
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public String getDropBoxSelectedValue(WebDriver screenName, String ObjectxPath, int index, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.xpath(ObjectxPath));
            Select select = new Select(selectDropBox);
            Extent_Reporting.Log_Pass(Element_Name + " selected value is " + select.getFirstSelectedOption().getText(), Element_Name + " selected value is " + select.getFirstSelectedOption().getText());
            return ((WebElement) select.getOptions().get(index)).getText();
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var7.printStackTrace();
            Log.error(var7.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public int getDropBoxSize(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.xpath(ObjectxPath));
            Select select = new Select(selectDropBox);
            Extent_Reporting.Log_Pass(Element_Name + " dropbox size is " + select.getOptions().size(), Element_Name + " dropbox size is " + select.getOptions().size());
            return select.getOptions().size();
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public String[] getDropBoxValue(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        try {
            WebElement selectDropBox = screenName.findElement(By.xpath(ObjectxPath));
            Select select = new Select(selectDropBox);
            List<WebElement> optionValue = select.getOptions();
            String[] value = new String[optionValue.size()];

            for (int i = 0; i < optionValue.size(); ++i) {
                value[i] = ((WebElement) optionValue.get(i)).getText();
            }

            return value;
        } catch (Throwable var9) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var9.printStackTrace();
            Log.error(var9.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public int getTotalTableCell(WebDriver driver, String ObjectxPath, String Element_Name) throws Exception {
        try {
            Extent_Reporting.Log_Pass(Element_Name + " table size is " + driver.findElements(By.xpath(ObjectxPath)).size(), Element_Name + " table size is " + driver.findElements(By.xpath(ObjectxPath)).size());
            return driver.findElements(By.xpath(ObjectxPath)).size();
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public int getElementsSize(WebDriver driver, String ObjectxPath, String Element_Name) throws Exception {
        try {
            Extent_Reporting.Log_Pass(Element_Name + " element size is " + driver.findElements(By.xpath(ObjectxPath)).size(), Element_Name + " element size is " + driver.findElements(By.xpath(ObjectxPath)).size());
            return driver.findElements(By.xpath(ObjectxPath)).size();
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public int getElementCount(WebDriver driver, String className, String Element_Name) throws Exception {
        boolean var4 = false;

        try {
            int count = driver.findElements(By.className(className)).size();
            Extent_Reporting.Log_Pass(Element_Name + " element count " + count, Element_Name + " element size is " + count);
            return count;
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public boolean isElementEnabled(WebDriver driver, String xpath, String Element_Name) {
        boolean flag = false;

        try {
            if (driver.findElement(By.xpath(xpath)).isEnabled()) {
                Extent_Reporting.Log_Pass(Element_Name + " is Enabled ", Element_Name + " is Enabled ");
                flag = true;
                System.out.println(flag);
            }
        } catch (Throwable var6) {
            Extent_Reporting.Log_Pass(Element_Name + " is disabled ", Element_Name + " is disabled ");
            flag = false;
            System.out.println(flag);
        }

        return flag;
    }

    public boolean isElementDisplayed(WebDriver driver, String xpath, String Element_Name) throws InterruptedException {
        boolean flag = false;

        try {
            if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
                Extent_Reporting.Log_Pass_Screenshot(Element_Name + " is displayed ", Element_Name + " is displayed ", driver);
                flag = true;
                System.out.println(flag);
            }
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " is not displayed ", Element_Name + " is not displayed ", driver);
            flag = false;
            System.out.println(flag);
            Log.error(var6.getMessage());
        }

        return flag;
    }

    public boolean isElementDisplay(WebDriver driver, String xpath) {
        boolean flag = false;

        try {
            if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
                flag = true;
            }
        } catch (Throwable var5) {
            var5.printStackTrace();
            flag = false;
            Log.error(var5.getMessage());
        }

        return flag;
    }

    public void mouseHoverAction_3(WebDriver driver, String mainElementXP, String subElementXP, String subSubElementXP, String Element_Name) throws Exception {
        try {
            Actions action = new Actions(driver);
            WebElement mainElement = driver.findElement(By.xpath(mainElementXP));
            action.moveToElement(mainElement).perform();
            WebElement subElement = driver.findElement(By.xpath(subElementXP));
            action.moveToElement(subElement).perform();
            WebElement subSubElement = driver.findElement(By.xpath(subSubElementXP));
            action.moveToElement(subSubElement);
            action.click();
            action.perform();
            Extent_Reporting.Log_Pass("Click action is performed on the selected Product Type" + Element_Name, "Click action is performed on the selected Product Type" + Element_Name);
        } catch (Throwable var10) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var10.printStackTrace();
            Log.error(var10.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void mouseHoverAction_2(WebDriver driver, String mainElementXP, String subElementXP, String Element_Name) throws Exception {
        try {
            Actions action = new Actions(driver);
            WebElement mainElement = driver.findElement(By.xpath(mainElementXP));
            action.moveToElement(mainElement).perform();
            WebElement subElement = driver.findElement(By.xpath(subElementXP));
            action.moveToElement(subElement);
            action.click();
            action.perform();
            Extent_Reporting.Log_Pass("Click action is performed on the selected Product Type" + Element_Name, "Click action is performed on the selected Product Type" + Element_Name);
        } catch (Throwable var8) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var8.printStackTrace();
            Log.error(var8.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void mouseHoverAction(WebDriver driver, String mainElementXP, String Element_Name) throws Exception {
        try {
            Actions action = new Actions(driver);
            WebElement mainElement = driver.findElement(By.xpath(mainElementXP));
            action.moveToElement(mainElement).clickAndHold().build().perform();
            action.release().perform();
            Extent_Reporting.Log_Pass("Click action is performed on the selected Product Type" + Element_Name, "Click action is performed on the selected Product Type" + Element_Name);
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void mouseHoverAction(WebDriver driver, String mainElementXP, String subElementXP, String subSubElementXP, String subBesideElementXP, String Element_Name) throws Exception {
        try {
            Actions action = new Actions(driver);
            WebElement mainElement = driver.findElement(By.xpath(mainElementXP));
            action.moveToElement(mainElement).perform();
            WebElement subElement = driver.findElement(By.xpath(subElementXP));
            action.moveToElement(subElement).perform();
            WebElement subSubElement = driver.findElement(By.xpath(subSubElementXP));
            action.moveToElement(subSubElement).perform();
            WebElement subBesideElement = driver.findElement(By.xpath(subBesideElementXP));
            action.moveToElement(subBesideElement).perform();
            action.click();
            action.perform();
            Extent_Reporting.Log_Pass("Click action is performed on the selected Product Type" + Element_Name, "Click action is performed on the selected Product Type" + Element_Name);
        } catch (Throwable var12) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var12.printStackTrace();
            Log.error(var12.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void selectclass(WebDriver driver, WebElement parent, String elementToSelect, String Element_Name) throws Exception {
        try {
            Select dropdown = new Select(parent);
            dropdown.selectByVisibleText(elementToSelect);
            Extent_Reporting.Log_Pass("selected " + elementToSelect, "selected " + elementToSelect + "in " + parent);
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", driver);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void getWindowHandle(WebDriver driver, String title) {
        Set<String> handles = driver.getWindowHandles();
        String[] browser = (String[]) handles.toArray(new String[0]);
        System.out.println("Number of browsers opened are" + browser.length);

        for (int i = 0; i < handles.size(); ++i) {
            driver.switchTo().window(browser[i]);
            if (driver.getTitle().equals(title)) {
                driver.getWindowHandle();
            }
        }

    }

    public void selectWindowIfElementPresent(WebDriver driver, String element) throws InterruptedException {
        Thread.sleep(2000L);
        Set<String> windows = driver.getWindowHandles();
        Object[] win = windows.toArray();
        System.out.println(win.length);
        driver.switchTo().window(win[0].toString());
        if (this.isElementDisplay(driver, element)) {
            Extent_Reporting.Log_Pass("Selected Pop Up : " + driver.switchTo().window(win[0].toString()).getTitle(), "Selected Pop Up : " + driver.switchTo().window(win[0].toString()).getTitle());
        } else {
            driver.switchTo().window(win[1].toString());
            System.out.println("Selected Pop Up : " + driver.switchTo().window(win[1].toString()).getTitle());
        }

    }

    public void waitForElementNotPresent(WebDriver driver, String element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30L);
            wait.until(ExpectedConditions.elementToBeSelected(By.xpath(element)));
        } catch (TimeoutException var4) {
            Log.error(var4.getMessage());
        }

    }

    public void waitForElementVisible(WebDriver driver, String element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30L);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        } catch (NoSuchWindowException var4) {
            Log.error(var4.getMessage());
        } catch (InvalidElementStateException var5) {
            Log.error(var5.getMessage());
        } catch (TimeoutException var6) {
            Log.error(var6.getMessage());
        } catch (NoSuchElementException var7) {
            Log.error(var7.getMessage());
        } catch (WebDriverException var8) {
            Log.error(var8.getMessage());
        }

    }

    public void waitForElementClickable(WebDriver driver, String element, String text) {
        try {
            new WebDriverWait(driver, 60L);
        } catch (NoSuchWindowException var5) {
            Log.error(var5.getMessage());
        } catch (InvalidElementStateException var6) {
            Log.error(var6.getMessage());
        } catch (TimeoutException var7) {
            Log.error(var7.getMessage());
        } catch (NoSuchElementException var8) {
            Log.error(var8.getMessage());
        } catch (WebDriverException var9) {
            Log.error(var9.getMessage());
        }

    }

    public void waitForTextPresent(WebDriver driver, String text) throws InterruptedException {
        try {
            Thread.sleep(2000L);

            for (long timer = 0L; !this.isTextPresent(driver, text) && timer < Long.valueOf("30000"); timer += 5000L) {
                Thread.sleep(500L);
            }
        } catch (NoSuchWindowException var5) {
            Log.error(var5.getMessage());
        }

    }

    public void waitForPageToLoad(WebDriver driver) {
        System.out.println("Implicit wait Time to load the Page " + DriverSetup.TimeOut);
        driver.manage().timeouts().implicitlyWait(DriverSetup.TimeOut, TimeUnit.SECONDS);
    }

    public boolean isTextPresent(WebDriver driver, String text) {
        boolean flag = false;

        try {
            flag = driver.findElement(By.xpath("//*[contains(.,'" + text + "')]")).isDisplayed();
            return flag;
        } catch (NoSuchElementException var5) {
            Log.error(var5.getMessage());
            return flag;
        } catch (NoSuchWindowException var6) {
            Log.error(var6.getMessage());
            return flag;
        }
    }

    public void getTableData(WebDriver driver, String xpath) {
        WebElement table = driver.findElement(By.xpath(xpath));
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        Iterator var5 = allRows.iterator();

        while (var5.hasNext()) {
            WebElement row = (WebElement) var5.next();
            List<WebElement> cells = row.findElements(By.tagName("td"));
            Iterator var8 = cells.iterator();

            while (var8.hasNext()) {
                WebElement cell = (WebElement) var8.next();
                System.out.println(cell.getText());
            }
        }

    }

    public String getObjectValue(WebDriver driver, WebElement webElement) {
        JavascriptExecutor e = (JavascriptExecutor) driver;
        return (String) e.executeScript(String.format("return $('#%s').val();", webElement.getAttribute("id")), new Object[0]);
    }

    public String getObjectValueClass(WebDriver driver, WebElement webElement) {
        JavascriptExecutor e = (JavascriptExecutor) driver;
        return (String) e.executeScript(String.format("return $('#%s').val();", webElement.getAttribute("class")), new Object[0]);
    }

    public int getElementCountXPath(WebDriver driver, String ObjectPath, String Element_Name) throws InterruptedException {
        int count = 0;
        if (this.isElementPresentByXpath(ObjectPath, driver, Element_Name)) {
            count = driver.findElements(By.xpath(ObjectPath)).size();
        }

        return count;
    }

    public void acceptAlert(WebDriver driver) throws InterruptedException {
        try {
            Alert alert = this.waitforAlertPresent(driver);
            if (!alert.equals((Object) null)) {
                alert.accept();
            }
        } catch (NoAlertPresentException var3) {
            Log.error(var3.getMessage());
        }

    }

    public Alert waitforAlertPresent(WebDriver driver) throws InterruptedException {
        int i = 0;
        Alert alert = null;

        while (i++ < 30) {
            try {
                alert = driver.switchTo().alert();
                return alert;
            } catch (NoAlertPresentException var5) {
                Thread.sleep(1000L);
            }
        }

        return alert;
    }

    public void waitForPopUp(WebDriver driver, String b) throws InterruptedException {
        Thread.sleep(3000L);

        try {
            this.selectPopUp(driver, b);
            driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        } catch (NoSuchWindowException var4) {
            Log.error(var4.getMessage());
        } catch (Exception var5) {
            Log.error(var5.getMessage());
        }

    }

    public void selectPopUp(WebDriver driver, String arg) {
        boolean flag = false;

        try {
            for (int i = 0; i < 2 && !flag; ++i) {
                Set<String> pops = driver.getWindowHandles();
                Iterator<String> it = pops.iterator();
                if (pops.size() > 1) {
                    System.out.println("No of Windows " + pops.size());

                    for (int j = 0; j < pops.size() && !flag; ++j) {
                        String popupHandle = ((String) it.next()).toString();
                        if (driver.switchTo().window(popupHandle).getTitle().contains(arg)) {
                            driver.switchTo().window(popupHandle);
                            flag = true;
                        }
                    }

                    flag = true;
                    pops.clear();
                }
            }
        } catch (NoSuchWindowException var9) {
            Log.error(var9.getMessage());
            System.out.println("Not able to Navigate to Window " + arg);
        } catch (Exception var10) {
            Log.error(var10.getMessage());
        }

    }

    public void checkUsingJavaScript(WebDriver driver, String obj, String ObjectName) throws InterruptedException {
        try {
            WebElement element = null;
            if (obj.startsWith("id")) {
                element = driver.findElement(By.id(obj.split("id:")[1]));
            } else if (obj.startsWith("name")) {
                element = driver.findElement(By.name(obj.split("name:")[1]));
            } else {
                element = driver.findElement(By.xpath(obj));
            }

            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", new Object[]{element});
            Extent_Reporting.Log_Pass(ObjectName + " clicked", ObjectName + " Ciicked");
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(ObjectName + " Not Present", ObjectName + " Not Present", driver);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            new Exception(ObjectName + " not present");
        }

    }

    public void waitForFrameAndSwitch(WebDriver driver, String frameName) {
        new WebDriverWait(driver, 60L);
        driver.switchTo().defaultContent();
    }

    public void waitForFrameAndSwitch(String frameXpath, WebDriver driver) {
        new WebDriverWait(driver, 60L);
        driver.switchTo().defaultContent();
    }

    public void waitForElementVisible(WebDriver driver, String element, String Element_Name) throws Throwable {
        try {
            new WebDriverWait(driver, 60L);
        } catch (Throwable var5) {
            var5.printStackTrace();
            Log.error(var5.getMessage());
            Extent_Reporting.Log_Fail(Element_Name + "Not visible", Element_Name + "Not visible", driver);
        }

    }

    public void Javascriptexecutor_InputText(WebDriver driver, String XpathObject, String sValue, String Element_Name) throws Throwable {
        this.waitForPageToLoad(driver);

        try {
            WebElement inputText = driver.findElement(By.xpath(XpathObject));
            JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
            myExecutor.executeScript("arguments[0].value='" + sValue + "';", new Object[]{inputText});
            Extent_Reporting.Log_Pass(Element_Name + " Entered", sValue + " entered in " + Element_Name);
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(XpathObject + " Not Present", XpathObject + " Not Present", driver);
            var7.printStackTrace();
            new Exception(XpathObject + " not present");
        }

    }

    public void Javascriptexecutor_forClick(WebDriver driver, String frameName, String XpathObject, String ObjectName) throws Throwable {
        this.waitForPageToLoad(driver);
        this.waitForFrameAndSwitch(driver, frameName);
        this.waitForPageToLoad(driver);
        this.waitForElementVisible(driver, XpathObject, ObjectName);

        try {
            WebElement e = driver.findElement(By.xpath(XpathObject));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", new Object[]{e});
            Extent_Reporting.Log_Pass(ObjectName + " clicked", ObjectName + " Ciicked");
            js = null;
            e = null;
        } catch (Throwable var7) {
            Extent_Reporting.Log_Fail(ObjectName + " Not Present", ObjectName + " Not Present", driver);
            var7.printStackTrace();
            Log.error(var7.getMessage());
            new Exception(ObjectName + " not present");
        }

    }

    public String[] findElementsInArray(WebDriver driver, String ObjectxPath, String ObjectName) throws InterruptedException, Exception {
        String[] array = null;
        int i = 0;
        if (!this.isElementPresentByXpath(ObjectxPath, driver, ObjectName)) {
            Extent_Reporting.Log_Fail("findElementsInArray", ObjectxPath + " is not present", driver);
            throw new Exception("findElementsInArray() --- >Element Not Present");
        } else {
            List<WebElement> list = driver.findElements(By.xpath(ObjectxPath));
            array = new String[list.size()];

            for (Iterator it = list.iterator(); it.hasNext(); array[i++] = ((WebElement) it.next()).getText()) {
            }

            return array;
        }
    }

    public void removeAttribute(WebDriver driver, String ObjectXpath) {
        WebElement input = driver.findElement(By.xpath(ObjectXpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('disabled','disabled')", new Object[]{input});
    }

    public void clickUsingActions(WebDriver screenName, String ObjXpath, String Element_Name) throws Exception {
        try {
            Actions actions = new Actions(screenName);
            WebElement webButton = screenName.findElement(By.xpath(ObjXpath));
            actions.click(webButton);
            Extent_Reporting.Log_Pass(Element_Name + " Clicked", Element_Name + " Clicked");
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public List<WebElement> findElementsInList(WebDriver driver, String ObjectxPath, String ObjectName) throws InterruptedException, Exception {
        List<WebElement> list = null;
        if (this.isElementPresentByXpath(ObjectxPath, driver, ObjectName)) {
            list = driver.findElements(By.xpath(ObjectxPath));
            return list;
        } else {
            Extent_Reporting.Log_Fail("findElementsInArray", ObjectxPath + " is not present", driver);
            throw new Exception("findElementsInArray() --- >Element Not Present");
        }
    }

    public boolean selectWindow(String windowname, WebDriver driver) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException var6) {
            Log.error(var6.getMessage());
            var6.printStackTrace();
        }

        boolean selWindow = false;

        try {
            if (windowname != null) {
                if (windowname.contains("null")) {
                    this.switchToWindow(1, driver);
                    selWindow = true;
                } else {
                    this.selectPopUp(windowname, driver);
                    selWindow = true;
                }
            } else {
                this.switchToWindow(1, driver);
                selWindow = true;
            }
        } catch (Exception var5) {
            var5.getMessage();
            var5.printStackTrace();
            this.switchToWindow(1, driver);
            selWindow = false;
            Log.error(var5.getMessage());
        }

        return selWindow;
    }

    public void switchToWindow(int WindowNumber, WebDriver driver) {
        --WindowNumber;
        Set<String> windows = driver.getWindowHandles();
        Object[] win = windows.toArray();
        driver.switchTo().window(win[WindowNumber].toString());
    }

    public void selectPopUp(String arg, WebDriver driver) {
        boolean flag = false;

        try {
            for (int i = 0; i < 2 && !flag; ++i) {
                Set<String> pops = driver.getWindowHandles();
                Iterator<String> it = pops.iterator();
                if (pops.size() > 1) {
                    System.out.println("No of Windows " + pops.size());

                    for (int j = 0; j < pops.size() && !flag; ++j) {
                        String popupHandle = ((String) it.next()).toString();
                        if (driver.switchTo().window(popupHandle).getTitle().contains(arg)) {
                            driver.switchTo().window(popupHandle);
                            flag = true;
                        }
                    }

                    pops.clear();
                }
            }
        } catch (NoSuchWindowException var9) {
            Log.error(var9.getMessage());
            System.out.println("Not able to Navigate to Window " + arg);
        } catch (Exception var10) {
            Log.error(var10.getMessage());
        }

    }

    public void waitUntilExist(WebDriver driver, String ObjectxPath) throws Exception {
        driver.manage().timeouts().implicitlyWait(0L, TimeUnit.SECONDS);
        int i = 1;

        do {
            ++i;
            Thread.sleep(10000L);

            try {
                WebElement webButton = driver.findElement(By.xpath(ObjectxPath));
                System.out.println("X" + i);
                webButton.getText();
            } catch (Throwable var5) {
                break;
            }
        } while (i < 100);

        this.waitForPageToLoad(driver);
    }

    public boolean CheckifExist(WebDriver driver, String element, int number) {
        try {
            driver.manage().timeouts().implicitlyWait((long) number, TimeUnit.MILLISECONDS);
            new WebDriverWait(driver, (long) number);
            this.waitForPageToLoad(driver);
            return true;
        } catch (Exception var5) {
            System.out.println("not exist");
            this.waitForPageToLoad(driver);
            Log.error(var5.getMessage());
            return false;
        }
    }

    public void Clickbtn(WebDriver screenName, String ObjectxPath, String Element_Name) throws Exception {
        Thread.sleep(500L);

        try {
            WebElement webButton = screenName.findElement(By.xpath(ObjectxPath));
            webButton.click();
            Extent_Reporting.Log_Pass(Element_Name + " Clicked", Element_Name + " Clicked");
        } catch (Throwable var5) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var5.printStackTrace();
            Log.error(var5.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public void WaitFunction(WebDriver driver, String Message) throws Exception {
        this.waitUntilExist(driver, "//*[contains(text(),'Loading...')]");
        this.waitUntilExist(driver, "//*[contains(text(),'Loading...')]");
        if (this.CheckifExist(driver, "//*[contains(text(),'Attention')]", 3)) {
            Extent_Reporting.Log_Fail("Attention Error Occured", "Attention Error Occured" + Message, driver);
            new Exception("Attention Error Occured");
        }

    }

    public void waituntilDisplayed(WebDriver driver, String xpath) throws InterruptedException {
        int i = 1;
        boolean x = false;

        do {
            ++i;
            Thread.sleep(2000);

            try {
                x = driver.findElement(By.xpath(xpath)).isDisplayed();
            } catch (Throwable var6) {
            }
        } while (i != 60 && !x);

    }

    public boolean CheckifTextExistAndReport(WebDriver driver, String element, String Element_Name) throws InterruptedException {
        try {
            String Strelement = "//*[contains(text(),'" + element + "')]";
            System.out.println("================" + Strelement);
            driver.findElement(By.xpath(Strelement));
            Extent_Reporting.Log_Pass(Element_Name + " Exist", Element_Name + " is Exist");
            System.out.println("Element Exist");
            this.waitForPageToLoad(driver);
            return true;
        } catch (Throwable var5) {
            this.waitForPageToLoad(driver);
            System.out.println("not exist");
            var5.printStackTrace();
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + "does not Exist", driver);
            Log.error(var5.getMessage());
            return false;
        }
    }

    public boolean CheckifExistwithWait(WebDriver driver, String element) {
        try {
            driver.findElement(By.xpath(element));
            return true;
        } catch (Throwable var4) {
            Log.error(var4.getMessage());
            return false;
        }
    }

    public void MouseClick(WebDriver driver, String Xpath) throws AWTException {
        Robot bot = new Robot();
        WebElement e = driver.findElement(By.xpath(Xpath));
        int x = e.getLocation().getX();
        int y = e.getLocation().getY();
        System.out.println(x + " " + y);
        bot.mouseMove(x, y);
        bot.mousePress(16);
        bot.mouseRelease(16);
    }

    public int getTableRowCount(WebDriver driver, String xapth) {
        try {
            WebElement htmltable = driver.findElement(By.xpath(xapth));
            List<WebElement> rows = htmltable.findElements(By.tagName("tr"));
            System.out.println(rows.size());
            return rows.size();
        } catch (Throwable var5) {
            var5.printStackTrace();
            Log.error(var5.getMessage());
            return 0;
        }
    }

    public boolean CheckifTextExistwithoutReport(WebDriver driver, String element, String Element_Name) throws InterruptedException {
        try {
            String Strelement = "//*[contains(text(),'" + element + "')]";
            driver.findElement(By.xpath(Strelement));
            System.out.println("Element Exist");
            this.waitForPageToLoad(driver);
            return true;
        } catch (Throwable var5) {
            this.waitForPageToLoad(driver);
            System.out.println("not exist");
            Log.error(var5.getMessage());
            return false;
        }
    }

    public void Javascriptexecutor_forClick(WebDriver driver, String XpathObject, String ObjectName) throws Throwable {
        this.waitForPageToLoad(driver);
        this.waitForPageToLoad(driver);

        try {
            WebElement e = driver.findElement(By.xpath(XpathObject));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", new Object[]{e});
            Extent_Reporting.Log_Pass(ObjectName + " clicked", ObjectName + " Clicked");
            js = null;
            e = null;
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(ObjectName + " Not Present", ObjectName + " Not Present", driver);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            new Exception(ObjectName + " not present");
        }

    }

    public void javascriptExecutor_Setvalue(WebDriver driver, String Xpath, String data, String ElementName) {
        WebElement VVIN = driver.findElement(By.xpath(Xpath));
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("arguments[0].value='" + data + "';", new Object[]{VVIN});
        Extent_Reporting.Log_Pass(ElementName + " is set with " + data, ElementName + " is set with " + data);
    }


    public void inputTextwithClick(WebDriver screenName, String ObjectxPath, String sValue, String Element_Name) throws Exception {
        try {
            WebElement inputText = screenName.findElement(By.xpath(ObjectxPath));
            inputText.click();
            inputText.clear();
            System.out.println(sValue);
            inputText.sendKeys(sValue);
            inputText.sendKeys(Keys.ENTER);
            Extent_Reporting.Log_Pass(Element_Name + " Entered", sValue + " entered in " + Element_Name);
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail(Element_Name + " does not Exist", Element_Name + " does not Exist", screenName);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            throw new Exception("Element Not Present");
        }
    }

    public boolean verifyAssendingSort(int[] array) {
        for (int i = 1; i > array.length; ++i) {
            if (array[i] >= array[i + 1]) {
                return false;
            }

            boolean var3 = true;
        }

        return true;
    }

    public boolean verifyAssendingSort(String[] array) {
        String previous = "";
        String[] var3 = array;
        int var4 = array.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            String current = var3[var5];
            if (current.compareTo(previous) < 0) {
                return false;
            }

            previous = current;
        }

        return true;
    }

    /**
     * Use the locator key to return the web element
     *
     * @param locatorKey - string name set in the java file for a web element
     * @param type       - string to tell which type of locator is being passed in
     *                   supported types: (id, name, classname, linktext, xpath,
     *                   cssselector)
     * @return
     */
    public WebElement getElement(WebDriver driver, String locatorKey, String type) {

        WebElement element = null;
        try {
            if (type.equalsIgnoreCase(Constants.ID)) {
                element = driver.findElement(By.id(locatorKey));
            } else if (type.equalsIgnoreCase(Constants.NAME)) {
                element = driver.findElement(By.name(locatorKey));
            } else if (type.equalsIgnoreCase(Constants.CLASSNAME)) {
                element = driver.findElement(By.className(locatorKey));
            } else if (type.equalsIgnoreCase(Constants.LINKTEXT)) {
                element = driver.findElement(By.linkText(locatorKey));
            } else if (type.equalsIgnoreCase(Constants.XPATH)) {
                element = driver.findElement(By.xpath(locatorKey));
            } else if (type.equalsIgnoreCase(Constants.CSSSELECTOR)) {
                element = driver.findElement(By.cssSelector(locatorKey));
            } else {
                Assert.fail(Constants.THE_PROVIDED_LOCATOR_IS_NOT_FOUND_AT + locatorKey);
            }

        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail("GetElement Method Failed", "\"GetElement Method Failed\"", driver);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            new Exception("GetElement Method Failed");
        }

        return element;

    }

    /**
     * click the webelement having javascript associated in the html tag.
     *
     * @param locatorKey - string name set in the java file for a web element
     * @param type       type - string to tell which type of locator is being passed
     *                   in supported types: (id, name, classname, linktext, xpath,
     *                   cssselector)
     */

    public void javascriptExecutorClick(WebDriver driver, String locatorKey, String type) throws Exception {

        WebElement element = getElement(driver, locatorKey, type);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
        Extent_Reporting.Log_Pass_Screenshot("Clicked Element", "Clicked Element Successfully", driver);

    }

    /**
     * Enter text into a text field  having javascript associated in the html tag.
     *
     * @param locatorKey - string name set in the java file for a web element
     * @param data       - text to be entered into a text field
     * @param type       type - string to tell which type of locator is being passed in
     *                   supported types: (id, name, classname, linktext, xpath,
     *                   cssselector)
     */

    public void javascriptExecutorInput(WebDriver driver, String locatorKey, String data, String type) {
        try {
            WebElement element = getElement(driver, locatorKey, type);
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].value='" + data + "';", element);

            element.sendKeys(Keys.ENTER);

        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail("GetElement Method Failed", "\"GetElement Method Failed\"", driver);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            new Exception("GetElement Method Failed");
        }
    }

    public void javascriptExecutorInputWithFocus(WebDriver driver, String locatorKey, String data, String type) {
        try {
            WebElement element = getElement(driver, locatorKey, type);
            element.sendKeys(data);
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("$(arguments[0]).change();", element);
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail("GetElement Method Failed", "\"GetElement Method Failed\"", driver);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            new Exception("GetElement Method Failed");
        }
    }


    /**
     * Scrolls within a window to put an element into view
     *
     * @param locator - string name set in the java file for a web element
     * @param type    - string to tell which type of locator is being passed in
     *                supported types: (id, name, classname, linktext, xpath,
     *                cssselector)
     * @throws InterruptedException
     */
    public void scrollWindow(WebDriver driver, String locator, String type) throws InterruptedException {
        WebElement element = getElement(driver, locator, type);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);

    }

    /**
     * Highlight the element provided
     *
     * @param locator - string name set in the java file for a web element
     * @param type    - string to tell which type of locator is being passed in
     *                supported types: (id, name, classname, linktext, xpath,
     *                cssselector)
     */
    public void highlightElement(WebDriver driver, String locator, String type) {
        WebElement ele = getElement(driver, locator, type);
        ((JavascriptExecutor) driver)
                .executeScript("argument[0].setAttribute('style','background: yellow; border: 2px solid red;');", ele);

    }

    public void focusWindow(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.focus();");
    }

    /**
     * Select a Dropdown element by value using Java Script Executor
     *
     * @param locatorKey - string name set in the java file for a web element
     * @param value      - attribute value
     * @param type       - string to tell which type of locator is being passed in
     *                   supported types: (id, name, classname, linktext, xpath,
     *                   cssselector)
     * @return
     */
    public void javascriptExecutorDropdownSelect(WebDriver driver, String locatorKey, String type, String value) {


        WebElement select = getElement(driver, locatorKey, type);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var select = arguments[0]; "
                + "for(var i = 0; i < select.options.length; i++)"
                + "{ if(select.options[i].text == arguments[1])"
                + "{ select.options[i].selected = true;} "
                + "}", select, value);

    }

    /**
     * Clicks the web element provided
     *
     * @param locatorKey - string name set in the java file for a web element
     * @param type       - string to tell which type of locator is being passed in
     *                   supported types: (id, name, classname, linktext, xpath,
     *                   cssselector)
     */

    public void click(WebDriver driver, String locatorKey, String type, String elementName) {
        try {
            getElement(driver, locatorKey, type).click();
            Extent_Reporting.Log_Pass_Screenshot("Click", "Clicked on" + elementName + "Successfully", driver);
        } catch (
                Throwable var6) {
            Extent_Reporting.Log_Fail("Click", " Clicked on " + elementName + "Failed", driver);
            var6.printStackTrace();
            Log.error(var6.getMessage());
            new Exception("Click Method Failed");
        }
    }

    /**
     * Switch to the iFrame
     *
     * @param index - int index of the iFarme
     */

    public void switchToIFrameByIndex(WebDriver driver, int index) {
        try {
            driver.switchTo().frame(index);
            Extent_Reporting.Log_Pass_Screenshot("switchToIFrame", "Switched to iFrame" + index + " Successfully", driver);
        } catch (Throwable var6) {
            Extent_Reporting.Log_Fail("switchToIFrame", "\"switch To iFrame Failed\"", driver);

        }
    }

    /**
     * Find out the iFrame index in which element is present
     *
     * @param elementXpath - xpath of the element that needs to be found.
     * @Author Aradhana
     */
    public void findIFrameIndexWhereinElementIsPresent(WebDriver driver, String elementXpath) {
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total iframe present =  " + size);
        for (int i = 0; i < size; i++) {
            driver.switchTo().frame(i);
            int total = driver.findElements(By.xpath(elementXpath)).size();
            /*  find if element is present under the iframe*/
            System.out.println("Total elements present under the iframe with index " + i + " is " + total);
            /*return the index of the iframe under which the element is present*/
            driver.switchTo().defaultContent(); //switching back from the iframe
        }
    }

    /**
     * Switch To the iFrame in which element is present
     *
     * @param elementXpath - xpath of the element that needs to be found.
     * @authorAradhana
     */
    public void switchToIframeWhereinElementIsPresent(WebDriver driver, String elementXpath) {
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total iframe present =  " + size);
        List<Integer> iframeIndex = new ArrayList();
        for (int i = 0; i < size; i++) {
            driver.switchTo().frame(i);
            int total = driver.findElements(By.xpath(elementXpath)).size();
            /*  find if element is present under the iframe*/
            System.out.println("Total elements present under the iframe with index " + i + " is " + total);
            driver.switchTo().defaultContent();
            if (total == 1) {
                iframeIndex.add(i);
            }
        }
        Iterator<Integer> iterator = iframeIndex.iterator();
        Integer nextID = null;
        while (iterator.hasNext()) {
            nextID = iterator.next();
        }
        driver.switchTo().frame(nextID);
    }

    /**
     * Wait for with the element to be clickable or visible
     *
     * @param locator          - string name set in the properties file for a web
     *                         element
     * @param timeoutinseconds - desired wait time
     * @param condition        this is either visibilityOfElementLocated or
     *                         ElementToBeClickable
     * @return
     */
    public WebElement explicitWait(WebDriver driver, String locator, int timeoutinseconds, String condition) {

        WebElement element = null;
        if (condition.equalsIgnoreCase("visibilityOfElementLocated")) {
            element = new WebDriverWait(driver, timeoutinseconds)
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            return element;
        }

        if (condition.equalsIgnoreCase("ElementToBeClickable")) {
            element = new WebDriverWait(driver, timeoutinseconds)
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
            return element;
        }
        return element;

    }

    /**
     * Grab control of the top most open browser window
     */
    public void getTopWindow(WebDriver driver) {

        try {
            Set<String> ids = driver.getWindowHandles();
            Iterator<String> iterator = ids.iterator();
            String nextID = null;
            while (iterator.hasNext()) {
                nextID = iterator.next();
            }
            driver.switchTo().window(nextID);
            Log.info("Switched To Top Window");
            Extent_Reporting.Log_Pass_Screenshot(" Switch to Top most window ", " Switched to Top most window successfully ", driver);

        } catch (Exception e) {

            Log.info("Not Switched To Top Window");
            Log.warn(e.getMessage());
            Log.fatal("Not Switched To Top Window:" + e.getMessage());
            Extent_Reporting.Log_Fail("Switch to Top most window", "Failed to switch to Top most window", driver);

        }

    }

    /**
     @Author Gaurav Gupta
     */

    public void inputTextShadowDOMJS(WebDriver driver, String JSQuery, String inputData) throws Exception {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebElement inputTextArea = (WebElement) jse.executeScript(JSQuery);
            jse.executeScript("arguments[0].value='" + inputData + "';", inputTextArea);
            Extent_Reporting.Log_Pass_Screenshot("enter text in Text Field", "Text entered successfully", driver);
        } catch (Exception e) {
            Extent_Reporting.Log_Fail("enter text in Text Field", "Failed to enter Text ", driver);
        }
    }

    public void ShadowDOMJS_Click(WebDriver driver, String JSQuery1) throws Exception {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebElement object = (WebElement) jse.executeScript(JSQuery1);
            jse.executeScript("arguments[0].click();",object);
            Extent_Reporting.Log_Pass_Screenshot("Clicked Element", "Clicked Element Successfully", driver);
        } catch (Exception e) {
            Extent_Reporting.Log_Fail("Clicked Element", "Failed to Clicked Element ", driver);
        }
    }

}
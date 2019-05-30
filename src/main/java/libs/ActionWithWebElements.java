package libs;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import javax.xml.transform.TransformerException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionWithWebElements {
    WebDriver driver;
    Logger log;
    WebDriverWait webDriverWait20;

    public ActionWithWebElements(WebDriver webDriver) {
        this.driver = webDriver;
        log = Logger.getLogger(getClass());
        webDriverWait20=new WebDriverWait(driver,20);
    }

    /**
     * Метод ввода текста в поле
     */
    public void inputTextToField(WebElement inputField, String inputText) {
        try {
           inputField.clear();
            inputField.sendKeys(inputText);
            log.info("Text is input");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Text is not input");
            Assert.fail("Can't work input");
        }
    }

    /**
     * Нажатие кнопки
     *
    public void pressButton(WebElement buttonName) {
        try {
            buttonName.click();
            log.info("Button is pressed");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Button is not pressed");
            Assert.fail("Pressing isn't work");
        }
    }

    public void pressLink(WebElement link){
        try{
            link.click();
        }catch (Exception e){
            e.printStackTrace();
            log.info("Link isn't pressed");
            Assert.fail("Can't work link");
        }
    }*/

    /**
     * Нажатия елемента
     * */
    public void clickToElements(WebElement element){
        try{
            webDriverWait20.until(ExpectedConditions.visibilityOf(element));
            element.click();
        }catch (Exception e){
            e.printStackTrace();
            log.info("Link isn't pressed");
            Assert.fail("Can't work link");
        }
    }

    /**
     * Выбор значения из дропдаун листа
     */
    public void selectDDByText(WebElement locatorDD, String textDD) {
        try {
            Select selectDD = new Select(locatorDD);
            selectDD.selectByVisibleText(textDD);
            log.info("Text was selected");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Text doesn't selected");
            Assert.fail("Can't select");
        }
    }

    /**
     * Выбор значения из дропдаун листа по значению
     */
    public void selectDDByValue(WebElement locatorDD, String valueDD) {
        try {
            Select selectDD = new Select(locatorDD);
            selectDD.selectByValue(valueDD);
            log.info("Value was selected");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Value doesn't selected");
            Assert.fail("Can't select");
        }
    }

    public boolean isElementPresent(WebElement element){
        return (element.isDisplayed() && element.isEnabled());
    }

    /**
     * Выбор значения из дропдаун листа по значению
     */
    public void selectCheckBox(WebElement locatorCheckBox, boolean isNeededStatus) {
        try {
            if ((isNeededStatus && locatorCheckBox.isSelected()) ||
                    !isNeededStatus && locatorCheckBox.isSelected()) {
                locatorCheckBox.click();
                log.info("All is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Something went wrong");
        }
    }


}



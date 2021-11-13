package testcases;

import Models.ButtonAndTexts;
import Models.ListElements;
import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;

public class SearchItems extends BaseTest {
    AndroidDriver<AndroidElement> driver = setUp();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();
    ListElements listElements = new ListElements(driver);

    public SearchItems() throws MalformedURLException {
    }

    @Test
    public void searchItem () {
        buttonAndTexts.btnClick(Locators.searchBtn);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.searchBox);
        timeOut.timeOut();
        buttonAndTexts.sendKeysToField(Locators.editSearchField, "mobile");
        timeOut.timeOut();
        buttonAndTexts.clickKeyboardButton("search");
        timeOut.timeOutFixed(5000);
        listElements.findFromList(Locators.adSliderItems, 0);
        timeOut.timeOut();

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

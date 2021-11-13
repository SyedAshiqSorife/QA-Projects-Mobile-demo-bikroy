package testcases;

import Models.ButtonAndTexts;
import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;

public class LogoutTest extends BaseTest {
    AndroidDriver<AndroidElement> driver = setUp();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();

    public LogoutTest() throws MalformedURLException {
    }
    @Test
    public  void logoutTest () {
        buttonAndTexts.btnClick(Locators.profileBtn);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.logoutBtn);
        timeOut.timeOut();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

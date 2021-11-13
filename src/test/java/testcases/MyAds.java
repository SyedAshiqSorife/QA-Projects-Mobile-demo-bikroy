package testcases;

import Models.ListElements;
import Models.ButtonAndTexts;
import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;

import static org.testng.Assert.assertTrue;

public class MyAds extends BaseTest {
    AndroidDriver<AndroidElement> driver = setUp();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();
    ListElements assertElements = new ListElements(driver);

    public MyAds() throws MalformedURLException {
    }

    @Test
    public void elementTest() {
        //login
        buttonAndTexts.btnClick(Locators.profileBtn);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.signUp_email_btn);
        timeOut.timeOut();
        buttonAndTexts.textField(Locators.emailField, Locators.emailText);
        buttonAndTexts.textField(Locators.passwordField, Locators.passwordText);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.loginBtn);
        timeOut.timeOutFixed(2000);

        //click on elements
        buttonAndTexts.btnClick(Locators.myAds);
        timeOut.timeOutFixed(2000);
        assertElements.assertion(Locators.headingElements, 0, "My Ads");
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.backButton);
        timeOut.timeOut();

    }

    @Test
    public void logoutTest () {
        buttonAndTexts.btnClick(Locators.logoutBtn);
        timeOut.timeOut();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

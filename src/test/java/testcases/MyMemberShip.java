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

public class MyMemberShip extends BaseTest {
    AndroidDriver<AndroidElement> driver = setUp();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();
    ListElements assertElements = new ListElements(driver);

    public MyMemberShip() throws MalformedURLException {
    }


    @Test
    public void myMemberShipTest() {
        buttonAndTexts.btnClick(Locators.profileBtn);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.signUp_email_btn);
        timeOut.timeOut();
        buttonAndTexts.textField(Locators.emailField, Locators.emailText);
        buttonAndTexts.textField(Locators.passwordField, Locators.passwordText);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.loginBtn);
        timeOut.timeOutFixed(2000);

        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.myMembership);
        timeOut.timeOut();
        assertElements.assertion(Locators.headingElements, 0, "My membership");
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.backButton);
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

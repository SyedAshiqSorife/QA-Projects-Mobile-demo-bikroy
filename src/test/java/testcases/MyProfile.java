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

public class MyProfile extends BaseTest {
    AndroidDriver<AndroidElement> driver = setUp();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();
    ListElements assertElements = new ListElements(driver);

    public MyProfile() throws MalformedURLException {
    }

    @Test
    public void myProfileTest() {
        buttonAndTexts.btnClick(Locators.profileBtn);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.signUp_email_btn);
        timeOut.timeOut();
        buttonAndTexts.textField(Locators.emailField, Locators.emailText);
        buttonAndTexts.textField(Locators.passwordField, Locators.passwordText);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.loginBtn);
        timeOut.timeOutFixed(2000);

        buttonAndTexts.btnClick(Locators.myProfile);
        timeOut.timeOut();
        assertElements.assertion(Locators.headingElements, 0, "My Profile");
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

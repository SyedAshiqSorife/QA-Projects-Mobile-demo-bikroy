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

public class LoginTest extends BaseTest {

    AndroidDriver<AndroidElement> driver = setUp();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();


    public LoginTest() throws MalformedURLException {
    }

    @Test
    public void loginTest() {

        buttonAndTexts.btnClick(Locators.profileBtn);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.signUp_email_btn);
        timeOut.timeOut();
        buttonAndTexts.textField(Locators.emailField, Locators.emailText);
        buttonAndTexts.textField(Locators.passwordField, Locators.passwordText);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.loginBtn);
        timeOut.timeOutFixed(2000);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

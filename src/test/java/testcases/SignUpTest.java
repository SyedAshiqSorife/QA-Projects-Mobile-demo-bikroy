package testcases;

import Models.ButtonAndTexts;
import base.BaseTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;

public class SignUpTest extends BaseTest {
    AndroidDriver<AndroidElement> driver = setUp();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();

    public SignUpTest() throws MalformedURLException {
    }

    @Test
    public void signUp() {
        buttonAndTexts.btnClick(Locators.profileBtn);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.signUp_email_btn);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.signUpBtn);
        timeOut.timeOut();
        //String selector = "new UiSelector().text('নাম').className('android.widget.EditText')";
        //river.findElement(MobileBy.AndroidUIAutomator(selector)).sendKeys("Abir");
        driver.findElementByName("নাম").sendKeys("Abir");
       // buttonAndTexts.textField(Locators.nameField, Locators.nameText);
        buttonAndTexts.textField(Locators.emailField, Locators.signupEmailText);
        timeOut.timeOut();
        buttonAndTexts.textField(Locators.passwordField, Locators.signUpPasswordText);
        //buttonAndTexts.textField(Locators.confirmPassField, Locators.signUpPasswordText);
        driver.findElementByName("পাসওয়ার্ড আবার").sendKeys("Asdfgh123456");
        timeOut.timeOutFixed(5000);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

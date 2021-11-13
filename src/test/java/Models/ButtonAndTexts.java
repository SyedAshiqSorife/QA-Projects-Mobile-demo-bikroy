package Models;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import utils.Locators;
import utils.TimeOut;

public class ButtonAndTexts {

    AndroidDriver<AndroidElement> driver;
    TimeOut timeOut = new TimeOut();
    public ButtonAndTexts(AndroidDriver<AndroidElement> driver) { this.driver = driver;}

    public void btnClick (By btn) {
        driver.findElement(btn).click();
    }
    public void textField (By emailBox, String text) {
        driver.findElement(emailBox).sendKeys(text);
    }
    public void sendKeysToField(By field, String content) {
        driver.findElement(field).click();
        timeOut.timeOut();
        driver.getKeyboard().sendKeys(content);
    }
    public void clickKeyboardButton (String button) {
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", button));
    }

}

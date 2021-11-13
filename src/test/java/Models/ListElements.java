package Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class ListElements {
    AndroidDriver<AndroidElement> driver;

    public ListElements(AndroidDriver<AndroidElement> driver) {this.driver = driver;}

    public void assertion(String path, int index, String value) {
        List<AndroidElement> mobileElements = driver.findElementsByClassName(path);
        AndroidElement mobileElement = mobileElements.get(index);
        String text = mobileElement.getText();
        System.out.println(text);
        assertTrue(text.contains(value), "NotFound");
        System.out.println("Find " + text);
    }

    public void findFromList (String path, int index) {
        List<AndroidElement> mobileElements = driver.findElementsByClassName(path);
        AndroidElement mobileElement = mobileElements.get(index);
        mobileElement.click();
    }


}

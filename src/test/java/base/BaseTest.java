package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static AndroidDriver<AndroidElement> driver;
    //static AppiumDriver driver2;

    public static AndroidDriver<AndroidElement> setUp () throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android SDK built for x86");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        cap.setCapability(MobileCapabilityType.NO_RESET, "true");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        //cap.setCapability("appPackage", "com.bikroy");
        //cap.setCapability("appActivity", "se.saltside.activity.main.WebViewActivity");
        cap.setCapability("skipUnlock", false);
        //cap.setCapability("appWaitDuration", "50000");

        cap.setCapability(MobileCapabilityType.APP, "E:\\assignments\\bikroy\\apk\\bikroy-1-2-15.apk");
        //driver2 = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Application Starting...");

        return driver;
    }
}

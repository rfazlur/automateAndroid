package com.qa.base;

import com.qa.util.TestUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static Properties prop;
    public static AppiumDriver driver;
    private static String cwd = System.getProperty("user.dir");


    public TestBase(){
        try{
            prop = new Properties();
            FileInputStream ip = new FileInputStream(cwd+"/src/main/java/com/fdn"
                    + "/qa/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() throws MalformedURLException {
        String device = prop.getProperty("deviceName");
        String platform = prop.getProperty("platformName");
        String serverLoc = prop.getProperty("server");
        String portNumber = prop.getProperty("port");


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", device);
        caps.setCapability("platformName", platform);
        caps.setCapability("app", cwd+"/src/app/260.apk");

        driver = new AndroidDriver(new URL("http://"+serverLoc+":"+portNumber+"/wd/hub"), caps);

        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }
}
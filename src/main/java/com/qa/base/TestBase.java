package com.qa.base;

import com.qa.util.TestUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
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
    static String nodePath = "/usr/local/bin/node";
    static String appiumPath = "/usr/local/bin/appium";
    static AppiumDriverLocalService appiumservice;
    static String appiumServiceUrl;


    public TestBase(){
        try{
            prop = new Properties();
            FileInputStream ip = new FileInputStream(cwd+"/src/main/java/com"
                    + "/qa/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void startAppium() throws InterruptedException {
        appiumservice = new AppiumServiceBuilder()
                .usingDriverExecutable(new File(nodePath))
                .withAppiumJS(new File(appiumPath))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
        appiumservice.start();
        Thread.sleep(7000);
    }

    public static void stopAppium() throws IOException {
        Runtime.getRuntime().exec("killall node");
    }

    public static void initialization() throws IOException, InterruptedException {
        String device = prop.getProperty("deviceName");
        String platform = prop.getProperty("platformName");
        String serverLoc = prop.getProperty("server");
        String portNumber = prop.getProperty("port");

        stopAppium();
        startAppium();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", device);
        caps.setCapability("platformName", platform);
        caps.setCapability("app", cwd+"/src/app/fdndev.apk");
        caps.setCapability("automationName", "Appium");

        //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        driver = new AndroidDriver(new URL("http://"+serverLoc+":"+portNumber+"/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

    }
}
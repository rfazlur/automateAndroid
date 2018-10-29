package com.qa.util;

import com.qa.base.TestBase;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;


public class Scrolling extends TestBase {

    public void scrollDown(){
        Dimension dimension = driver.manage().window().getSize();
        Double screenHighStart = dimension.getHeight() * 0.5;
        Double screenHighEnd = dimension.getHeight() * 0.2;
        int scrollStart = screenHighStart.intValue();
        int scrollEnd = screenHighEnd.intValue();

        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }
}

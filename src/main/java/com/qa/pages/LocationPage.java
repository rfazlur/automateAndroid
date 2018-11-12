package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LocationPage extends TestBase {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bandung']")
    MobileElement locBandung;

    public LocationPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectLocation(){
        locBandung.click();
    }

}

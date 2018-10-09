package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class LocationPage extends TestBase {

    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.fdbr.android.debug:id/recycler_view']" +
            "//android.widget.RelativeLayout//android.widget.TextView[starts-with(@resource-id='com.fdbr.android.debug:id/txt_city_name')]")
    List<MobileElement> listLocation;

    public LocationPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectLocation(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(listLocation.size());
        listLocation.get(rndInt).click();
    }

}

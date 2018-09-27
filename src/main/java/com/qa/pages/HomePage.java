package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_close")
    MobileElement rateCloseBtn;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view1']")
    MobileElement homeBtn;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view5']")
    MobileElement profileBtn;


    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickRateCloseBtn(){
        rateCloseBtn.click();
    }

    public void clickHomeBtn(){
        homeBtn.click();
    }

    public ProfilePage clickProfileBtn(){
        profileBtn.click();
        return new ProfilePage();
    }

}

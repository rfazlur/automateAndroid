package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TakePicturePage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/anchor")
    MobileElement imageAnchor;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/capture_image_button")
    MobileElement btnTakePicture;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement btnAlowPermissionPhotoAccess;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button")
    MobileElement btnNext;
    /*@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/app_bar_layout']" +
            "//android.widget.FrameLayout[@resource-id='com.fdbr.android.debug:id/fl_container']" +
            "//android.widget.FrameLayout[@bounds='[912,72][1080,240]']")
    MobileElement btnNext;*/

    public TakePicturePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void dismissToolTipTakePicture(){
        imageAnchor.click();
    }

    public void clickBtnTakePicture(){
        btnTakePicture.click();
    }

    public void clickBtnAllowPermission(){
        btnAlowPermissionPhotoAccess.click();
    }

    public void clickBtnNext(){
        btnNext.click();
    }
}
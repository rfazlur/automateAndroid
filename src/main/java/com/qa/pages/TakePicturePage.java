package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.util.Assertions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class TakePicturePage extends TestBase {

    private Assertions assertions;

    public TakePicturePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        assertions = new Assertions();
    }

    private final String BTN_ALLOW_PERMISSION = "com.android.packageinstaller:id/permission_allow_button";
    private final String BTN_CAPTURE_IMAGE = "com.fdbr.android.debug:id/capture_image_button";
    private final String BTN_ALLOW_ACCESS_PHOTO = "com.android.packageinstaller:id/permission_allow_button";
    private final String BTN_CHECK = "com.fdbr.android.debug:id/toolbar_action_button";

    @AndroidFindBy(id = BTN_ALLOW_PERMISSION)
    private MobileElement btnAllowPermission;

    @AndroidFindBy(id = BTN_CAPTURE_IMAGE)
    private MobileElement btnCaptureImage;

    @AndroidFindBy(id = BTN_ALLOW_ACCESS_PHOTO)
    private MobileElement btnAllowAccessPhoto;

    @AndroidFindBy(id = BTN_CHECK)
    private MobileElement btnCheck;



    public void captureImage() throws InterruptedException {
        if (btnAllowPermission.isDisplayed()){
            btnAllowPermission.click();
            Thread.sleep(2000);
            btnCaptureImage.click();
        } else {
            btnCaptureImage.click();
        }
    }

    public void clickBtnCheck() {
        if (btnAllowAccessPhoto.isDisplayed()){
            btnAllowAccessPhoto.click();
            assertions.waitForNextButtonTakePicture();
            btnCheck.click();
        } else {
            assertions.waitForNextButtonTakePicture();
            btnCheck.click();
        }
    }
}
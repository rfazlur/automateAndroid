package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_btn")
    MobileElement btnStartJourney;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
    MobileElement btnHome;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lihat produk yang cocok dengan Beauty ID mu']")
    MobileElement tipProductMatches1;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Klik untuk melihat lebih banyak produk']")
    MobileElement tipProductMatches2;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Category']")
    MobileElement btnCategory;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_close")
    MobileElement btnCloseRate;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/fab")
    MobileElement btnPlus;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_ok")
    MobileElement btnOKCameraPermission;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement btnAllowTakePicture;

    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBtnStartJourney(){
        btnStartJourney.click();
    }

    public void dismissToolTip(){
        if(tipProductMatches1.isDisplayed()){
            btnHome.click();
        } else if(tipProductMatches2.isDisplayed()) {
            btnHome.click();
        }
    }

    public void clickBtnCategory(){
        btnCategory.click();
    }

    public void clickBtnCloseRate(){
        btnCloseRate.click();
    }

    public void clickBtnPlus(){
        btnPlus.click();
    }

    public void clickBtnOKCameraPermission(){
        btnOKCameraPermission.click();
    }

    public void clickBtnAllowTakePicture(){
        btnAllowTakePicture.click();
    }
}

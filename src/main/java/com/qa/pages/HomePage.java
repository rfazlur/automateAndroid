package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @AndroidFindBy(id = "img_tab1")
    MobileElement homeMenu;

    @AndroidFindBy(id = "img_tab2")
    MobileElement homeFeed;

    @AndroidFindBy(id = "img_tab4")
    MobileElement homeDiscover;

    @AndroidFindBy(id = "img_tab5")
    MobileElement homeProfile;


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
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_notification_button")
    MobileElement btnNotification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Profile']")
    MobileElement btnProfile;


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

<<<<<<< HEAD
    public void clickHome(){
        homeMenu.click();
    }

    public void clickFeed(){
        homeFeed.click();
    }

    public void clickDiscover(){
        homeDiscover.click();
    }

    public void clickProfile(){
        homeProfile.click();
=======
    /*public void clickBtnOKCameraPermission(){
        btnOKCameraPermission.click();
    }*/

    public void clickBtnOKCameraPermission(){
        if(btnOKCameraPermission.isDisplayed()){
            btnOKCameraPermission.click();
        }
    }

    /*public void clickBtnAllowTakePicture(){
        btnAllowTakePicture.click();
    }*/

    public void clickBtnAllowTakePicture(){
        if(btnAllowTakePicture.isDisplayed()){
            btnAllowTakePicture.click();
        }
    }

    public void clickNotificationBell(){
        btnNotification.click();
    }

    public void clickProfileButton(){
        btnProfile.click();
>>>>>>> c0da3f0135d02e696a79ccf5b8f1f0dcfbe60be7
    }
}

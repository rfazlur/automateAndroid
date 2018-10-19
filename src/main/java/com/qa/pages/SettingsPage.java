package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_editprofile")
    MobileElement optionEditProfile;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_invitefriend")
    MobileElement optionInviteFriends;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_cs")
    MobileElement optionFeedback;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_rate")
    MobileElement optionRateApp;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_ppo")
    MobileElement optionPrivacyPolicy;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_logout")
    MobileElement optionLogout;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button")
    MobileElement headToolbarBack;

    //edit profile field
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_back")
    MobileElement headToolbarBackEditProfile;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_save")
    MobileElement headToolbarSaveEditProfile;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_dob")
    MobileElement fieldDOB;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_name")
    MobileElement fieldUsername;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_location")
    MobileElement fieldLocation;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_phone_number")
    MobileElement fieldPhone;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_bio")
    MobileElement fieldBio;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_beauty_id")
    MobileElement optionUpdateBP;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_beauty_concern")
    MobileElement optionUpdateBC;

    //option beauty profile
    @AndroidFindBy(xpath = "android.widget.FrameLayout[@instance='8']")
    MobileElement skinOily;

    @AndroidFindBy(xpath = "android.widget.LinearLayout[@instance='13']")
    MobileElement skinToneDark;

    @AndroidFindBy(xpath = "android.widget.FrameLayout[@instance='18']")
    MobileElement skinUndertone;

    @AndroidFindBy(xpath = "android.widget.FrameLayout[@instance='11']")
    MobileElement hairTypeCurly;

    @AndroidFindBy(xpath = "android.widget.FrameLayout[@instance='13']")
    MobileElement colouredHairNo;

    @AndroidFindBy(xpath = "android.widget.FrameLayout[@instance='15']")
    MobileElement hijaberYes;

    @AndroidFindBy(xpath = "android.widget.FrameLayout[@instance='17']")
    MobileElement buttonSaveUpdateBeautyProf;


    public SettingsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickEditProfile(){
        optionEditProfile.click();
    }

    public void clickInviteFriends(){
        optionInviteFriends.click();
    }

    public void clickFeedback(){
        optionFeedback.click();
    }

    public void clickRateApp(){
        optionRateApp.click();
    }

    public void clickPrivacyPolicy(){
        optionPrivacyPolicy.click();
    }

    public void clickOptionLogout(){
        optionLogout.click();
    }

    public void clickHeadToolbarBack(){
        headToolbarBack.click();
    }
}

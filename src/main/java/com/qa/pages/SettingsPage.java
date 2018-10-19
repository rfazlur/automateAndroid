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

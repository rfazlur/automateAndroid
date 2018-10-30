package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
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

    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_pencil")
    MobileElement editPhotoProfile;

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

            //-------------------option beauty profile
            //skin type
            //com.fdbr.android.debug:id/hsv_skin_types
            @AndroidFindBy(id = "com.fdbr.android.debug:id/hsv_skin_types")
            MobileElement skinTypeElement;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='6']")
            MobileElement skinDry;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='7']")
            MobileElement skinNormal;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='8']")
            MobileElement skinCombination;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='9']")
            MobileElement skinOily;

            //skin tone
            @AndroidFindBy(id = "//com.fdbr.android.debug:id/ll_skin_tones")
            MobileElement skinToneElement;

            @AndroidFindBy(xpath = "//android.widget.LinearLayout[@instance='9']")
            MobileElement skinToneLight;

            @AndroidFindBy(xpath = "//android.widget.LinearLayout[@instance='10']")
            MobileElement skinMedLight;

            @AndroidFindBy(xpath = "//android.widget.LinearLayout[@instance='11']")
            MobileElement skinToneMed;

            @AndroidFindBy(xpath = "//android.widget.LinearLayout[@instance='12']")
            MobileElement skinToneMedDark;

            @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='4']")
            MobileElement skinToneDark;

            //skin undertone
            @AndroidFindBy(id = "com.fdbr.android.debug:id/hsv_skin_undertones")
            MobileElement skinUnderToneElement;


            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='0']")
            MobileElement skinCool;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='1']")
            MobileElement skinNeutral;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='2']")
            MobileElement skinWarm;

            //hair type
            @AndroidFindBy(id = "//com.fdbr.android.debug:id/hsv_hair_types")
            MobileElement hairTypeElement;


            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='8']") //element nya sama dengan skinOily
            MobileElement hairTypeWavy;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='10']")
            MobileElement hairTypeStraight;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='11']")
            MobileElement hairTypeCurly;

            //colored hair
            @AndroidFindBy(id = "com.fdbr.android.debug:id/hsv_hair_colors")
            MobileElement coloredHairElement;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='12']")
            MobileElement colouredHairYes;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='13']")
            MobileElement colouredHairNo;

            //are u hijaber
            @AndroidFindBy(xpath = "//com.fdbr.android.debug:id/hsv_hijabs")
            MobileElement hijaberElement;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='14']")
            MobileElement hijaberYes;

            @AndroidFindBy(xpath = "//android.widget.FrameLayout[@instance='15']")
            MobileElement hijaberNo;


        @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_save")
        MobileElement buttonSaveUpdateBeautyProf;

        //Feedback option field
        @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button_image")
        MobileElement headToolbarBackFeedback;

        @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_questions")
        MobileElement feedbackField;

        @AndroidFindBy(id = "com.fdbr.android.debug:id/rl_send")
        MobileElement buttonSendFeedback;

        @AndroidFindBy(id = "android:id/button1")
        MobileElement okToFillFieldFeedback;



    public SettingsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //edit profile
    public void clickEditProfile(){
        optionEditProfile.click();
    }

        public void editFullname(){
            fieldUsername.clear();
            fieldUsername.sendKeys("hahahaha");
        }

        public void editLocation(){
            fieldLocation.click();
        }

        public void editNumber(){
            fieldPhone.clear();
            fieldPhone.sendKeys("812849145951");
        }

        public void editBio(){
            fieldBio.clear();
            fieldBio.sendKeys("muehehehee");
        }

        public void clickUpdateBeautyPro(){
            optionUpdateBP.click();
        }

        public void clickUpdateBeautyConc(){
            optionUpdateBC.click();
        }

        public void clickSaveNewBeaProf(){
            buttonSaveUpdateBeautyProf.click();
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

    public void setSkinType(String editskintype){

        if (editskintype.equals("dry")){
            skinDry.click();
        } else if (editskintype.equals("normal")){
            skinNormal.click();
        } else  if (editskintype.equals("combination")){
            skinCombination.click();
        } else  if(editskintype.equals("oily")){
            skinOily.click();
        } else {
            System.out.println("skin type changed");
        }
    }

    public void setSkinTone(String editskintone){

        if (editskintone.equals("light")){
            skinToneLight.click();
        } else if (editskintone.equals("medium light")){
            skinMedLight.click();
        } else  if (editskintone.equals("medium")){
            skinToneMed.click();
        } else  if(editskintone.equals("medium dark")){
            skinToneMedDark.click();
        } else if(editskintone.equals("dark")){
            skinToneDark.click();
        } else {
            System.out.println("skin tone changed");
        }
    }

    public void setSkinUndertone(String editskinundertone){

        if (editskinundertone.equals("cool")){
            skinCool.click();
        } else if (editskinundertone.equals("neutral")){
            skinNeutral.click();
        } else  if (editskinundertone.equals("worm")){
            skinWarm.click();
        } else {
            System.out.println("skin undertone changed");
        }
    }

    public void setHairType(String edithairtype){

        if (edithairtype.equals("wavy")){
            hairTypeWavy.click();
        } else if (edithairtype.equals("straight")){
            hairTypeStraight.click();
        } else  if (edithairtype.equals("curly")){
            hairTypeCurly.click();
        } else {
            System.out.println("hairtype changed");
        }
    }

    public void setColoredHair(String editcoloredhair){

        if (editcoloredhair.equals("wavy")){
            colouredHairYes.click();
        } else if (editcoloredhair.equals("straight")){
            colouredHairNo.click();
        } else {
            System.out.println("coloredhair changed");
        }
    }

    public void setHijaber(String edithijaber){

        if (edithijaber.equals("yes")){
            hijaberYes.click();
        } else if (edithijaber.equals("no")){
            hijaberNo.click();
        } else {
            System.out.println("is hijab changed");
        }
    }

    public void clickHeadToolbarSaveEditProfile(){
        headToolbarSaveEditProfile.click();
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }

}

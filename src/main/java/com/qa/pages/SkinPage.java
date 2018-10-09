package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SkinPage extends TestBase {

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_types']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> listSkinTypes;

    @AndroidFindBy(xpath = "//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded_titled')]")
    List<MobileElement> listSkinTone;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_undertones']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> listSkinUndertone;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_next")
    MobileElement btnNext;

    public SkinPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectSkinType(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(listSkinTypes.size());
        listSkinTypes.get(rndInt).click();
    }

    public void selectSkinTone(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(listSkinTone.size());
        listSkinTone.get(rndInt).click();
    }

    public void selectSkinUndertone(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(listSkinUndertone.size());
        listSkinUndertone.get(rndInt).click();
    }

    public void tapNextButton(){
        btnNext.click();
    }
}
package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class HairPage extends TestBase {

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hair_types']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> listHairType;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hair_colors']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> listColoredHair;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hijabs']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> listHijab;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_next")
    MobileElement btnNext;

    public HairPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectHairType(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(listHairType.size());
        listHairType.get(rndInt).click();
    }

    public void selectColoredHair(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(listColoredHair.size());
        listColoredHair.get(rndInt).click();
    }

    public void selectHijab(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(listHijab.size());
        listHijab.get(rndInt).click();
    }

    public void tapNextButton(){
        btnNext.click();
    }

}

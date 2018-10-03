package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HairPage extends TestBase {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@instance='2']")
    MobileElement hairWavy;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@instance='4']")
    MobileElement hairStraight;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@instance='6']")
    MobileElement hairCurly;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@instance='8']")
    MobileElement hairColoredYes;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@instance='10']")
    MobileElement hairColoredNo;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@instance='12']")
    MobileElement hijaberYes;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@instance='14']")
    MobileElement hijaberNo;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_next")
    MobileElement btnNext;

    public HairPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectHairWavy(){
        hairWavy.click();
        return;
    }
    public void selectHairStraight(){
        hairStraight.click();
        return;
    }
    public void selectHairCurly(){
        hairCurly.click();
        return;
    }

    public void selectHairColoredYes(){
        hairColoredYes.click();
        return;
    }
    public void selectHairColoredNo(){
        hairColoredNo.click();
        return;
    }

    public void selectHijaberYes(){
        hijaberYes.click();
        return;
    }
    public void selectHijaberNo(){
        hijaberNo.click();
        return;
    }

    public void tapNextButton(){
        btnNext.click();
        return;
    }

}

package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SkinPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_next")
    MobileElement btnNext;

    public SkinPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectSkinType(){
        List<MobileElement> elements = driver.findElements(By.xpath("//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]"));
        Random rnd = new Random();
        int rndInt = rnd.nextInt(elements.size());
        elements.get(rndInt).click();
    }

    public void selectSkinTone(){
        List<MobileElement> elements = driver.findElements(By.xpath("//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded_titled')]"));
        Random rnd = new Random();
        int rndInt = rnd.nextInt(elements.size());
        elements.get(rndInt).click();
    }

    public void selectSkinUndertone(){
        List<MobileElement> elements = driver.findElements(By.xpath("//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]"));
        Random rnd = new Random();
        int rndInt = rnd.nextInt(elements.size());
        elements.get(rndInt).click();
    }

    public void tapNextButton(){
        btnNext.click();
    }
    /*com.fdbr.android.debug:id/ll_skin_tones
    com.fdbr.android.debug:id/hsv_skin_undertones
    com.fdbr.android.debug:id/hsv_hair_types
    com.fdbr.android.debug:id/hsv_hair_colors
    com.fdbr.android.debug:id/hsv_hijabs*/
}
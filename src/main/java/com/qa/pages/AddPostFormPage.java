package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddPostFormPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_caption")
    MobileElement txtCaption;

    public AddPostFormPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void inputCaption(String caption){
        txtCaption.sendKeys(caption);
    }

}

package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SateliteButtonPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_add_review")
    MobileElement btnAddReview;

    public SateliteButtonPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBtnReview(){
        btnAddReview.click();
    }

}

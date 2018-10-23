package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SateliteButtonPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_add_review")
    MobileElement btnAddReview;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_post_photo")
    MobileElement btnAddPost;

    public SateliteButtonPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBtnReview(){
        btnAddReview.click();
    }

    public void clickBtnPost(){
        btnAddPost.click();
    }

}

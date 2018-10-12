package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/ll_add_review")
    MobileElement btnAddReview;

    public ProductDetailPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBtnAddReview(){
        btnAddReview.click();
    }

}

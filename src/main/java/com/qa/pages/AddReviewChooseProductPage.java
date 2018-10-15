package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddReviewChooseProductPage extends TestBase {

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='0']")
    MobileElement btnProduct;

    public AddReviewChooseProductPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectProduct(){
        btnProduct.click();
    }

}

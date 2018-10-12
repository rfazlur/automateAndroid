package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ProductCategoryPage extends TestBase {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gentle Skin Cleanser']")
    MobileElement btnProduct;

    public ProductCategoryPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickProductName(){
        btnProduct.click();
    }

}

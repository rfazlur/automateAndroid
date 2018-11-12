package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CarouselPage extends TestBase {
    public CarouselPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy (id = "com.fdbr.android.debug:id/rel_next")
    MobileElement btnNext;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_start")
    MobileElement btnGetStarted;

    public void clickBtnNext(){
        btnNext.click();
    }

    public void clickGetStarted(){
        btnGetStarted.click();
    }
}

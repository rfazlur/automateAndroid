package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DOBPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_dob")
    MobileElement txtDOB;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_ok")
    MobileElement btnOK;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_next")
    MobileElement btnNext;

    public DOBPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapDOBField(){
        txtDOB.click();
        return;
    }

    public void tapOKButton(){
        btnOK.click();
        return;
    }

    public void tapNextButton(){
        btnNext.click();
        return;
    }

}

package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class OnBoardingPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_login")
    MobileElement btnLogin;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_signup")
    MobileElement btnSignUp;

    public OnBoardingPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public void clickBtnSignUp(){
        btnSignUp.click();
    }

}

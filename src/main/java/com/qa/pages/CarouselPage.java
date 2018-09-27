package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CarouselPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_login")
    MobileElement btnLogin;

    public CarouselPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public LoginPage clickBtnLogin(){
        btnLogin.click();
        return new LoginPage();
    }

}

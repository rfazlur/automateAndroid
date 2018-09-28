package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_logout")
    MobileElement btnLogout;

    public SettingsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickLogoutBtn(){
        btnLogout.click();
    }
}

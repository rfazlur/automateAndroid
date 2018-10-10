package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FindFriendPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_text")
    MobileElement btnSkip;

    public FindFriendPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBtnSkip(){
        btnSkip.click();
    }

}

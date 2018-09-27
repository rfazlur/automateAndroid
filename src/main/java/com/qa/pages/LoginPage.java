package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_username")
    MobileElement textFieldUsername;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_password")
    MobileElement textFieldPassword;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_signin")
    MobileElement btnLogin;

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public HomePage loginProcess(String uname, String pwd){
        textFieldUsername.sendKeys(uname);
        textFieldPassword.sendKeys(pwd);
        driver.hideKeyboard();
        btnLogin.click();
        return new HomePage();
    }

}

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

    public void inputUsername(String uname){
        textFieldUsername.sendKeys(uname);
        return;
    }

    public void inputPassword(String passwd){
        textFieldPassword.sendKeys(passwd);
        return;
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }

    public void tapBtnLogin(){
        btnLogin.click();
    }

}

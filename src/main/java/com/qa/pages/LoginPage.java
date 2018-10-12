package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_username")
    MobileElement txtUsername;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_password")
    MobileElement txtPassword;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_signin")
    MobileElement btnLogin;

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void inputUsername(String uname){
        txtUsername.sendKeys(uname);
    }

    public void inputPassword(String passwd){
        txtPassword.sendKeys(passwd);
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }

    public void tapBtnLogin(){
        btnLogin.click();
    }

}

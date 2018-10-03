package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_email")
    MobileElement txtEmail;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_username")
    MobileElement txtUsername;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_password")
    MobileElement txtPassword;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_register")
    MobileElement btnContinue;

    public SignUpPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void inputEmail(String email){
        txtEmail.sendKeys(email);
        return;
    }

    public void inputUsername(String uname){
        txtUsername.sendKeys(uname);
        return;
    }

    public void inputPassword(String passwd){
        txtPassword.sendKeys(passwd);
        return;
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
        return;
    }

    public void tapContinueButton(){
        btnContinue.click();
        return;
    }

}

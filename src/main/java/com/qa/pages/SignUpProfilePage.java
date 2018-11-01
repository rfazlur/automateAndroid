package com.qa.pages;

import com.github.javafaker.Name;
import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignUpProfilePage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_photo")
    MobileElement btnUploadPicture;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/met_fullname")
    MobileElement txtFullName;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/met_phone_number")
    MobileElement txtPhoneNumber;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/met_location")
    MobileElement txtLocation;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_next")
    MobileElement btnNext;

    public SignUpProfilePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void inputFullName(String fname){
        txtFullName.sendKeys(fname);
    }

    public void inputPhoneNumber(String pnumber){
        txtPhoneNumber.sendKeys(pnumber);
    }

    public void clickLocation(){
        txtLocation.click();
    }

    public void clickBtnNext(){
        btnNext.click();
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }

    public void clickUploadProfilePicture(){
        btnUploadPicture.click();
    }

}

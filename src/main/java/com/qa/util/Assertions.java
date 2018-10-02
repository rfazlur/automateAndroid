package com.qa.util;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assertions extends TestBase {

    WebDriverWait wait;

    @AndroidFindBy (id = "com.fdbr.android.debug:id/txt_agree")
    MobileElement textAgree;

    @AndroidFindBy(id="com.fdbr.android.debug:id/img_close")
    MobileElement btnCloseRate;

    public Assertions(){
        super();
    }

    public void waitForAgreementText(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(textAgree));
    }

    public void waitForBtnCloseRate(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(btnCloseRate));
    }

}

package com.qa.util;

import com.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assertions extends TestBase {

    WebDriverWait wait;

    public Assertions(){
        super();
    }

    public void waitForAgreementText(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/txt_agree")));
    }

    public void waitForCloseBtnAppRate(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/img_close")));
    }

}

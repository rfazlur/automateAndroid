package com.qa.util;

import com.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assertions extends TestBase {

    private WebDriverWait wait;

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

    public void waitForFieldDOB(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/fl_dob")));
    }

    public void waitForSkinTypeOptions(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/ll_skin_types")));
    }

    public void waitForSkinToneOptions(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/ll_skin_tones")));
    }

    public void waitForSkinUndertoneOptions(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/ll_skin_undertones")));
    }

    public void waitForNextButtonSkinType(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/fl_next")));
    }

    public void waitForHairTypeOptions(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/ll_hair_types")));
    }

    public void waitForColoredHairOptions(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/ll_hair_colors")));
    }

    public void waitForHijaberptions(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/ll_hijabs")));
    }

    public void waitForNextButtonHairType(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/tv_next")));
    }

    public void waitForSkinConcernOptions(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/rv_skin_concerns")));
    }

    public void waitForNextButtonSkinConcerns(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/fl_next")));
    }

    public void waitForBodyConcernOptions(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/rv_body_concerns")));
    }

    public void waitForNextButtonBodyConcerns(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/fl_next")));
    }

    public void waitForHairConcernOptions(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/rv_hair_concerns")));
    }

    public void waitForNextButtonHairConcerns(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/fl_next")));
    }

    public void waitForLocationList(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/recycler_view")));
    }

    public void waitForFieldPhoneNumber(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/met_phone_number")));
    }

    public void waitForSkipButton(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/toolbar_action_button_text")));
    }

    public void waitForStartBeautyJourneyButton(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/fl_btn")));
    }

    public void waitForListPopularProduct(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.fdbr.android.debug:id/txt_product")));
    }

    public void waitForAddReviewButton(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.fdbr.android.debug:id/ll_add_review")));
    }

    public void waitForRateBar(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.fdbr.android.debug:id/rate_overall")));
    }

    //profile assertions
    public void waitProfilePage(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.fdbr.android.debug:id/rel_editprofile")));
    }

    //edit profile assertions
    public void waitEditProfileOption(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.fdbr.android.debug:id/rel_editprofile")));
    }

    //feedback assert
    public void waitDialogFillFeedback(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/message")));
    }

}

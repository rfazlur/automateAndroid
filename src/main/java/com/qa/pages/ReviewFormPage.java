package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

public class ReviewFormPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rate_overall")
    MobileElement rateOverall;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rate_packaging")
    MobileElement ratePackaging;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_1")
    MobileElement btnPrice1;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_2")
    MobileElement btnPrice2;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_3")
    MobileElement btnPrice3;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_purchase_yes")
    MobileElement btnRepurchaseYes;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_purchase_maybe")
    MobileElement btnRepurchaseMaybe;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_purchase_no")
    MobileElement btnRepurchaseNo;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_story")
    MobileElement txtReview;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_image")
    MobileElement btnSubmit;

    public ReviewFormPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //You can use endX * 0.2 for 1 star, endX * 0.4 for 2 star, endX * 0.6 for 3 star, endX * 0.8 for 4 star, endX * 1 for 5 star.

    public void setOverallRate(String rating){
        AndroidTouchAction androidtouchaction = new AndroidTouchAction(driver);
        int startOverallX = rateOverall.getLocation().getX();
        int startOverallY = rateOverall.getLocation().getY();
        int widthOverallX = rateOverall.getSize().getWidth();
        int endOverallX = startOverallX + widthOverallX;
        int tapOverallAt;
        if(rating.equals("1")){
            tapOverallAt = startOverallX + ((int) (widthOverallX * 0.2));
        } else if(rating.equals("2")){
            tapOverallAt = startOverallX + ((int) (widthOverallX * 0.4));
        } else if(rating.equals("3")){
            tapOverallAt = startOverallX + ((int) (widthOverallX * 0.6));
        } else if(rating.equals("4")){
            tapOverallAt = startOverallX + ((int) (widthOverallX * 0.8));
        } else if(rating.equals("5")){
            tapOverallAt = startOverallX + widthOverallX;
        } else{
            return;
        }
        System.out.println("rating : "+rating+" startX : "+startOverallX+" staryY: "+startOverallY+" endX: "+endOverallX+" tapAt: "+tapOverallAt);
        androidtouchaction.press(PointOption.point(tapOverallAt, startOverallY)).release().perform();
    }

    public void setPackagingRate(String rating){
        AndroidTouchAction androidtouchaction = new AndroidTouchAction(driver);
        int startPackagingX = ratePackaging.getLocation().getX();
        int startPackagingY = ratePackaging.getLocation().getY();
        int widthPackagingX = ratePackaging.getSize().getWidth();
        int endPackagingX = startPackagingX + widthPackagingX;
        int tapPackagingAt;
        if(rating.equals("1")){
            tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.2));
        } else if(rating.equals("2")){
            tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.4));
        } else if(rating.equals("3")){
            tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.6));
        } else if(rating.equals("4")){
            tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.8));
        } else if(rating.equals("5")){
            tapPackagingAt = startPackagingX + widthPackagingX;
        } else{
            return;
        }
        System.out.println("rating : "+rating+" startX : "+startPackagingX+" staryY: "+startPackagingY+" endX: "+endPackagingX+" tapAt: "+tapPackagingAt);
        androidtouchaction.press(PointOption.point(tapPackagingAt, startPackagingY)).release().perform();
    }

    public void setPrice(String price){
        if (price.equals("1")){
            btnPrice1.click();
        } else if (price.equals("2")){
            btnPrice2.click();
        } else  if (price.equals("3")){
            btnPrice3.click();
        } else {
            System.out.println("Wrong price selected");
        }
    }

    public void setRepurchase(String repurchase){
        if (repurchase.equals("1")){
            btnRepurchaseYes.click();
        } else if (repurchase.equals("2")){
            btnRepurchaseMaybe.click();
        } else if (repurchase.equals("3")){
            btnRepurchaseNo.click();
        } else {
            System.out.println("Wrong repurchase selected");
        }
    }

    public void writeReview(String review){
        txtReview.sendKeys(review);
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }

    public void clickBtnSubmit(){
        btnSubmit.click();
    }
}

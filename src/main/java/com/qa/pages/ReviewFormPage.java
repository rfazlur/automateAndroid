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
        switch (rating) {
            case "1":
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.2));
                break;
            case "2":
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.4));
                break;
            case "3":
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.6));
                break;
            case "4":
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.8));
                break;
            case "5":
                tapOverallAt = startOverallX + widthOverallX;
                break;
            default:
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
        switch (rating) {
            case "1":
                tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.2));
                break;
            case "2":
                tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.4));
                break;
            case "3":
                tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.6));
                break;
            case "4":
                tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.8));
                break;
            case "5":
                tapPackagingAt = startPackagingX + widthPackagingX;
                break;
            default:
                return;
        }
        System.out.println("rating : "+rating+" startX : "+startPackagingX+" staryY: "+startPackagingY+" endX: "+endPackagingX+" tapAt: "+tapPackagingAt);
        androidtouchaction.press(PointOption.point(tapPackagingAt, startPackagingY)).release().perform();
    }

    public void setPrice(String price){
        switch (price) {
            case "1":
                btnPrice1.click();
                break;
            case "2":
                btnPrice2.click();
                break;
            case "3":
                btnPrice3.click();
                break;
            default:
                System.out.println("Wrong price selected");
                break;
        }
    }

    public void setRepurchase(String repurchase){
        switch (repurchase) {
            case "1":
                btnRepurchaseYes.click();
                break;
            case "2":
                btnRepurchaseMaybe.click();
                break;
            case "3":
                btnRepurchaseNo.click();
                break;
            default:
                System.out.println("Wrong repurchase selected");
                break;
        }
    }

    public void writeReview(String review){
        txtReview.sendKeys(review);
    }

    public void clickBtnSubmit(){
        btnSubmit.click();
    }
}

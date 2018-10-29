package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class EditProfilePage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_profile")
    MobileElement btnTakePicture;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_beauty_concern")
    List<MobileElement> btnUpdateBeautyConcern;

    public EditProfilePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void scrollDown(){
        Dimension dimension = driver.manage().window().getSize();
        Double screenHighStart = dimension.getHeight() * 0.5;
        Double screenHighEnd = dimension.getHeight() * 0.2;
        int scrollStart = screenHighStart.intValue();
        int scrollEnd = screenHighEnd.intValue();

        new AndroidTouchAction(driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }

    public void clickButtonTakePicture(){
        btnTakePicture.click();
    }

    public void scrollTillUpdateBeautyConcern() {
        int updateSize = btnUpdateBeautyConcern.size();
        System.out.println(updateSize);
    }

}

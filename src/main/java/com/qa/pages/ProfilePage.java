package com.qa.pages;

import com.qa.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/ll_followers")
    MobileElement btnFollowers;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/ll_following")
    MobileElement btnFollowing;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_expand_arrow")
    MobileElement btnXpandArrow;
    @AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.Tab[@index='0']")
    MobileElement btnTabPost;
    @AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.Tab[@index='1']")
    MobileElement btnTabReview;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_facebook_friend")
    MobileElement headToolbarFacebook;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_wishlist_image")
    MobileElement headToolbarWishlist;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_settings")
    MobileElement headToolbarSettting;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_beauty_points")
    MobileElement btnBeautyPoints;

    public ProfilePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickInviteFriends(){
        headToolbarFacebook.click();
    }

    public void clickToolbarWishlist(){
        headToolbarWishlist.click();
    }

    public void clickToolbarSetting(){
        headToolbarSettting.click();
    }

    public void clickFollowers(){
        btnFollowers.click();
    }

    public void clickFollowing(){
        btnFollowing.click();
    }

    public void clickBtnBeautyPoints(){
        btnBeautyPoints.click();
    }

    public void clickExpandArrow(){
        btnXpandArrow.click();
    }

    public void clickTabPost(){
        btnTabPost.click();
    }

    public void clickTabReview(){
        btnTabReview.click();
    }
}

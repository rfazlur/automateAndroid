package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;

import java.io.IOException;
import java.time.Duration;

public class editBeautyProfile extends TestBase {

    private HomePage homepage;
    private ProductCategoryPage productcategorypage;
    private Assertions assertions;
    private ProductDetailPage productdetailpage;
    private ReviewFormPage reviewformpage;
    private SignUpPage signuppage;
    private Faker faker;
    private OnBoardingPage onboardingpage;
    private DOBPage dobpage;
    private SkinPage skinpage;
    private HairPage hairpage;
    private SkinConcernsPage skinconcernspage;
    private BodyConcernsPage bodyconcernspage;
    private HairConcernsPage hairconcernspage;
    private SignUpProfilePage signupprofilepage;
    private LocationPage locationpage;
    private FindFriendPage findfriendpage;
    private LoginPage loginpage;
    private SateliteButtonPage satelitebuttonpage;
    private AddReviewChooseProductPage addreviewChooseProductpage;
    private ProfilePage profilePage;
    private SettingsPage settingsPage;

    public editBeautyProfile(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        productcategorypage = new ProductCategoryPage();
        assertions = new Assertions();
        productdetailpage = new ProductDetailPage();
        reviewformpage = new ReviewFormPage();
        assertions = new Assertions();
        signuppage = new SignUpPage();
        faker = new Faker();
        onboardingpage = new OnBoardingPage();
        dobpage = new DOBPage();
        skinpage = new SkinPage();
        hairpage = new HairPage();
        skinconcernspage = new SkinConcernsPage();
        hairconcernspage = new HairConcernsPage();
        bodyconcernspage = new BodyConcernsPage();
        signupprofilepage = new SignUpProfilePage();
        locationpage = new LocationPage();
        findfriendpage = new FindFriendPage();
        homepage = new HomePage();
        loginpage = new LoginPage();
        satelitebuttonpage = new SateliteButtonPage();
        addreviewChooseProductpage = new AddReviewChooseProductPage();
        profilePage = new ProfilePage();
        settingsPage = new SettingsPage();
        //cek
    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void editBeautyProfile() {
        assertions.waitForAgreementText();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername(prop.getProperty("username2"));
        loginpage.inputPassword(prop.getProperty("password2"));
        loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        assertions.waitForCloseBtnAppRate();
        homepage.clickBtnCloseRate();
        homepage.dismissToolTip();

        homepage.clickProfile();
        assertions.waitProfilePage();

        profilePage.clickToolbarSetting();
        assertions.waitEditProfileOption();

        settingsPage.clickEditProfile();

        settingsPage.editFullname();
        settingsPage.hideKeyboard();

        for (int i=0;i<3;i++)
        {

            TouchAction touchAction = new TouchAction(driver);
            touchAction.tap(new PointOption().withCoordinates(662, 689)).perform();

        }

        settingsPage.clickUpdateBeautyPro();
        settingsPage.setSkinType(prop.getProperty("editskintype"));
        settingsPage.setSkinTone(prop.getProperty("editskintone"));

//        settingsPage.setSkinUndertone(prop.getProperty("editskinundertone"));
        for (int i=0;i<1;i++)
        {

        TouchAction touchAction2 = new TouchAction(driver);
        touchAction2.tap(new PointOption().withCoordinates(962, 989)).perform();

        }
//        settingsPage.setHairType(prop.getProperty("edithairtype"));
//        settingsPage.setColoredHair(prop.getProperty("editcoloredhair"));
//        settingsPage.setHijaber(prop.getProperty("edithijaber"));

        settingsPage.clickSaveNewBeaProf();
        settingsPage.clickHeadToolbarSaveEditProfile();
        assertions.waitEditProfileOption();

    }
}

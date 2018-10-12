package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AddReviewTest extends TestBase {

    HomePage homepage;
    SignUpTest signuptest;
    ProductCategoryPage productcategorypage;
    Assertions assertions;
    ProductDetailPage productdetailpage;
    ReviewFormPage reviewformpage;
    SignUpPage signuppage;
    Faker faker;
    OnBoardingPage onboardingpage;
    DOBPage dobpage;
    SkinPage skinpage;
    HairPage hairpage;
    SkinConcernsPage skinconcernspage;
    BodyConcernsPage bodyconcernspage;
    HairConcernsPage hairconcernspage;
    SignUpProfilePage signupprofilepage;
    LocationPage locationpage;
    FindFriendPage findfriendpage;
    LoginPage loginpage;

    public AddReviewTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        initialization();
        signuptest = new SignUpTest();
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
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void addReviewAfterSignUp(){
        //call sign up process
        assertions.waitForAgreementText();
        onboardingpage.clickBtnSignUp();

        //register new user
        signuppage.inputEmail(faker.internet().safeEmailAddress());
        signuppage.inputUsername(faker.internet().slug());
        signuppage.inputPassword(faker.internet().password());
        signuppage.hideKeyboard();
        signuppage.tapContinueButton();

        //input DOB
        assertions.waitForFieldDOB();
        dobpage.tapDOBField();
        dobpage.tapOKButton();
        dobpage.tapNextButton();

        //set skin
        assertions.waitForSkinTypeOptions();
        skinpage.selectSkinType();
        assertions.waitForSkinToneOptions();
        skinpage.selectSkinTone();
        assertions.waitForSkinUndertoneOptions();
        skinpage.selectSkinUndertone();
        assertions.waitForNextButtonSkinType();
        skinpage.tapNextButton();

        //set hair and hijab
        assertions.waitForHairTypeOptions();
        hairpage.selectHairType();
        assertions.waitForColoredHairOptions();
        hairpage.selectColoredHair();
        assertions.waitForHijaberptions();
        hairpage.selectHijab();
        assertions.waitForNextButtonHairType();
        hairpage.tapNextButton();

        //set skin concern
        assertions.waitForSkinConcernOptions();
        skinconcernspage.selectSkinConcerns();
        assertions.waitForNextButtonSkinConcerns();
        skinconcernspage.clickBtnNext();

        //set body concern
        assertions.waitForBodyConcernOptions();
        bodyconcernspage.selectBodyConcerns();
        assertions.waitForNextButtonBodyConcerns();
        bodyconcernspage.clickBtnNext();

        //set hair concern
        assertions.waitForHairConcernOptions();
        hairconcernspage.selectHairConcerns();
        assertions.waitForNextButtonHairConcerns();
        hairconcernspage.clickBtnNext();

        //fill sign up profile
        signupprofilepage.inputFullName(faker.name().fullName());
        signupprofilepage.hideKeyboard();
        signupprofilepage.clickLocation();
        assertions.waitForLocationList();
        locationpage.selectLocation();
        assertions.waitForFieldPhoneNumber();
        signupprofilepage.inputPhoneNumber(faker.phoneNumber().cellPhone());
        //signupprofilepage.hideKeyboard();
        signupprofilepage.clickBtnNext();

        //skip find friend
        assertions.waitForSkipButton();
        findfriendpage.clickBtnSkip();
        assertions.waitForStartBeautyJourneyButton();

        //select product
        homepage.clickBtnStartJourney();
        homepage.dismissToolTip();
        homepage.clickBtnCategory();
        assertions.waitForListPopularProduct();
        productcategorypage.clickProductName();
        assertions.waitForAddReviewButton();
        productdetailpage.clickBtnAddReview();
        assertions.waitForRateBar();

        //add review
        reviewformpage.setOverallRate(prop.getProperty("overalls"));
        reviewformpage.setPackagingRate(prop.getProperty("package"));
        reviewformpage.setPrice(prop.getProperty("price"));
        reviewformpage.setRepurchase(prop.getProperty("repurchase"));
        reviewformpage.writeReview(faker.lorem().sentence(35));
        reviewformpage.hideKeyboard();
        reviewformpage.clickBtnSubmit();
    }

    @Test
    public void addReviewAfterLogin(){
        //login
        assertions.waitForAgreementText();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername(prop.getProperty("username"));
        loginpage.inputPassword(prop.getProperty("password"));
        loginpage.hideKeyboard();
        loginpage.tapBtnLogin();

        //select product
        assertions.waitForCloseBtnAppRate();
        homepage.clickBtnCloseRate();
        homepage.dismissToolTip();
        homepage.clickBtnCategory();
        assertions.waitForListPopularProduct();
        productcategorypage.clickProductName();
        assertions.waitForAddReviewButton();
        productdetailpage.clickBtnAddReview();
        assertions.waitForRateBar();

        //add review
        reviewformpage.setOverallRate(prop.getProperty("overalls"));
        reviewformpage.setPackagingRate(prop.getProperty("package"));
        reviewformpage.setPrice(prop.getProperty("price"));
        reviewformpage.setRepurchase(prop.getProperty("repurchase"));
        reviewformpage.writeReview(faker.lorem().sentence(35));
        reviewformpage.hideKeyboard();
        reviewformpage.clickBtnSubmit();
    }

}

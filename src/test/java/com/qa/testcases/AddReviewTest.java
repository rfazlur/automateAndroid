package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddReviewTest extends TestBase {

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
    private CarouselPage carouselpage;

    public AddReviewTest(){
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
        carouselpage = new CarouselPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(priority = 1)
    public void addReviewAfterSignUp(){
        //call sign up process
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        onboardingpage.clickBtnSignUp();

        //register new user
        signuppage.inputEmail(faker.internet().safeEmailAddress());
        signuppage.inputUsername(faker.internet().slug());
        signuppage.inputPassword(faker.internet().password());
        hideKeyboard();
        //signuppage.hideKeyboard();
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

    @Test(priority = 2)
    public void addReviewAfterLogin(){
        //login
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername(prop.getProperty("username"));
        loginpage.inputPassword(prop.getProperty("password"));
        hideKeyboard();
        //loginpage.hideKeyboard();
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

    @Test(priority = 3)
    public void addReviewFromPlusButtonAfterSignUp(){
        //call sign up process
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        onboardingpage.clickBtnSignUp();

        //register new user
        signuppage.inputEmail(faker.internet().safeEmailAddress());
        signuppage.inputUsername(faker.internet().slug());
        signuppage.inputPassword(faker.internet().password());
        hideKeyboard();
        //signuppage.hideKeyboard();
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
        homepage.clickBtnPlus();
        satelitebuttonpage.clickBtnReview();
        addreviewChooseProductpage.selectProduct();

        //add review
        reviewformpage.setOverallRate(prop.getProperty("overalls"));
        reviewformpage.setPackagingRate(prop.getProperty("package"));
        reviewformpage.setPrice(prop.getProperty("price"));
        reviewformpage.setRepurchase(prop.getProperty("repurchase"));
        reviewformpage.writeReview(faker.lorem().sentence(35));
        reviewformpage.hideKeyboard();
        reviewformpage.clickBtnSubmit();
    }

    @Test(priority = 4)
    public void addReviewFromPlusButtonAfterLogin(){
        //login
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername(prop.getProperty("username"));
        loginpage.inputPassword(prop.getProperty("password"));
        hideKeyboard();
        //loginpage.hideKeyboard();
        loginpage.tapBtnLogin();

        //select product
        assertions.waitForCloseBtnAppRate();
        homepage.clickBtnCloseRate();
        homepage.dismissToolTip();
        homepage.clickBtnPlus();
        satelitebuttonpage.clickBtnReview();
        addreviewChooseProductpage.selectProduct();

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

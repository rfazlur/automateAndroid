package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class SignUpTest extends TestBase {

    private Assertions assertions;
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

    public SignUpTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
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
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    /*@Test
    public void registerNewUser(){
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
        signupprofilepage.hideKeyboard();
        signupprofilepage.clickBtnNext();

        //skip find friend
        assertions.waitForSkipButton();
        findfriendpage.clickBtnSkip();
        assertions.waitForStartBeautyJourneyButton();
    }*/

    @Test
    public void registerNewUser() {
        assertions.waitForAgreementText();
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
    }

    @Test
    public void registerNewUserWithRegisteredEmail() {
        assertions.waitForAgreementText();
        onboardingpage.clickBtnSignUp();

        //register new user
        signuppage.inputEmail(prop.getProperty("email"));
        signuppage.inputUsername(faker.internet().slug());
        signuppage.inputPassword(faker.internet().password());
        hideKeyboard();
        //signuppage.hideKeyboard();
        signuppage.tapContinueButton();

        //cek message from API
    }

    @Test
    public void registerNewUserWithRegisteredUsername() {
        assertions.waitForAgreementText();
        onboardingpage.clickBtnSignUp();

        //register new user
        signuppage.inputEmail(faker.internet().safeEmailAddress());
        signuppage.inputUsername(prop.getProperty("username"));
        signuppage.inputPassword(faker.internet().password());
        hideKeyboard();
        //signuppage.hideKeyboard();
        signuppage.tapContinueButton();

        //cek message from API
    }
}

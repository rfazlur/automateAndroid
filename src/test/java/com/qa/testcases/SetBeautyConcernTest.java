package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SetBeautyConcernTest extends TestBase {

    private Assertions assertions;
    private OnBoardingPage onboardingpage;
    private SignUpPage signuppage;
    private Faker faker;
    private DOBPage dobpage;
    private SkinPage skinpage;
    private HairPage hairpage;
    private SkinConcernsPage skinconcernspage;
    private BodyConcernsPage bodyconcernspage;
    private HairConcernsPage hairconcernspage;

    public SetBeautyConcernTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        assertions = new Assertions();
        onboardingpage = new OnBoardingPage();
        signuppage = new SignUpPage();
        faker = new Faker();
        dobpage = new DOBPage();
        skinpage = new SkinPage();
        hairpage = new HairPage();
        skinconcernspage = new SkinConcernsPage();
        bodyconcernspage = new BodyConcernsPage();
        hairconcernspage = new HairConcernsPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void setSkinConcern(){
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
    }

    @Test
    public void setBodyConcern(){
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
    }

    @Test
    public void setHairConcern(){
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
    }

}

package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.DOBPage;
import com.qa.pages.OnBoardingPage;
import com.qa.pages.SignUpPage;
import com.qa.pages.SkinPage;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SignUpTest extends TestBase {

    Assertions assertions;
    SignUpPage signuppage;
    Faker faker;
    OnBoardingPage onboardingpage;
    DOBPage dobpage;
    SkinPage skinpage;

    public SignUpTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        initialization();
        assertions = new Assertions();
        signuppage = new SignUpPage();
        faker = new Faker();
        onboardingpage = new OnBoardingPage();
        dobpage = new DOBPage();
        skinpage = new SkinPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void registerNewUser(){
        assertions.waitForAgreementText();

        onboardingpage.clickBtnSignUp();

        signuppage.inputEmail(faker.internet().safeEmailAddress());
        signuppage.inputUsername(faker.internet().slug());
        signuppage.inputPassword(faker.internet().password());
        signuppage.hideKeyboard();
        signuppage.tapContinueButton();

        assertions.waitForFieldDOB();

        dobpage.tapDOBField();
        dobpage.tapOKButton();
        dobpage.tapNextButton();

        assertions.waitForSkinTypeOptions();
        skinpage.selectSkinType();
        assertions.waitForSkinToneOptions();
        skinpage.selectSkinTone();
        assertions.waitForSkinUndertoneOptions();
        skinpage.selectSkinUndertone();
        assertions.waitForNextButtonSkinType();
        skinpage.tapNextButton();
    }
}

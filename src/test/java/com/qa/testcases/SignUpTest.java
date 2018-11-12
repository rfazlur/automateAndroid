package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpTest extends TestBase {

    private Assertions assertions;
    private SignUpPage signuppage;
    private Faker faker;
    private OnBoardingPage onboardingpage;
    private CarouselPage carouselpage;

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
        carouselpage = new CarouselPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(priority = 1)
    public void registerNewUser() {
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
        signuppage.tapContinueButton();

        //input DOB
        assertions.waitForFieldDOB();
    }

    @Test(priority = 2)
    public void registerNewUserWithRegisteredEmail() {
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        onboardingpage.clickBtnSignUp();

        //register new user
        signuppage.inputEmail(prop.getProperty("email"));
        signuppage.inputUsername(faker.internet().slug());
        signuppage.inputPassword(faker.internet().password());
        hideKeyboard();
        signuppage.tapContinueButton();

        //cek message from API
    }

    @Test(priority = 3)
    public void registerNewUserWithRegisteredUsername() {
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        onboardingpage.clickBtnSignUp();

        //register new user
        signuppage.inputEmail(faker.internet().safeEmailAddress());
        signuppage.inputUsername(prop.getProperty("username"));
        signuppage.inputPassword(faker.internet().password());
        hideKeyboard();
        signuppage.tapContinueButton();

        //cek message from API
    }
}

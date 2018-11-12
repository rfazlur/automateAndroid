package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.CarouselPage;
import com.qa.pages.DOBPage;
import com.qa.pages.OnBoardingPage;
import com.qa.pages.SignUpPage;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class DOBTest extends TestBase {

    private Assertions assertions;
    private OnBoardingPage onboardingpage;
    private SignUpPage signuppage;
    private Faker faker;
    private DOBPage dobpage;
    private CarouselPage carouselpage;

    public DOBTest(){
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
        carouselpage = new CarouselPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void inputValidDOB(){
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
        dobpage.tapDOBField();
        dobpage.tapOKButton();
        dobpage.tapNextButton();

        //set skin
        assertions.waitForSkinTypeOptions();
    }

}

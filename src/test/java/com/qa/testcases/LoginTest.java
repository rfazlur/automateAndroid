package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {

    private OnBoardingPage onboardingpage;
    private LoginPage loginpage;
    private Assertions assertions;
    private HomePage homepage;
    private CarouselPage carouselpage;
    private Faker faker;

    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        onboardingpage = new OnBoardingPage();
        loginpage = new LoginPage();
        assertions = new Assertions();
        homepage = new HomePage();
        carouselpage = new CarouselPage();
        faker = new Faker();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginUsingUsername(){
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
        assertions.waitForCloseBtnAppRate();
        homepage.clickBtnCloseRate();
        homepage.dismissToolTip();
    }

    @Test
    public void loginUsingEmail(){
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        loginpage.inputUsername(prop.getProperty("email"));
        loginpage.inputPassword(prop.getProperty("password"));
        hideKeyboard();
        //loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        assertions.waitForCloseBtnAppRate();
        homepage.clickBtnCloseRate();
        homepage.dismissToolTip();
    }

    @Test
    public void loginWithWrongUsername() {
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        loginpage.inputUsername(faker.internet().slug());
        loginpage.inputPassword(prop.getProperty("password"));
        hideKeyboard();
        //loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        /*Thread.sleep(600);
        validatetoast.validateToastLoginFailed();*/
    }

    @Test
    public void loginWithWrongPassword() {
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        loginpage.inputUsername(prop.getProperty("username"));
        loginpage.inputPassword("testerlalala");
        hideKeyboard();
        //loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        /*Thread.sleep(600);
        validatetoast.validateToastLoginFailed();*/
    }

    @Test
    public void loginWithEmptyPassword() {
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForNextButtonCarousel();
        carouselpage.clickBtnNext();
        assertions.waitForGetStartedButtonCarousel();
        carouselpage.clickGetStarted();
        loginpage.inputUsername(prop.getProperty("username"));
        hideKeyboard();
        //loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
    }
}
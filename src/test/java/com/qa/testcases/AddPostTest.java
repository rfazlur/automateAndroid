package com.qa.testcases;

import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddPostTest extends TestBase {

    private Assertions assertions;
    private OnBoardingPage onboardingpage;
    private LoginPage loginpage;
    private HomePage homepage;
    private SateliteButtonPage satelitebuttonpage;
    private TakePicturePage takepicturepage;
    private AddPostFormPage addpostformpage;
    private Faker faker;

    public AddPostTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        assertions = new Assertions();
        onboardingpage = new OnBoardingPage();
        loginpage = new LoginPage();
        homepage = new HomePage();
        satelitebuttonpage = new SateliteButtonPage();
        takepicturepage = new TakePicturePage();
        addpostformpage = new AddPostFormPage();
        faker = new Faker();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void addPostAfterLoginWithoutTagProduct() {
        assertions.waitForAgreementText();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername(prop.getProperty("username"));
        loginpage.inputPassword(prop.getProperty("password"));
        hideKeyboard();
        loginpage.tapBtnLogin();
        assertions.waitForCloseBtnAppRate();
        homepage.clickBtnCloseRate();
        homepage.dismissToolTip();
        homepage.clickBtnPlus();
        satelitebuttonpage.clickBtnPost();
        /*homepage.clickBtnOKCameraPermission();
        homepage.clickBtnAllowTakePicture();*/
        /*takepicturepage.dismissToolTipTakePicture();
        takepicturepage.clickBtnTakePicture();
        takepicturepage.clickBtnAllowPermission();*/
        assertions.waitForNextButtonTakePicture();
        //takepicturepage.clickBtnNext();
        addpostformpage.inputCaption(faker.lorem().sentence(2));
    }

}

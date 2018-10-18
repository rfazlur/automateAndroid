package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginValidTest extends TestBase {

    private OnBoardingPage onboardingpage;
    private LoginPage loginpage;
    private Assertions assertions;
    private HomePage homepage;

    public LoginValidTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        onboardingpage = new OnBoardingPage();
        loginpage = new LoginPage();
        assertions = new Assertions();
        homepage = new HomePage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginUsingUsername(){
        assertions.waitForAgreementText();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername(prop.getProperty("username"));
        loginpage.inputPassword(prop.getProperty("password"));
        loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        assertions.waitForCloseBtnAppRate();
        homepage.clickBtnCloseRate();
        homepage.dismissToolTip();
    }

    @Test
    public void loginUsingEmail(){
        assertions.waitForAgreementText();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername(prop.getProperty("email"));
        loginpage.inputPassword(prop.getProperty("password"));
        loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        assertions.waitForCloseBtnAppRate();
        homepage.clickBtnCloseRate();
        homepage.dismissToolTip();
    }
}

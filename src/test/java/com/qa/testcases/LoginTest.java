package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.Assertions;
import com.qa.util.ValidateToast;
import net.sourceforge.tess4j.TesseractException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {

    private OnBoardingPage onboardingpage;
    private LoginPage loginpage;
    private Assertions assertions;
    private HomePage homepage;
    private ValidateToast validatetoast;

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
        validatetoast = new ValidateToast();
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
        hideKeyboard();
        //loginpage.hideKeyboard();
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
        hideKeyboard();
        //loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        assertions.waitForCloseBtnAppRate();
        homepage.clickBtnCloseRate();
        homepage.dismissToolTip();
    }

    @Test
    public void loginWithWrongUsername() throws TesseractException, InterruptedException {
        assertions.waitForAgreementText();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername("putwiiiiiiiiiiid");
        loginpage.inputPassword(prop.getProperty("password"));
        hideKeyboard();
        //loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        Thread.sleep(600);
        validatetoast.validateToastLoginFailed();
    }

    @Test
    public void loginWithWrongPassword() throws TesseractException, InterruptedException {
        assertions.waitForAgreementText();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername(prop.getProperty("username"));
        loginpage.inputPassword("testerlalala");
        hideKeyboard();
        //loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        Thread.sleep(600);
        validatetoast.validateToastLoginFailed();
    }

    @Test
    public void loginWithEmptyPassword() {
        assertions.waitForAgreementText();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername(prop.getProperty("username"));
        hideKeyboard();
        //loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
    }
}
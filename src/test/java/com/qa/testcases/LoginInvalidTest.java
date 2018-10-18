package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.OnBoardingPage;
import com.qa.util.Assertions;
import com.qa.util.ValidateToast;
import net.sourceforge.tess4j.TesseractException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class LoginInvalidTest extends TestBase {

    private Assertions assertions;
    private OnBoardingPage onboardingpage;
    private LoginPage loginpage;

    public LoginInvalidTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        assertions = new Assertions();
        onboardingpage = new OnBoardingPage();
        loginpage = new LoginPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginInvalid() throws TesseractException, InterruptedException {
        assertions.waitForAgreementText();
        onboardingpage.clickBtnLogin();
        loginpage.inputUsername("putwid");
        loginpage.inputPassword("putwid");
        loginpage.hideKeyboard();
        loginpage.tapBtnLogin();
        /*Thread.sleep(200);
        validatetoast.validateToastLoginFailed();*/
    }
}

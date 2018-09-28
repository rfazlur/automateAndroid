package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest extends TestBase {

    CarouselPage carouselpage;
    LoginPage loginpage;
    HomePage homepage;
    ProfilePage profilepage;
    SettingsPage settingspage;

    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        initialization();
        carouselpage = new CarouselPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginValid(){
        loginpage = carouselpage.clickBtnLogin();
        homepage = loginpage.loginProcess(
                prop.getProperty("username"),
                prop.getProperty("password"));
        homepage.clickRateCloseBtn();
        homepage.clickHomeBtn();
        profilepage = homepage.clickProfileBtn();
        settingspage = profilepage.clickSettingsBtn();
        settingspage.clickLogoutBtn();
    }

}

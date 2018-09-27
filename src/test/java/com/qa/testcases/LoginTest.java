package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.CarouselPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest extends TestBase {

    CarouselPage carouselpage;
    LoginPage loginpage;
    HomePage homepage;

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

    }

}

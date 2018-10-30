package com.qa.testcases;

import com.qa.base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class SetProfileTest extends TestBase {

    public SetProfileTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}

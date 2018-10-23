package com.qa.util;

import com.qa.base.TestBase;
import net.sourceforge.lept4j.util.LoadLibs;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateToast extends TestBase {

    public static String destDir;
    public static DateFormat dateFormat;
    public static String scrPath;

    public static void takeScreenShot() {
        // Set folder name to store screenshots.
        destDir = "screenshots";

        // Capture screenshot.
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Set date format to set It as screenshot file name.
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        // Create folder under project with name "screenshots" provided to destDir.
        new File(destDir).mkdirs();
        // Set file name using current date time.
        String destFile = dateFormat.format(new Date()) + ".png";

        try {
            // Copy paste file at destination folder location
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
            scrPath = destDir+ "/" + destFile;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public String takeScreenShot(){
        destDir = "screenshots";

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        dateFormat = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ssaa");
        new File(destDir).mkdirs();
        destFile = dateFormat.format(new Date()) + ".png";

        try{
            FileUtils.copyFile(scrFile, new File(scrShotDir + "/" + destFile));
        } catch (IOException e) {
            System.out.println("Image not transfered to screenshot folder");
            e.printStackTrace();
        }
        return destFile;

        *//*//* Set folder name to store screenshots.
        destDir = "screenshots";
        // Capture screenshot.
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Set date format to set It as screenshot file name.
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        // Create folder under project with name "screenshots" provided to destDir.
        new File(destDir).mkdirs();
        // Set file name using current date time.
        String destFile = dateFormat.format(new Date()) + ".png";

        try {
            // Copy paste file at destination folder location
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
            scrPath = destDir+ "/" + destFile;
        } catch (IOException e) {
            e.printStackTrace();
        }*//*
    }*/

    /*public String OCR() throws TesseractException {
        String imgName = takeScreenShot();
        String result = null;
        File imageFile = new File(scrShotDir, imgName);
        System.out.println("Image name is :"+imageFile.toString());
        ITesseract instance = new Tesseract();

        result = instance.doOCR(imageFile);
        System.out.println(result);
        return result;
    }*/

    public void validateToastLoginFailed() throws TesseractException, InterruptedException {
        takeScreenShot();
        /*String Text = OCR(scrPath);
        System.out.println(Text);
        Assert.assertTrue(Text.contains("That password is incorrect. Try again."), "That password is incorrect. Try again.");*/
    }

}

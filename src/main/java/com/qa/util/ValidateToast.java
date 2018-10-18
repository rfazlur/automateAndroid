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

    /*public String destDir;
    public DateFormat dateFormat;
    public String scrPath;

    public String takeScreenShot(){
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

        return destFile;
    }

    //OCR reading
    *//*public static String OCR(String ImagePath) {
        String result = null;
        File imageFile = new File(ImagePath);
        ITesseract instance = new Tesseract();
        try {
            result = instance.doOCR(imageFile);

        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }*//*

    public String readToastMessage(){
        String imgName = takeScreenShot();

    }*/

    static String scrShotDir = "screenshots";
    String destFile;

    public String takeScreenShot(){
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ssaa");
        new File(scrShotDir).mkdirs();
        destFile = dateFormat.format(new Date()) + ".png";
        try{
            FileUtils.copyFile(scrFile, new File(scrShotDir + "/" + destFile));
        } catch (IOException e) {
            System.out.println("Image not transfered to screenshot folder");
            e.printStackTrace();
        }
        return destFile;
    }

    public String readToastMessage() throws TesseractException {
        String imgName = takeScreenShot();
        String result = null;
        File imageFile = new File(scrShotDir, imgName);
        System.out.println("Image name is :"+imageFile.toString());
        ITesseract instance = new Tesseract();

        result = instance.doOCR(imageFile);
        System.out.println(result);
        return result;
    }

    public void validateToastLoginFailed() throws TesseractException {
        readToastMessage();
        /*takeScreenShot();
        String Text = OCR(scrPath);
        System.out.println(Text);
        Assert.assertTrue(Text.contains("That password is incorrect. Try again."), "That password is incorrect. Try again.");*/
    }

}

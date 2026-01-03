package com.crm.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {

    public static void takeScreenshot(WebDriver driver, String testName) {

        if (driver == null) {
            System.out.println("Driver is null, screenshot not captured");
            return;
        }

        String date = LocalDateTime.now().toString().replace(":", "-");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File from = ts.getScreenshotAs(OutputType.FILE);

        File folder = new File("\\src\\test\\resources\\FailScreenshotSelenium"+date+".png");


        if (!folder.exists()) {
            folder.mkdirs();
        }

        File to = new File(folder + "\\" + testName + "_" + date + ".png");

        try {
            FileHandler.copy(from, to);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

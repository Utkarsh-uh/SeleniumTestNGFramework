package utility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Screenshot {
	public static String captureScreenShotWithPath(WebDriver driver, String filename) throws IOException {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotDir = System.getProperty("user.dir") + "\\screenshots\\";
        File folder = new File(screenshotDir);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String path = screenshotDir + filename + "_" + timestamp + ".png";
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(path);
        FileHandler.copy(source, destination);
        return path;
    }

    public static void captureScreenShot(WebDriver driver, String filename) throws IOException {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotDir = System.getProperty("user.dir") + "\\screenshots\\";
        File folder = new File(screenshotDir);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String path = screenshotDir + filename + "_" + timestamp + ".png";
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(path);
        FileHandler.copy(source, destination);
    }
}

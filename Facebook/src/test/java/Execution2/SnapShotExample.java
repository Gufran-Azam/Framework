package Execution2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Gufran on 4/28/14.
 */
public class SnapShotExample {
    WebDriver driver = null;

    @BeforeClass
    public void setUp() throws Exception {

        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/appcenter/category/games/?ref=pf");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\Users\\Gufran\\Desktop\\screenshot.jpeg"));


        }

    @Test
    public void test() throws InterruptedException {

    }
    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}

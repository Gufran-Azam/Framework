package ExtraStuff;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Gufran on 4/27/14.
 */
public class CharacterArcade{


    WebDriver driver = null;

   // @BeforeClass
    public void setUp() throws Exception {

        driver = new FirefoxDriver();
        driver.get("http://www.characterarcade.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

   // @Test
    public void test() throws InterruptedException, IOException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='user_group']/div/div[1]/div[2]/div/a[2]")));
        driver.findElement(By.cssSelector(".login_btn")).click();
       WebElement iframe1 = driver.findElement(By.cssSelector("#surf-xdm iframe:nth-child(1)"));
        driver.switchTo().frame(iframe1);
        WebElement iframe2 = driver.findElement(By.cssSelector("#display-frame"));
        driver.switchTo().frame(iframe2);
        WebElement element1 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body")));
        driver.findElement(By.cssSelector("input#input_username")).sendKeys("Gufran");
        driver.findElement(By.cssSelector("input#input_password")).sendKeys("pnt");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\Users\\Gufran\\Desktop\\screenshot.jpeg"));
        Thread.sleep(2000);
}
   // @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

}



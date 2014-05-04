package Base;

//import org.openqa.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Gufran on 4/15/14.
 */
public class AllMethods {

    private static final String Timeouts = null;
    public WebDriver wd = null;

    @Parameters({"useSauceLabs","userName", "key", "os", "browser", "browserVersion", "url"})
    @BeforeClass
    public void setUp(boolean useSauceLabs,String userName,String key,String os, String browser,String browserVersion,
                      String url) throws Exception {

        if( useSauceLabs==true){
            setUpSauce(userName, key, os, browser, browserVersion, url);
        }
        else{
            getDriver(browser, url);
        }
    }
        //driver to run on SauceLabs
        public  void setUpSauce(String userName,String key,String os, String browser,String browserVersion,
                                String url) throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        capabilities.setCapability("version", browserVersion);
        capabilities.setCapability("platform", os);

        this.wd = new RemoteWebDriver(
            new URL("http://" + userName + ":" + key + "@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);

        wd.navigate().to(url);
        wd.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        }

    //driver to run on local
    public WebDriver getDriver(String browser, String url) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:/Users/Gufran/Desktop/Documents/PeoplenTech Documents/Class Notes(03-29-14) on Selenium-JAVA/chromedriver.exe");
            wd = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("safari")){
            wd= new SafariDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            wd = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("internetexplorer")){
            System.setProperty("webdriver.ie.driver", "C:/Users/Gufran/Desktop/Documents/PeoplenTech Documents/Class Notes(03-29-14) on Selenium-JAVA/IEDriverServer.exe");
            wd = new InternetExplorerDriver();
        }

        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.navigate().to(url);
        wd.manage().window().maximize();
        return wd;
    }

    @AfterClass
    //sleep
//    public void sleep(int seconds) throws InterruptedException{
//        Thread.sleep(seconds * 1000);
//    }

    //UTILITY Methods for WebDriver
    public void navigateBack(){
        wd.navigate().back();
    }
    // clicking features
    public void ClickOnId(String locator) {
        wd.findElement(By.id(locator)).click();

    }

    public void ClickByCss(String locator){
        wd.findElement(By.cssSelector(locator)).click();
    }
    //Type features or Input features
    public void typeByCss(String locator, String value){
        wd.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    //get WebElements
    public WebElement getWebElementByCss(String locator){
        WebElement element =wd.findElement(By.cssSelector(locator));
        return element;
    }

    public List<WebElement> getWebElementsByCss(String locator1, String locator2){
        List<WebElement> elementList = wd.findElement(By.cssSelector(locator1)).findElements(By.cssSelector(locator2));
        return elementList;
    }


    public String getElementText(String locator){
        String st = getWebElementByCss(locator).getText();
        return st;
    }
    //get text using WebElements
    public List<String> getListOfString(String locator1, String locator2){
        List<WebElement> elementList = getWebElementsByCss(locator1,locator2);
        List<String> list = new ArrayList<String>();
        for(WebElement element: elementList){
            list.add(element.getText());

        }
        return list;
    }

    //Alert Handlings
    public void okAlert(){
        Alert alert = wd.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert(){
        Alert alert = wd.switchTo().alert();
        alert.dismiss();
    }

    //iframe handling
    public void iFrameHandling(WebElement element){
         wd.switchTo().frame(element);
    }
    //Link Test
    public void getLinks(String locator){
        wd.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }
    //Mouse Hover
    public void mouseHover(String locator ){
        WebElement element = wd.findElement(By.cssSelector(locator));
        Actions build = new Actions(wd);
        Actions hover = build.moveToElement(element);
        hover.perform();
    }
    //Mouse Hover;move to the element that reveals the others, then during
    // the same chain, move to the now revealed element and click on it.
    public void mouseHover2(String locator1, String locator2){
        Actions action = new Actions(wd);
        WebElement element = wd.findElement(By.cssSelector(locator1));
        action.moveToElement(element).moveToElement(wd.findElement(By.cssSelector(locator2))).click().build().perform();
    }
    //Synchronization
    public void waitUntilClickable(By locator){
        WebDriverWait wait = new WebDriverWait(wd, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
    public void waitUntilSelected(By locator){
        WebDriverWait wait = new WebDriverWait(wd, 10);
        Boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
    public void waitUntilVisible(By locator){
        WebDriverWait wait = new WebDriverWait(wd, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    //Upload a file/image
    public void upload(String locator, String filePath){
        WebElement element = wd.findElement(By.cssSelector(locator));
        element.sendKeys(filePath);
    }
    //Select Option
    public void selectElementByOption(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
     public void ScreenShot() throws IOException {
    File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
    // Now you can do whatever you need to do with it, for example copy somewhere
    FileUtils.copyFile(scrFile, new File("C:\\Users\\Gufran\\Desktop\\screenshot.jpeg"));
}

    @AfterClass
    public void tearDown() throws Exception {
        wd.quit();
    }
    }



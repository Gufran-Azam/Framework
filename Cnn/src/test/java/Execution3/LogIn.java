package Execution3;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Gufran on 4/15/14.
 */
public class LogIn extends AllMethods {

    @Test
    //This is Login to a separate window:
    public void test() throws IOException {
        waitUntilVisible(By.xpath("//*[@id=\"cnnMainPage\"]"));
        waitUntilClickable(By.xpath("//*[@id=\"hdr-auth\"]/ul/li[2]/a"));
        Set<String> window = wd.getWindowHandles();
        Iterator it = window.iterator();
        String homewindow = wd.getWindowHandle();
        wd.findElement(By.xpath("//*[@id=\"hdr-auth\"]/ul/li[2]/a")).click();
     //   wd.findElement(By.xpath(".//*[@id='hdr-auth']/ul/li[2]/a")).click();
        window = wd.getWindowHandles();
        it = window.iterator();
        String popUpWindow = (String) it.next();
        wd.switchTo().window(popUpWindow);
        wd.findElement(By.cssSelector(".cnnOvrlyBtn.cnnBtnLogIn")).click();
        window = wd.getWindowHandles();
        it = window.iterator();
        String popUpWindow2 = (String) it.next();
        wd.switchTo().window(popUpWindow2);
        typeByCss("input#cnnOverlayEmail1l","gufran.azam1992@gmail.com");
        typeByCss("input#cnnOverlayPwd","Mycnn786");
        ScreenShot();
        wd.findElement(By.cssSelector(".cnnOvrlyBtn.cnnBtnLogIn")).click();
        wd.switchTo().window(homewindow);
        waitUntilVisible(By.xpath("//*[@id=\"cnnMainPage\"]"));
        String string1 = "INTERNATIONAL";
        String string2 = wd.findElement(By.xpath("//*[@id=\"cnn_switchEdition_intl\"]")).getText();
        Assert.assertEquals(string1, string2);

        //wd.findElement(By.cssSelector(".no-border.no-pad-right li"));
        //.findElement(By.linkText("Log out"));


        //("javascript:Member.fullLogout();"));
        //findElement(By.cssSelector(".no-border no-pad-right")).

        //wd.findElement(By.xpath(".//*[@id='hdr-auth']/ul/li[2]/a")).click();

    }
}

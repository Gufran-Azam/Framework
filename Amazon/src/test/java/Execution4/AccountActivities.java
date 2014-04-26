package Execution4;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Gufran on 4/15/14.
 */
public class AccountActivities extends AllMethods {

    @Test
    //Click one by one on Top News Links in US tab
    public void test() throws InterruptedException {


          Thread.sleep(3000);
        mouseHover("#nav-signin-text");
     //  Thread.sleep(200110);
        waitUntilVisible(By.cssSelector(".nav-action-inner.nav-sprite"));
       ClickByCss(".nav-action-inner.nav-sprite");
        Thread.sleep(2000);
        typeByCss("input#ap_email", "Gufy4U92@yahoo.com");
        typeByCss("input#ap_password","BANKING");
        ClickByCss("#signInSubmit-input");
        Thread.sleep(5000);
        wd.findElement(By.xpath("//*[@id=\"nav-your-account\"]/span[2]/span")).click();
        wd.findElement(By.linkText("Your Account")).click();
        //wd.findElement(By.xpath("//*[@id='signInSubmit-input']")).click();
        //wd.findElement(By.xpath("//*[@id=\"nav-your-account\"]")).click();
        wd.findElement(By.xpath(" //*[@id=\"cs-acc-contain\"]/div[2]/div[1]/div[1]/div[2]/div[3]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"nav-your-account\"]/span[2]/span")).click();
        wd.findElement(By.xpath("//*[@id=\'nav-item-signout\']")).click();
        Thread.sleep(2000);
        wd.navigate().to("http://www.google.com");



}
}

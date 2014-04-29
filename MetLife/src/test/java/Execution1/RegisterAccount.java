package Execution1;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Gufran on 4/25/14.
 */
public class RegisterAccount extends AllMethods {


    @Test
    public void test() throws InterruptedException {

     waitUntilVisible(By.cssSelector(".registerLink"));
     ClickByCss(".registerLink");
        WebElement iframe = wd.findElement(By.cssSelector(".dijitDialogPaneContent iframe:nth-child(1)"));
        wd.switchTo().frame(iframe);
        waitUntilVisible(By.xpath("html/body"));
   //  typeByCss("#firstName", "Gufran");
        //iFrameHandling();
        typeByCss("input#firstName", "Gufran");
        typeByCss("input#lastName", "Azam");
        typeByCss("input#email", "Gufy4U92@yahoo.com");
        ClickByCss("#group");
        typeByCss("input#company","PNT");
        Thread.sleep(2000);
        System.out.println(wd.findElement(By.cssSelector(".helpLink>div")).getText());//Text/Message is displayed in the console
        ClickByCss("#dijit_form_Button_3_label");
        Thread.sleep(2000);
        ClickByCss("#dijit_form_Button_2_label");
        Thread.sleep(4000);
        ClickByCss("#dijit_form_Button_1_label");
        wd.switchTo().defaultContent();

    }

}

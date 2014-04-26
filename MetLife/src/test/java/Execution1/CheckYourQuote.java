package Execution1;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Gufran on 4/25/14.
 */
public class CheckYourQuote extends AllMethods {
    @Test
    public void test() throws InterruptedException {


      //typeByCss("select#state1-mmquote","New York");
        WebElement element = getWebElementByCss("#mm-box-stdob-innercontent tbody tr td:nth-child(1) select");
        selectElementByOption(element , "New York");
        typeByCss("select#month-mmquote", "9");
        typeByCss("select#day-mmquote","23");
        typeByCss("select#year-mmquote","1992");
        typeByCss("select#gender-mmquote","Male");
        typeByCss("select#coverage-mmquote","$100,000");
        Thread.sleep(2000);
        typeByCss("select#term-mmquote","10 years");
        typeByCss("select#tobacco-mmquote","Yes");
        typeByCss("select#health-mmquote","Excellent: I could be a professional athlete");
        Thread.sleep(3000);
        ClickByCss("#submitBtnImage");
        Thread.sleep(2000);
        navigateBack();
        waitUntilVisible(By.xpath("/html/body"));
        //upload();

    }
}

package Execution2;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Gufran on 4/15/14.
 */
public class FindGames extends AllMethods {
    @Test
    //This is Login to a separate window:
    public void test() throws InterruptedException {

        Thread.sleep(2000);
        //wd.findElement(By.xpath("//*[@id=\"Find a Dentist\"]/a")).click();
       wd.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[2]/table/tbody/tr[1]/td[8]")).click();
       wd.findElement(By.xpath("//*[@id=\"navItem_actiongames\"]/a")).click();
        Thread.sleep(2000);
//     typeByCss("input#q_ff.DOMControl_placeholder","Ali Shah");
       wd.findElement(By.xpath("//*[@id=\"appcenter_apps_list_see_all\"]/div[1]/ul/li[1]/div/div/div/div[1]/div[1]/span/a")).click();
        Thread.sleep(2000);
       // wd.findElement(By.cssSelector("a[href=
       //wd.findElement(By.xpath("//*[@id=\"contentArea\"]/div[1]/div[1]/div[2]/div/div[4]/div[1]/a")).click();
       navigateBack();
        Thread.sleep(3000);

        List<WebElement> LinkTab = getWebElementsByCss("#sideNav", "li");
        System.out.println(LinkTab.size());
        for(int i=1;i<LinkTab.size()-6;i++){

            LinkTab.get(i).findElement(By.tagName("a")).click();
            Thread.sleep(2000);
//            navigateBack();
//            Thread.sleep(2000);

            LinkTab = getWebElementsByCss("#sideNav", "li");//Refetch to store the item in the DOM or to make the item fresh

        }
    }
}


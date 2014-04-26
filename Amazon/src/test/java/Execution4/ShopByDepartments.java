package Execution4;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Gufran on 4/25/14.
 */
public class ShopByDepartments extends AllMethods {
    @Test
    public void test() throws InterruptedException {

        waitUntilVisible(By.xpath("/html/body"));
        mouseHover("#nav-shop-all-button");
        mouseHover("#nav_cat_0");
        List<WebElement> LinkTab = getWebElementsByCss(".nav_browse_ul.nav_browse_cat_ul", "li");
        System.out.println(LinkTab.size());
        for(int i=1;i<LinkTab.size();i++){
            if(i==4){
                Thread.sleep(6000);
                mouseHover("#nav-shop-all-button");
                Thread.sleep(2000);
                mouseHover("#nav_cat_0");
                LinkTab.get(i).findElement(By.tagName("a")).click();
                typeByCss("input#ap_email", "Gufy4U92@yahoo.com");
                typeByCss("input#ap_password","BANKING");
                ClickByCss("#signInSubmit-input");
                wd.navigate().to("http://www.amazon.com");
                Thread.sleep(2000);
                LinkTab = getWebElementsByCss(".nav_browse_ul.nav_browse_cat_ul", "li");//Refetch to store the item in the DOM or to make the item fresh


            }else{

            waitUntilVisible(By.xpath("/html/body"));
            mouseHover("#nav-shop-all-button");
            Thread.sleep(1000);
            mouseHover("#nav_cat_0");
            Thread.sleep(1000);
            LinkTab.get(i).findElement(By.tagName("a")).click();
            waitUntilVisible(By.xpath("/html/body"));
            LinkTab = getWebElementsByCss(".nav_browse_ul.nav_browse_cat_ul", "li");//Refetch to store the item in the DOM or to make the item fresh

            }
        }
        wd.findElement(By.xpath("//*[@id=\"nav-your-account\"]/span[2]/span")).click();
        wd.findElement(By.xpath("//*[@id=\'nav-item-signout\']")).click();
        wd.navigate().to("http://www.amazon.com");

    }
}

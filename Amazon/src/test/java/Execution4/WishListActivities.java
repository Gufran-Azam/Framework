package Execution4;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Gufran on 4/15/14.
 */
public class WishListActivities extends AllMethods {

    @Test
    public void test() throws InterruptedException {

        Thread.sleep(2000);
        mouseHover("#nav-wishlist");
        List<WebElement> LinkTab = getWebElementsByCss("#nav_wishlist_flyout", "li");
        System.out.println(LinkTab.size());
        for(int i=0;i<LinkTab.size();i++){

            mouseHover("#nav-wishlist");
            Thread.sleep(1000);
            LinkTab.get(i).findElement(By.tagName("a")).click();
            Thread.sleep(2000);
            navigateBack();
            Thread.sleep(2000);
            LinkTab = getWebElementsByCss("#nav_wishlist_flyout", "li");//Refetch to store the item in the DOM or to make the item fresh

    }
    }
}





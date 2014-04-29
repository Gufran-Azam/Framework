package Execution3;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by Gufran on 4/15/14.
 */
public class TopUsStories extends AllMethods {


    @Test
    //Click one by one on Top News Links in US tab
    public void test() throws InterruptedException, IOException {
        ClickOnId("nav-us");
        ScreenShot();
        List<WebElement> LinkTab = getWebElementsByCss("#cnn_mtt1rgtarea .cnn_bulletbin", "li");
        System.out.println(LinkTab.size());
        for(int i=0;i<LinkTab.size();i++){

            LinkTab.get(i).findElement(By.tagName("a")).click();
            Thread.sleep(4000);
            navigateBack();
            Thread.sleep(2000);
            LinkTab = getWebElementsByCss("#cnn_mtt1rgtarea .cnn_bulletbin", "li");//Refetch to store the item in the DOM or to make the item fresh

        }
    }
}

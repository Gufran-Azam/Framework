package Execution4;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Gufran on 4/26/14.
 */
public class MoreItemsToExplore extends AllMethods {

    @Test
    public void test() throws InterruptedException {

    List<WebElement> LinkTab = getWebElementsByCss(".s9OtherItems div", "div");
    System.out.println(LinkTab.size());
    for(int i=2;i<LinkTab.size();i++){

        LinkTab.get(i).findElement(By.cssSelector(".fluid .inner .s9hl a")).click();
        Thread.sleep(2000);
        navigateBack();
        Thread.sleep(2000);
        LinkTab = getWebElementsByCss(".s9OtherItems div", "div");//Refetch to store the item in the DOM or to make the item fresh

    }
}

}

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

    List<WebElement> LinkTab = wd.findElements(By.cssSelector("div.s9OtherItems .fluid .inner .s9h1"));
    System.out.println(LinkTab.size());
    for(int i=0;i<LinkTab.size();i++){

        LinkTab.get(i).findElement(By.cssSelector("a")).click();
        Thread.sleep(2000);
        navigateBack();
        Thread.sleep(2000);
        LinkTab = wd.findElements(By.cssSelector("div.s9OtherItems div.fluid div.inner div.s9h1"));//Refetch to store the item in the DOM or to make the item fresh

    }
}

}

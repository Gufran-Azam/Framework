package Execution4;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Gufran on 4/24/14.
 */
public class MiddleNavigationTabs extends AllMethods {


    @Test
    public void test() throws InterruptedException {

        Thread.sleep(2000);
        System.out.println(wd.findElement(By.cssSelector(".gwcswNavWrap tbody tr td:nth-child(2)")).getText());
   //List<WebElement> LinkTab = wd.findElements(By.cssSelector(".gwcswNavWrap tbody tr td "));

    for(int i=1;i<9;i++){

        wd.findElement(By.cssSelector(".gwcswNavWrap tbody tr td:nth-child(" + i + ")")).click();
        Thread.sleep(1000);
        System.out.println(wd.findElement(By.cssSelector(".gwcswNavWrap tbody tr td:nth-child(" + i + ")")).getText());
    }
}
}


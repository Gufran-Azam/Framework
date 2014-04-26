package Execution4;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Gufran on 4/15/14.
 */
public class MediaTabs extends AllMethods {

    @Test
    //Click one by one on Tabs:
    public void test() throws InterruptedException {
        wd.findElement(By.xpath("//*[@id=\"nav-cross-shop-links\"]/a[2]")).click();
        wd.findElement(By.xpath("//*[@id=\"nav-cross-shop-links\"]/a[3]")).click();
        wd.findElement(By.xpath("//*[@id=\"nav-cross-shop-links\"]/a[4]")).click();
        wd.findElement(By.linkText("Help")).click();

    }
}





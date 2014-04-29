package Execution4;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Gufran on 4/26/14.
 */
public class ExploreDepartments extends AllMethods {

    @Test
    public void test() throws InterruptedException {

        waitUntilVisible(By.xpath("/html/body"));
        mouseHover("#nav-shop-all-button");
        for(int i=1;i<18;i++){

                mouseHover("#nav_cats li:nth-child(" + i + "");
                Thread.sleep(1000);

            }
     ClickByCss("#nav_cat_16");
}
}

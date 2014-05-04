package Execution4;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Gufran on 5/1/14.
 */
public class AllDepartmentsOptions extends AllMethods {

    @Test
    public void test() throws InterruptedException {

        waitUntilVisible(By.xpath("/html/body"));
        mouseHover("#nav-shop-all-button");
        for(int i=1;i<18;i++){
            for(int j=1;j<5;j++){
                mouseHover2(("#nav_cats li:nth-child(" + i + ""),(".nav_browse_ul.nav_browse_cat_ul li:nth-child(" + j + ""));
              // ClickByCss(".nav_browse_ul.nav_browse_cat_ul li:nth-child(" + j + "");
                Thread.sleep(1000);
               // mouseHover(".nav_browse_ul.nav_browse_cat_ul li:nth-child(" + j + "");
            }
            }


//            mouseHover((".nav_browse_ul.nav_browse_cat_ul:nth-child(" + i + ")"));
//            for(int j=2;j<5;j++){
////                mouseHover("#nav-shop-all-button");
//                mouseHover(".nav_browse_ul.nav_browse_cat_ul li:nth-child(" + j + ")");
//            }

        }

}


package Execution2;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Gufran on 4/15/14.
 */
public class FindFriends extends AllMethods {

    @Test

    public void test() throws InterruptedException {
        Thread.sleep(2000);
       wd.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[2]/table/tbody/tr[1]/td[2]/a")).click();
        typeByCss("input#q_ff.DOMControl_placeholder","Ali Shah");
        //wd.findElement(By.xpath("//*[@id=\"findfriends_search\"]/label/span")).click();
        Thread.sleep(2000);
        //wd.findElement(By.xpath("//*[@id=\"pagelet_search_results\"]/div[1]/div[1]/div/div/div/div[1]/a")).click();
      // wd.findElement(By.linkText("Ali")).click();
}
}

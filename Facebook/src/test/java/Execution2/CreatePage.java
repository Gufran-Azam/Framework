package Execution2;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by Gufran on 4/15/14.
 */
public class CreatePage extends AllMethods {

    @Test

    public void test() throws InterruptedException {
        Thread.sleep(2000);
         wd.findElement(By.id("reg_pages_msg")).findElement(By.tagName("a")).click();

        Set<String> window = wd.getWindowHandles();
        Iterator it = window.iterator();
        String homewindow = wd.getWindowHandle();
        wd.findElement(By.xpath("//*[@id=\"product\"]/div/div[1]")).click();
        window = wd.getWindowHandles();
        it = window.iterator();
        String popUpWindow = (String) it.next();
        wd.switchTo().window(popUpWindow);
        wd.findElement(By.xpath("//*[@id=\"pop_content\"]/div[1]/div[3]/div[1]/label/input")).click();
        window = wd.getWindowHandles();
        it = window.iterator();
        String popUpWindow2 = (String) it.next();
        wd.switchTo().window(popUpWindow2);

    }

}

package Execution2;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Gufran on 4/27/14.
 */
public class ButtomNavTabs extends AllMethods {
    @Test

    public void test() throws InterruptedException {

        Thread.sleep(2000);
        System.out.println(wd.findElement(By.cssSelector("#pageFooter tbody tr td:nth-child(2)")).getText());

        for(int i=1;i<10;i++){

            wd.findElement(By.cssSelector("#pageFooter tbody tr td:nth-child(" + i + ")")).click();
            Thread.sleep(2000);
            navigateBack();
            Thread.sleep(3000);
            System.out.println(wd.findElement(By.cssSelector("#pageFooter tbody tr td:nth-child(" + i + ")")).getText());

        }
  }
}

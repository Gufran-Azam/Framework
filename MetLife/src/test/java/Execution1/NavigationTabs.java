package Execution1;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Gufran on 4/15/14.
 */
public class NavigationTabs extends AllMethods {

    @Test
    //Click one by one on Tabs:
    public void test() throws InterruptedException {
        List<WebElement> navTab = getWebElementsByCss("#hdMenuDiv" , "li");

        for(int i=0;i<navTab.size();i++){
            if(i==i){
                navTab.get(i).findElement(By.tagName("a")).click();
              // navigateBack();
            }
            else{
                navTab.get(i).findElement(By.tagName("a")).click();
                //navigateBack();

            }
            navTab = getWebElementsByCss("#hdMenuDiv" , "li"); //Refetch to store the item in the DOM or to make the item fresh

        }

    }

}


package Execution3;

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
    List<WebElement> navTab = getWebElementsByCss("#cnn_hdr-nav" , "li");

    for(int i=0;i<navTab.size()-1;i++){
        if(i==1 || i==2 || i==13 || i==14 || i==15){
            navTab.get(i).findElement(By.tagName("a")).click();
            navigateBack();
        }
        else{
            navTab.get(i).findElement(By.tagName("a")).click();
            //navigateBack();

        }
        navTab = getWebElementsByCss("#cnn_hdr-nav", "li"); //Refetch to store the item in the DOM or to make the item fresh

    }
    }
}

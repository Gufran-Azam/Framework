package Execution1;

import Base.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Gufran on 4/15/14.
 */
public class SearchString extends AllMethods {


    @Test
    //Click one by one on Tabs:
    public void test() throws InterruptedException {

    typeByCss("input#form-refineSearchQuery.hdinputsearch_gsa_front", "Low Insurance");
    wd.findElement(By.cssSelector(".hdButtonSearchDiv")).click();
    wd.findElement(By.cssSelector("input#form-andOnRadioN")).click();
    wd.findElement(By.xpath("//*[@id=\"layoutThrClmInrContent\"]/div[2]/b[1]/a")).click();
        Thread.sleep(2000);


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

        wd.findElement(By.cssSelector("#hdLogo")).findElement(By.tagName("a")).click();
       Thread.sleep(1000);

    }
}


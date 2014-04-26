package Execution3;

import Base.AllMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Gufran on 4/15/14.
 */
public class DropDown extends AllMethods {

    @Test
    //Select DropDown Menu options:
    public void test() throws InterruptedException{
        List<WebElement> dropDown;
        dropDown = getWebElementsByCss(".cnn_tsbnav.cnn_pmtvmodddown", "option");
        WebElement element = getWebElementByCss(".cnn_tsbnav.cnn_pmtvmodddown select");
        List<String> listOfMenutext = getListOfString(".cnn_tsbnav.cnn_pmtvmodddown", " select option");
        System.out.println(dropDown.size());
        for(int l=0;l<listOfMenutext.size();l++){
            if(l==1 || l==3 || l==14 || l==24 || l==29){
                continue;

            }else{

                selectElementByOption(element, listOfMenutext.get(l));

            }
            navigateBack();
            element = getWebElementByCss(".cnn_tsbnav.cnn_pmtvmodddown select"); // Refetch to store the item in the DOM(=document object model) or to make the item fresh

        }
    }

    public void selectElementByOption(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);





    }
}


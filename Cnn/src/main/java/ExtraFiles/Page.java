package ExtraFiles;

import Base.AllMethods;

import java.util.List;

/**
 * Created by Gufran on 4/21/14.
 */
public class Page extends AllMethods {
   

    public final static String us = "#nav-us";
    public final static String world = "#nav-world";
    public final static String politics = "#nav-politics";
    public final static String justice = "#nav-justice";
    public final static String entertainment = "#nav-entertainment";
    public final static String tech = "#nav-tech";
    public final static String health= "#nav-health";
    public final static String living = "#nav-living";
    public final static String travel = "#nav-travel";
    public final static String opinion = "#nav-opinion";
    public final static String money = "#nav-money";

    public  void goToWorld(){
        ClickByCss(world);
    }
    public void goToPolitics(){
        ClickByCss(politics);
    }
    public void goToJustice(){
        ClickByCss(justice);
    }
    public void goToTech(){
        ClickByCss(tech);
    }
    public void goToHealth(){
        ClickByCss(health);
    }
    public void goToLiving(){
        ClickByCss(living);
    }
    public void goToTravel(){
        ClickByCss(travel);
    }
    public void goToMoney(){
        ClickByCss(money);
    }
    public void clickOnNews(String locator1, String locator2){
        List<String> news = getListOfString(locator1, locator2);
        for(String st:news){
            System.out.println(st);
        }
    }
  }

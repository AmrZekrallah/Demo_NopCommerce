package org.example.pages_PomDesign;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

public class P03_homePage {

    public List<WebElement> sign (){
        List<WebElement> count =Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price]\"]"));
        return count;

    }
    public WebElement Euro (){
        return Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));

    }

}


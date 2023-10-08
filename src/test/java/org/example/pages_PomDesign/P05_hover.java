package org.example.pages_PomDesign;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_hover {
   public WebElement HoverToCat(){
        return Hooks.driver.findElement(By.xpath("//parent::li//parent::ul//parent::div//a[@href=\"/computers\"]"));
    }
    public WebElement SelectCat(){
       return Hooks.driver.findElement(By.xpath("//parent::li//a[@href=\"/notebooks\"]"));
    }
    public WebElement PickProduct(){
       return Hooks.driver.findElement(By.xpath("//parent::a//parent::div//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]"));
    }
    public WebElement AssertApple(){
       return Hooks.driver.findElement(By.xpath("//parent::div//parent::div//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]"));
    }
}

package org.example.pages_PomDesign;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_homePage {
    public WebElement ProductSearch(){
        return Hooks.driver.findElement(By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]"));
    }
    public WebElement ClickSearchButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public WebElement SearchBySku(){
        return Hooks.driver.findElement(By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]"));

    }
    public WebElement ClickForSku(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"product-item\"]"));
    }
    public WebElement AssertForSKU(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]"));
    }

}

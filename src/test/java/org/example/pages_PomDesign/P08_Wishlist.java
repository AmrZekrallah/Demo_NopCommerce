package org.example.pages_PomDesign;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_Wishlist {
    public WebElement GetProduct(){
        return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000041_htc-one-m8-android-l-50-lollipop_415.jpeg\"]"));
    }
    public WebElement SearchBar(){
        return Hooks.driver.findElement(By.cssSelector("button[id=\"add-to-wishlist-button-18\"]"));
    }
    public WebElement AssertMessage(){
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
    public WebElement AssertColor(){
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
    public WebElement MessegeRemove(){
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
    public WebElement ClickForWishlist(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }
    public WebElement AssertValue(){
        return Hooks.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }
}

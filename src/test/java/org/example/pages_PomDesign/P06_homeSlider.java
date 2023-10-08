package org.example.pages_PomDesign;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_homeSlider {
    public WebElement ClickForSamsung(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"] [data-thumb=\"https://demo.nopcommerce.com/images/thumbs/0000089_banner_02.webp\"]"));
    }
    public WebElement ClickForIphone(){
        return Hooks.driver.findElement(By.cssSelector("img[data-thumb=\"https://demo.nopcommerce.com/images/thumbs/0000088_banner_01.webp\"]"));
    }
}

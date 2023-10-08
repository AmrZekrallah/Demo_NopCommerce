package org.example.pages_PomDesign;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;

public class P07_followUs {
    public WebElement ClickFacebook (){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public WebElement ClickTwitter(){
        return Hooks.driver.findElement(By.xpath("//parent::li//a[@href=\"https://twitter.com/nopCommerce\"]"));
    }
    public WebElement ClickRss(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }
    public WebElement ClickYouTube(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
}

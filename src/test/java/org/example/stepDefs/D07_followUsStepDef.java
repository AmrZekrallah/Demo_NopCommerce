package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages_PomDesign.P07_followUs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v115.indexeddb.model.Key;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef {
    P07_followUs NopFollow=new P07_followUs();

    @Given("user opens the website URL for facebook")
    public void UserOpenFacebook(){
        NopFollow.ClickFacebook().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }
    @Then("user switch between tabs")
    public void UserSwitchAndAssert() throws InterruptedException{
        ArrayList <String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        System.out.println("tab 1:"+Hooks.driver.getCurrentUrl());
        String TrueFacebook = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(TrueFacebook,"https://www.facebook.com/nopCommerce");
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        System.out.println("tab 0 :"+Hooks.driver.getCurrentUrl());

    }
    @Given("user opens the website URL for twitter")
    public void UserOpenTwitter(){
        NopFollow.ClickTwitter().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }
    @Then("user can switch between tabs")
    public void UserSwitchTabs()throws InterruptedException{
        ArrayList <String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        System.out.println("tab 1:"+Hooks.driver.getCurrentUrl());
        String TrueTwitter = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(TrueTwitter,"https://twitter.com/nopCommerce");
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        System.out.println("tab 0 :"+Hooks.driver.getCurrentUrl());

    }
    @Given("user opens the website URL for Rss")
    public void UserOpenRss(){
        NopFollow.ClickRss().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Hooks.driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @Then("user switch between Rss tabs")
    public void UserBackToNope()throws InterruptedException{
        ArrayList <String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        System.out.println("tab 1:"+Hooks.driver.getCurrentUrl());
        String TrueRss = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(TrueRss,"https://demo.nopcommerce.com/news/rss/1");
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        System.out.println("tab 0 :"+Hooks.driver.getCurrentUrl());



    }



    @Given("user opens the website URL for youtube")
    public void UserOpenYoutube(){
        NopFollow.ClickYouTube().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Hooks.driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

    }


    @Then("user switch between youtube and original tab")
    public void UserBackToNop()throws InterruptedException{
        ArrayList <String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Hooks.driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        Thread.sleep(2000);
        System.out.println("tab 1:"+Hooks.driver.getCurrentUrl());
        String TrueYoutube = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(TrueYoutube,"https://www.youtube.com/user/nopCommerce");
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        System.out.println("tab 0 :"+Hooks.driver.getCurrentUrl());


    }
}

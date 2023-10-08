package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.example.pages_PomDesign.P06_homeSlider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef {
    SoftAssert Soft= new SoftAssert();

    P06_homeSlider NopeSlider = new P06_homeSlider();


    @Given("user opens url for samsung mobile slide")
    public void NavigateTourl(){
        WebElement Samsung = NopeSlider.ClickForSamsung();
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("arguments[0].click();",Samsung);

      }


    @Then("user cant open the main url needed for nokia mobile")
    public void Assert_Nokia(){
        String ActualNokia=Hooks.driver.getCurrentUrl();
        Soft.assertEquals(ActualNokia,"https://demo.nopcommerce.com/nokia-lumia-1020","NotNokia");
        Soft.assertAll();
        System.out.println(ActualNokia);
    }
    @Given("user opens url for iphone mobile slide")
    public void OpenURL(){
        WebElement Iphone = NopeSlider.ClickForIphone();
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("arguments[0].click();",Iphone);
    }
    @Then("user cant open the main url needed for iphone")
    public void Assert_iPhone(){
        String ActualIphone=Hooks.driver.getCurrentUrl();
        Soft.assertEquals(ActualIphone,"https://demo.nopcommerce.com/iphone-6","Notiphone");
        Soft.assertAll();
        System.out.println(ActualIphone);


    }

}

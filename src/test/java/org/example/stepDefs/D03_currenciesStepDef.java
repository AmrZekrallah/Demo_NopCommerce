package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages_PomDesign.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage sign = new P03_homePage();
    @Given("user change to euro from the downlist")
    public void UserChangedollarToeuro(){
        WebElement Downlist = sign.Euro();
        Select Pick = new Select(Downlist);
        Pick.selectByVisibleText("Euro");
    }
   @When("user Scroll down the website")
   public void Scroll_down (){
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1300)", "");
    }

    @Then("user Assert all products")
    public void Assert_products(){
        int count= sign.sign().size();
        for (int i=0;i<count;i++) {

            sign.sign().get(i).getText();
            Assert.assertTrue(sign.sign().contains("€"));
        }

        }



}


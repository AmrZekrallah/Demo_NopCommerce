package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages_PomDesign.P04_search;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    SoftAssert Soft = new SoftAssert();
    P04_search NopSearch = new P04_search();

    @Given("user search for product by name {string}")
    public void UserSearchForProducts(String productname){
       NopSearch.ProductSearch().sendKeys(productname);
    }

    @When("user click on search button")
    public void userclickonsearch(){
        NopSearch.ClickSearchButton().click();
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,600)", "");

    }
    @Then("url contain {string} search show the relevant result")
    public void AssertionForurl(String theTargetedUrl){
        boolean Url = Hooks.driver.getCurrentUrl().contains(theTargetedUrl);
        Soft.assertEquals(Url,true);
        Soft.assertAll();
        System.out.println("Url is :"+Hooks.driver.getCurrentUrl());

    }

    @Given("user search for product with sku {string}")
    public void SearchWithSku(String SKU){
        NopSearch.SearchBySku().sendKeys(SKU);
    }

    @And("user click on product using {string}")
    public void ClickForProduct(String theTargetedSKU){
        NopSearch.ClickForSku().click();
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,350)", "");

    }

    @Then("sku in product page used with the same sku in search bar {string}")
    public void AssertOnSku (String SKU){
        boolean Actual = NopSearch.AssertForSKU().getText().contains(SKU);
        Assert.assertEquals(Actual,true,"NotDone");

    }
}

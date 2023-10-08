package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages_PomDesign.P08_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.HasDebugger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef {
    P08_Wishlist NopWishlist =new P08_Wishlist();
    SoftAssert Soft = new SoftAssert();


    @Given("user pick one of the product to his wishlist")
    public void PickProduct() throws InterruptedException{
        NopWishlist.GetProduct().click();
        Thread.sleep(2000);
        NopWishlist.SearchBar().click();

    }

    @Then("user can see the product added to his wishlist")
    public void AssertProduct(){

        boolean MessageDis = NopWishlist.AssertMessage().isDisplayed();
        Soft.assertEquals(MessageDis,true,"NoShow");
        String Green = NopWishlist.AssertColor().getCssValue("color");
        Soft.assertEquals(Green,"rgba(255, 255, 255, 1)");
        Soft.assertAll();
    }

    @When("user click on wishlist")
    public void ShowtheWishlist(){

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.invisibilityOf(NopWishlist.MessegeRemove()));
        NopWishlist.ClickForWishlist().click();

    }


    @Then("user can show product added to his wishlist and the Qty value increase")
    public void AssertIncreaseOfValue(){
       String value1 = NopWishlist.AssertValue().getAttribute("value");
        System.out.println("The Value Of Wishlist:"+value1);
        Integer Value = Integer.valueOf(value1);
        System.out.println(Value);
        Soft.assertEquals(Value>0,true,"BadMethod");
        Soft.assertAll();

    }


}

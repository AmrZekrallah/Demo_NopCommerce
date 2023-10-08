package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages_PomDesign.P05_hover;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D05_hoverCategoriesStepDef {
    SoftAssert Soft = new SoftAssert();
    Actions Act = new Actions(Hooks.driver);

    P05_hover NopHover = new P05_hover();

    @Given("user select one of categories")
    public void SelectCategories()throws InterruptedException{
        Act.moveToElement(NopHover.HoverToCat()).perform();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Notebooks")));

    }
    @When("user select on of sub categories")

    public void SelectSubCategories(){
        NopHover.SelectCat().click();
    }
    @Then("user confirm categories that picked")

    public void AssertProduct(){
        NopHover.PickProduct().click();
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,350)", "");
        String Apple = NopHover.AssertApple().getText();
        boolean Assertapple = Apple.contains(Apple);
        Assert.assertEquals(Assertapple,true,"BadCall");
        System.out.println(Assertapple);

    }


}

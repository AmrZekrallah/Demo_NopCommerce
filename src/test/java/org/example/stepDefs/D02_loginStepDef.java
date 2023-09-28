package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lv.Un;
import org.example.pages_PomDesign.P01_register;
import org.example.pages_PomDesign.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    SoftAssert Soft = new SoftAssert();
    P02_login NopeLogin = new P02_login();
    @Given("user go to login page")
    public void LoginPage(){
        NopeLogin.ClickLogin().click();
    }
    @When("user login with \"valid\" \"ID\" and \"Password\"")
    public void Enter_ID_Pass (){
        NopeLogin.EnterMail().sendKeys("amrsamirzekrallah@gmail.com");
        NopeLogin.EnterPass().sendKeys("Samra12345");
    }
    @And("user press on login button")
    public void PressLogin (){
        NopeLogin.PressLogin().click();
    }
    @Then("user login to the system successfully")
    public void AssertSuccessLogin() throws InterruptedException{
        String Url = Hooks.driver.getCurrentUrl();
        Soft.assertEquals(Url,"https://demo.nopcommerce.com/");
        Soft.assertAll();
        boolean Actual = NopeLogin.Assert_AccountButton().isDisplayed();
        Soft.assertEquals(Actual,true,"NotDonee");
        Soft.assertAll();
        Thread.sleep(1000);

    }
    @When("user login with \"invalid\" \"ID\" and \"Password\"")
    public void  Invalid_Mail_Pass (){
        NopeLogin.EnterMail().sendKeys("amrsaascdaslla@gmail.com");
        NopeLogin.EnterPass().sendKeys("Sam2345");


    }
    @Then("user could not login to the system")
    public void Fail_To_Login (){
        String Unsuccess = NopeLogin.Assert_FailLogin().getText();
        Soft.assertTrue(Unsuccess.contains("Login was unsuccessful"));
        String Red = NopeLogin.Assert_FailLogin().getCssValue("color");
        Soft.assertEquals(Red,"rgba(228, 67, 75, 1)");
        Soft.assertAll();
    }





}

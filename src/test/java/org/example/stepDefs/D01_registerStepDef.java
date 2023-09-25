package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages_PomDesign.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register NopeRegister = new P01_register();

    @Given("user go to register page")

    public void goRegisterPage() {

        NopeRegister.registerlink().click();
    }

    @When("user select gender type")
    public void GenderSelect() {
        NopeRegister.Gender().click();

    }

    @And("user enter first name and last name")
    public void Put_Names() {
        NopeRegister.UserFirstName().sendKeys("Amr");
        NopeRegister.UserLastName().sendKeys("Zekrallah");

    }

    @And("user enter date of birth")
    public void Birthdate() {
        WebElement Downlist = NopeRegister.BirthDay();
        Select Choose = new Select(Downlist);
        Choose.selectByValue("13");
        WebElement DownlistMounth = NopeRegister.BirthMounth();
        Select Sel = new Select(DownlistMounth);
        Sel.selectByValue("5");
        WebElement DownlistYears = NopeRegister.BirthYear();
        Select Sele = new Select(DownlistYears);
        Sele.selectByValue("1996");


    }
    @And("user enter email  field")
    public void Mail(){
        NopeRegister.Mails().sendKeys("amrsamirzekrallah@gmail.com");

    }
    @And("user add company name")
    public void Companyname(){
        NopeRegister.Company().sendKeys("TestingAgency");

    }


    @And("user fills Pa  password fields")
    public void Password_Fill(){
        NopeRegister.Password().sendKeys("Samra12345");
        NopeRegister.ConfirmPassword().sendKeys("Samra12345");
    }
    @And("user clicks on register button")
    public void ClickRegister(){
        NopeRegister.RegisterButton().click();
    }
    @Then("success message is displayed")
    public void Assertion()throws InterruptedException{
        SoftAssert Soft = new SoftAssert();
       // boolean Actual = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed();
        String Green = NopeRegister.ColorAssertion().getCssValue("color");
        System.out.println(Green);
        Soft.assertEquals(Green,"rgba(76, 177, 124, 1)","NotDone");
        Soft.assertAll();
        Thread.sleep(2000);
        NopeRegister.CompleteRegisterButton().click();
    }
}


package org.example.pages_PomDesign;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerlink () {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }
    public WebElement Gender () {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"gender-male\"]"));
    }

    public WebElement UserFirstName (){
        return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"First name is required.\"]"));

    }
    public WebElement UserLastName (){
        return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Last name is required.\"]"));

    }
    public WebElement ColorAssertion (){
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));

    }
    public WebElement BirthDay (){

        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
    }

    public WebElement BirthMounth (){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }
    public WebElement BirthYear (){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }
    public WebElement Mails (){
        return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Email is required.\"]"));
    }
    public WebElement Company (){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Company\"]"));

    }
    public WebElement RegisterButton(){
        return Hooks.driver.findElement(By.cssSelector("button[name=\"register-button\"]"));
    }
    public WebElement Password (){

        return Hooks.driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }
    public WebElement ConfirmPassword(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"ConfirmPassword\"]"));
    }
    public WebElement CompleteRegisterButton(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]"));
    }
}

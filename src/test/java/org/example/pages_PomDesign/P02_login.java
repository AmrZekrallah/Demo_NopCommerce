package org.example.pages_PomDesign;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement ClickLogin (){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement EnterMail(){
        return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Please enter your email\"]"));
    }
    public WebElement EnterPass (){
        return Hooks.driver.findElement(By.cssSelector("input[class=\"password\"]"));
    }
    public WebElement PressLogin (){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement Assert_AccountButton (){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
    public WebElement Assert_FailLogin(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}

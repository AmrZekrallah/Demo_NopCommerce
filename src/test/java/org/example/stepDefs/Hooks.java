package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
        public static WebDriver driver;

        @Before
        public static void OpenBrowser() {
            driver = new ChromeDriver();
            driver.navigate().to("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @After
        public static void QuitDriver() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }

}

package com.qa.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager {

    public static WebDriver getDriver(String browser){

        if(browser.equalsIgnoreCase("chrome")){

            return new ChromeDriver();

        }

        if(browser.equalsIgnoreCase("firefox")){

            return new FirefoxDriver();

        }

        throw new RuntimeException("Browser not supported");

    }

}
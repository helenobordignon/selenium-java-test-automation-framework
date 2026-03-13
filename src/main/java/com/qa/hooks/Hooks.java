package com.qa.hooks;

import com.qa.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){

        DriverFactory.getDriver().get("https://www.saucedemo.com/");

    }

    @After
    public void teardown(){

        DriverFactory.quitDriver();

    }

}
package com.qa.hooks;

import com.qa.driver.DriverFactory;
import com.qa.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void setup(){

        DriverFactory.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }

    @After
    public void teardown(){

        DriverFactory.quitDriver();

    }

}
package com.qa.base;

import com.qa.driver.DriverFactory;
import com.qa.utils.ConfigReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    void setup() {

        driver = DriverFactory.initDriver();

        Assertions.assertNotNull(driver);
        driver.get(ConfigReader.getProperty("baseUrl"));

    }

    @AfterEach
    void tearDown() {

        DriverFactory.quitDriver();

    }
}

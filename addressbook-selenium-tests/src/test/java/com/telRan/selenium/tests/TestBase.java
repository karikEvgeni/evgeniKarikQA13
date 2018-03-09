package com.telRan.selenium.tests;

import com.telRan.selenium.appManager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUp() throws Exception {
        app.start();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

}

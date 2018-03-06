package com.telRan.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
    FirefoxDriver wd;

    public HelperBase(FirefoxDriver wd) {
        this.wd = wd;
    }


    public void type(By locator, String text) {
        click(locator);
        if(!text.equals(null)){
            String existText = wd.findElement(locator).getAttribute("value");
            if(!text.equals(existText)){
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }
}

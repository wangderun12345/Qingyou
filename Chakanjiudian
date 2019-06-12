package com.example.appiumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;

public class Chakanjiudian  {
    AndroidDriver<WebElement> driver;
    public void Chakanjiudian() throws InterruptedException {
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"行程\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"添加行程\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"酒店\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"查找\")").click();
        driver.currentActivity();
        System.out.println();
    }


}

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

public class Huifupinglun {
    AndroidDriver<WebElement> driver;
    public void Huifupinglun() throws InterruptedException {

        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"消息\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"回复\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"说说你的看法...\")").sendKeys("对");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"发表\")").click();
        driver.currentActivity();
        System.out.println();
    }
}

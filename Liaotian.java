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

public class Liaotian {
    AndroidDriver<WebElement> driver;
    public void Liaotian() throws InterruptedException {

        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"消息\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"聊天\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"杨丽颖\")").click();
        driver.findElement(By.className("android.widget.EditText")).sendKeys("你好！");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"发送\")").click();
        driver.currentActivity();
        System.out.println();
    }
}

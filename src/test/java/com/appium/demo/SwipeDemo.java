package com.appium.demo;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SwipeDemo extends BaseTest {

        @Test
        public void longPressGesture() throws MalformedURLException, InterruptedException {
            driver.findElement(AppiumBy.accessibilityId("Views")).click();
            driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
            driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
            WebElement firstImage =driver.findElement(By.xpath("(//android.widget.imageView)[1]"));
            Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.imageView)[1]")).getAttribute("focusable"),"true");
            swipeAction(firstImage,"left");
            Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.imageView)[1]")).getAttribute("focusable"),"false");




        }
}
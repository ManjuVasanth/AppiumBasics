package com.appium.demo;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class FirstDemo extends BaseTest {
    @Test
    /*public void appiumTest() throws MalformedURLException {
        //Starting the Appium server

      AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\vasa_\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(200)).build();
        service.start();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("ManjuPhone");
        options.setApp("D:\\Manju\\AutomationTesting\\AppiumBasics\\src\\test\\java\\resources\\ApiDemos-debug.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);*/
        // Actual automation test cases

        public void wifiSettingsName() throws MalformedURLException{

            driver.findElement(AppiumBy.accessibilityId("Preference")).click();
            driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
            driver.findElement(By.id("android:id/checkbox")).click();
            driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
            String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
            Assert.assertEquals(alertTitle, "WiFi settings");
            driver.findElement(By.id("android:id/edit")).sendKeys("Manju Wifi");
            driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

        }


      /*  driver.quit();
        service.stop()*/;


    }
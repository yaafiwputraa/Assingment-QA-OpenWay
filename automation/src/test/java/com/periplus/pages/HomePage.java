package com.periplus.pages;

import com.periplus.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait   = wait;
    }

    public void navigateTo() {
        driver.get(ConfigReader.get("base.url"));
        System.out.println("Opened home page.");
    }

    public void searchFor(String keyword) {
        String encoded = keyword.replace(" ", "+");
        String searchUrl = ConfigReader.get("base.url") + "/product/Search?filter_name=" + encoded;
        driver.get(searchUrl);
        wait.until(ExpectedConditions.urlContains("Search"));
        System.out.println("Searched for: " + keyword);
    }
}
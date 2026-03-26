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

    private final By searchBox = By.name("search");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait   = wait;
    }

    public void navigateTo() {
        driver.get(ConfigReader.get("base.url"));
        System.out.println("Opened home page.");
    }

    public void searchFor(String keyword) {
        WebDriver d = driver;
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        d.findElement(searchBox).clear();
        d.findElement(searchBox).sendKeys(keyword);
        d.findElement(searchBox).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.urlContains("search"));
        System.out.println("Searched for: " + keyword);
    }
}
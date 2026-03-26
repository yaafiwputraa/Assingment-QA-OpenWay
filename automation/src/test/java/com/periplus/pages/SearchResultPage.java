package com.periplus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By firstProductLink = By.cssSelector(".product-layout .caption a");

    public SearchResultPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait   = wait;
    }

    public void clickFirstProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(firstProductLink));
        driver.findElement(firstProductLink).click();
        System.out.println("Clicked first product. URL: " + driver.getCurrentUrl());
    }
}

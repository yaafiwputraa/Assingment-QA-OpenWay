package com.periplus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By firstProductLink = By.cssSelector(".product-content h3 a");

    public SearchResultPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait   = wait;
    }

    public void clickFirstProduct() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".preloader")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductLink));
        org.openqa.selenium.WebElement el = driver.findElement(firstProductLink);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
        System.out.println("Clicked first product. URL: " + driver.getCurrentUrl());
    }
}

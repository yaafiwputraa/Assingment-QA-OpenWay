package com.periplus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By productNameLocator = By.cssSelector(".quickview-content h2");
    private final By addToCartButton    = By.cssSelector(".btn-add-to-cart");
    private final By successAlert       = By.cssSelector(".alert-success");

    public ProductDetailPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait   = wait;
    }

    public String getProductName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productNameLocator));
        String name = driver.findElement(productNameLocator).getText().trim();
        System.out.println("Product name: " + name);
        return name;
    }

    public void addToCart() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".preloader")));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", driver.findElement(addToCartButton));
        System.out.println("Clicked Add to Cart.");

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(successAlert));
            System.out.println("Success alert appeared.");
        } catch (TimeoutException e) {
            // Some product pages don't show an alert — not a failure
            System.out.println("No success alert; continuing to cart verification.");
        }
    }
}

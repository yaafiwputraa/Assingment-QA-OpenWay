package com.periplus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By productNameLocator = By.cssSelector("h1, .product-title");
    private final By addToCartButton    = By.id("button-cart");
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
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();
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

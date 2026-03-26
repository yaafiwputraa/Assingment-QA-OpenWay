package com.periplus.pages;

import com.periplus.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String CART_URL =
            ConfigReader.get("base.url") + "/index.php?route=checkout/cart";

    private final By cartTable    = By.cssSelector("table.table");
    private final By emptyMessage = By.xpath("//*[contains(text(),'shopping cart is empty')]");

    public CartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait   = wait;
    }

    public void navigateTo() {
        driver.get(CART_URL);
        wait.until(ExpectedConditions.urlContains("checkout/cart"));
        System.out.println("Opened cart page.");
    }

    public boolean isCartEmpty() {
        return !driver.findElements(emptyMessage).isEmpty();
    }

    public boolean isProductInCart(String productName) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(cartTable));
        } catch (Exception e) {
            return false;
        }
        return driver.getPageSource().contains(productName);
    }
}

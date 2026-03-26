package com.periplus.pages;

import com.periplus.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String LOGIN_URL =
            ConfigReader.get("base.url") + "/index.php?route=account/login";

    private final By emailField    = By.name("email");
    private final By passwordField = By.id("ps");
    private final By loginButton   = By.id("button-login");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait   = wait;
    }

    public void navigateTo() {
        driver.get(LOGIN_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        System.out.println("Opened login page.");
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
        wait.until(ExpectedConditions.not(
                ExpectedConditions.urlContains("account/login")
        ));
        System.out.println("Logged in. URL: " + driver.getCurrentUrl());
    }

    /** Convenience method: navigate + fill credentials + submit */
    public void login(String email, String password) {
        navigateTo();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
}
package com.periplus.tests;

import com.periplus.base.BaseTest;
import com.periplus.config.ConfigReader;
import com.periplus.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {

    /**
     * TC-CART-001 – Add a single product to the cart
     *
     * Steps:
     * 1. Open Periplus and log in
     * 2. Search for a product
     * 3. Open the first search result
     * 4. Add the product to the cart
     * 5. Navigate to the cart and verify the product is present
     */
    @Test
    public void testAddProductToCart() {
        String email    = ConfigReader.get("email");
        String password = ConfigReader.get("password");
        String keyword  = ConfigReader.get("search.keyword");

        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login(email, password);

        // Step 2: Search for a product
        HomePage homePage = new HomePage(driver, wait);
        homePage.navigateTo();
        homePage.searchFor(keyword);

        // Step 3: Click the first product in search results
        SearchResultPage searchResultPage = new SearchResultPage(driver, wait);
        searchResultPage.clickFirstProduct();

        // Step 4: Get product name, then add to cart
        ProductDetailPage productDetailPage = new ProductDetailPage(driver, wait);
        String productName = productDetailPage.getProductName();
        productDetailPage.addToCart();

        // Step 5: Navigate to cart and verify
        CartPage cartPage = new CartPage(driver, wait);
        cartPage.navigateTo();

        Assert.assertFalse(
                cartPage.isCartEmpty(),
                "Cart should not be empty after adding a product"
        );
        Assert.assertTrue(
                cartPage.isProductInCart(productName),
                "Product '" + productName + "' should be present in the cart"
        );

        System.out.println("PASS: '" + productName + "' successfully added to cart.");
    }
}

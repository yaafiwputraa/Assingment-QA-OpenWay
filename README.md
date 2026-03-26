# Periplus Shopping Cart – QA Assignment

QA Engineer internship assignment. Covers test documentation and test automation for the shopping cart feature of [Periplus](https://www.periplus.com).

## Structure

```
├── test-documentation/
│   ├── Answer1_TestCaseComponents.md   # Q1: Test case components & example
│   └── ShoppingCartTestCases.md        # Q2.1: 10 shopping cart test cases
└── automation/                         # Q2.2: Automated test
    ├── pom.xml
    └── src/
        ├── main/java/com/periplus/config/
        │   └── ConfigReader.java
        └── test/
            ├── java/com/periplus/
            │   ├── base/BaseTest.java
            │   ├── pages/
            │   │   ├── LoginPage.java
            │   │   ├── HomePage.java
            │   │   ├── SearchResultPage.java
            │   │   ├── ProductDetailPage.java
            │   │   └── CartPage.java
            │   └── tests/ShoppingCartTest.java
            └── resources/
                ├── config.properties   # Fill in credentials here
                └── testng.xml
```

## Tech Stack

- **Language:** Java 11
- **Test Framework:** TestNG 7.9
- **Browser Automation:** Selenium 4.18
- **Driver Management:** WebDriverManager 5.7 (auto-downloads ChromeDriver)
- **Build Tool:** Maven

## How to Run

1. Fill in your Periplus credentials in `automation/src/test/resources/config.properties`:
   ```properties
   email=your_email@example.com
   password=your_password
   ```

2. Run the test:
   ```bash
   cd automation
   mvn test
   ```

## Automated Test Scenario (TC-CART-001)

1. Open Periplus and log in
2. Search for a product
3. Open the first search result
4. Add the product to the cart
5. Navigate to cart and verify the product is present

# Answer 2.1 – Shopping Cart Test Cases (Periplus)

**Application:** Periplus Online Store (https://www.periplus.com)
**Feature:** Shopping Cart
**Total Test Cases:** 10

---

## TC-CART-001 – Add a Single Product to Cart *(Automated)*

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-001 |
| **Title** | Add a single product to the shopping cart |
| **Module** | Shopping Cart |
| **Priority** | High |
| **Preconditions** | User is logged in; product is in stock |
| **Test Steps** | 1. Search for a product. 2. Open product detail page. 3. Click "Add to Cart". 4. Navigate to cart page. |
| **Test Data** | Search keyword: "Harry Potter" |
| **Expected Result** | Cart is not empty; the product name appears in the cart |
| **Actual Result** | Cart is not empty; "Harry Potter: Hedwig Plush Journal" appears in the cart |
| **Status** | Pass |

---

## TC-CART-002 – Add Multiple Different Products to Cart

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-002 |
| **Title** | Add multiple different products to the cart |
| **Module** | Shopping Cart |
| **Priority** | High |
| **Preconditions** | User is logged in |
| **Test Steps** | 1. Add Product A to cart. 2. Navigate to Product B page. 3. Add Product B to cart. 4. Open cart. |
| **Test Data** | Product A and Product B (two different in-stock items) |
| **Expected Result** | Both products appear in the cart; cart count is 2 |

---

## TC-CART-003 – Add the Same Product Twice

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-003 |
| **Title** | Add the same product to the cart twice |
| **Module** | Shopping Cart |
| **Priority** | Medium |
| **Preconditions** | User is logged in; product is in stock |
| **Test Steps** | 1. Open a product detail page. 2. Click "Add to Cart". 3. Click "Add to Cart" again. 4. Open cart. |
| **Test Data** | Any single in-stock product |
| **Expected Result** | Cart shows the product with quantity 2 (merged into one line item, not two separate rows) |

---

## TC-CART-004 – Update Product Quantity in Cart

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-004 |
| **Title** | Update the quantity of a product already in the cart |
| **Module** | Shopping Cart |
| **Priority** | Medium |
| **Preconditions** | User is logged in; at least one product is in the cart |
| **Test Steps** | 1. Open cart. 2. Change product quantity from 1 to 3. 3. Click "Update". |
| **Test Data** | New quantity = 3 |
| **Expected Result** | Cart reflects quantity 3; subtotal recalculates correctly |

---

## TC-CART-005 – Remove a Product from Cart

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-005 |
| **Title** | Remove a product from the cart |
| **Module** | Shopping Cart |
| **Priority** | High |
| **Preconditions** | User is logged in; at least one product is in the cart |
| **Test Steps** | 1. Open cart. 2. Click the remove (X) button next to a product. |
| **Test Data** | Any product in cart |
| **Expected Result** | Product is removed from the cart; if cart becomes empty, an "empty cart" message is shown |

---

## TC-CART-006 – Attempt to Checkout with Empty Cart

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-006 |
| **Title** | Attempt to proceed to checkout with an empty cart |
| **Module** | Shopping Cart |
| **Priority** | Medium |
| **Preconditions** | User is logged in; cart is empty |
| **Test Steps** | 1. Navigate to the cart page. 2. Observe the page state or attempt to click "Checkout". |
| **Test Data** | Empty cart |
| **Expected Result** | Checkout button is disabled or a message states "Your shopping cart is empty" |

---

## TC-CART-007 – Proceed to Checkout from a Non-Empty Cart

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-007 |
| **Title** | Proceed to checkout from a cart with items |
| **Module** | Shopping Cart / Checkout |
| **Priority** | High |
| **Preconditions** | User is logged in; at least one product is in the cart |
| **Test Steps** | 1. Open cart. 2. Click "Proceed to Checkout". |
| **Test Data** | Any product in cart |
| **Expected Result** | User is redirected to the checkout page |

---

## TC-CART-008 – Cart Total Calculation is Correct

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-008 |
| **Title** | Verify that the cart total is calculated correctly |
| **Module** | Shopping Cart |
| **Priority** | High |
| **Preconditions** | User is logged in; two products with known prices are in the cart |
| **Test Steps** | 1. Add Product A (Rp 100.000) to cart. 2. Add Product B (Rp 150.000) to cart. 3. Open cart and check total. |
| **Test Data** | Product A = Rp 100.000, Product B = Rp 150.000 |
| **Expected Result** | Cart subtotal = Rp 250.000 |

---

## TC-CART-009 – Cart Persists After Re-login

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-009 |
| **Title** | Cart contents persist after logging out and logging back in |
| **Module** | Shopping Cart |
| **Priority** | Medium |
| **Preconditions** | User is logged in; at least one product is in the cart |
| **Test Steps** | 1. Add a product to cart. 2. Log out. 3. Log back in. 4. Open cart. |
| **Test Data** | Any in-stock product |
| **Expected Result** | The previously added product is still in the cart |

---

## TC-CART-010 – Add Out-of-Stock Product to Cart

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-010 |
| **Title** | Attempt to add an out-of-stock product to the cart |
| **Module** | Shopping Cart |
| **Priority** | Medium |
| **Preconditions** | An out-of-stock product exists on the site |
| **Test Steps** | 1. Navigate to an out-of-stock product page. 2. Observe the "Add to Cart" button. |
| **Test Data** | Out-of-stock product |
| **Expected Result** | "Add to Cart" button is disabled or not shown; an "Out of Stock" label is displayed |

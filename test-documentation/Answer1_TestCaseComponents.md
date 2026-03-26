# Answer 1 – Components of a Test Case

A well-structured test case consists of the following components:

| Component | Description |
|---|---|
| **Test Case ID** | Unique identifier for the test case (e.g., TC-CART-001) |
| **Title / Name** | Short description of what is being tested |
| **Module / Feature** | The feature or area under test (e.g., Shopping Cart) |
| **Priority** | Importance level: High / Medium / Low |
| **Preconditions** | Conditions that must be true before the test can run |
| **Test Steps** | Numbered, step-by-step actions to perform |
| **Test Data** | Input values or data used during the test |
| **Expected Result** | What should happen if the system works correctly |
| **Actual Result** | What actually happened (filled in during execution) |
| **Status** | Pass / Fail / Blocked / Not Executed |
| **Notes** | Any additional remarks or observations |

---

## Example of a Well-Constructed Test Case

| Field | Value |
|---|---|
| **Test Case ID** | TC-CART-001 |
| **Title** | Add a single product to the shopping cart |
| **Module** | Shopping Cart |
| **Priority** | High |
| **Preconditions** | User is logged in; at least one product is available and in stock |
| **Test Steps** | 1. Navigate to any product page. 2. Click the "Add to Cart" button. |
| **Test Data** | Product: "Harry Potter and the Sorcerer's Stone" |
| **Expected Result** | Cart icon updates to show quantity 1; the product name and price appear correctly in the cart |
| **Actual Result** | _(filled during execution)_ |
| **Status** | _(filled during execution)_ |
| **Notes** | Verify both cart icon count and cart page content |

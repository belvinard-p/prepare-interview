# Java Encapsulation Practice Exercises

The goal of these exercises is to demonstrate mastery of the three core principles of encapsulation:

1. **Data Hiding** (using private fields)
2. **Controlled Access** (using public getters and setters)
3. **Data Validation** (implementing logic inside the setters)

---

## Exercise 1: Basic Bank Account (Hiding and Access)

**Task:** Create a class named `BankAccount` that demonstrates fundamental encapsulation principles.

**Fields (Private Data Hiding):**
- `accountNumber` (String) - should not be directly accessible from outside the class
- `balance` (double) - should not be directly modifiable from outside the class

**Methods (Controlled Access):**
- **Constructor:** Create a constructor that takes `accountNumber` and initial `balance` as parameters
- **Getters:**
    - `getAccountNumber()` - returns the account number
    - `getBalance()` - returns the current balance
- **Setter:**
    - `setAccountNumber(String accountNumber)` - allows changing the account number
- **Bank Operations:**
    - `deposit(double amount)` - adds the specified amount to the balance (include validation for positive amounts)
    - `withdraw(double amount)` - subtracts the specified amount from the balance (include validation for sufficient funds and positive amounts)

**Key Learning Points:**
- The balance field has no direct setter to prevent uncontrolled modifications
- All balance changes must go through the controlled `deposit()` and `withdraw()` methods
- These methods include business logic validation to maintain data integrity

**Test Instructions:**
1. Create a `BankAccount` object with initial account number "ACC123" and balance 1000.0
2. Test the getters to verify initial values
3. Deposit 500.0 and verify the new balance is 1500.0
4. Withdraw 200.0 and verify the new balance is 1300.0
5. Attempt to withdraw 2000.0 (should fail due to insufficient funds)
6. Attempt to deposit -100.0 (should fail due to invalid amount)
7. Change the account number using the setter and verify the change
---

## Exercise 2: Student Grade (Data Validation)

**Task:** Create a class named `Student`. This exercise focuses heavily on data validation within the setter.

**Fields (Private Data Hiding):**
- `name` (String)
- `grade` (int)

**Methods (Controlled Access & Validation):**
- Provide getters for `name` and `grade`
- Provide a setter for `grade`. The setter must implement the following business rule:

**Validation Rule:** The grade can only be set if the new value is between 0 and 100 (inclusive).
- If the input grade is valid, set the private field
- If the input grade is invalid (e.g., -5 or 105), print an error message (e.g., "Error: Grade must be between 0 and 100") and do not change the private field's value

**Test:**
- Attempt to set the grade to 85 (Should succeed)
- Attempt to set the grade to 110 (Should fail and print the error)
- Verify the final grade using the getter (it should still be 85)

---

## Exercise 3: Rectangle (Calculated Read-Only Property)

**Task:** Create a class named `Rectangle`. This exercise focuses on a read-only property that hides its calculation logic.

**Fields (Private Data Hiding):**
- `length` (double)
- `width` (double)

**Methods (Controlled Access):**
- Provide setters and getters for `length` and `width` (You may add validation to ensure length and width are positive if you wish)
- **Calculated Getter:** Provide a public method `getArea()` that calculates and returns the area (length * width)

**Rule Check:** Do NOT create a private field named `area`. The area must only be calculated and returned when `getArea()` is called. This hides the computation details from external users.

**Test:** Create a `Rectangle`, set the length to 10.0 and width to 5.0. Call `getArea()` and print the result (50.0)


Goal: Track and protect stock quantity.
Fields:

productName

price

quantity

Rules:

Price must be positive.

Quantity cannot be negative.

Add methods:

addStock(int qty)

sell(int qty) (only if qty ≤ available stock)

✅ Extra: Add a getInventoryValue() method → price * quantity
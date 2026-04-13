# financial-calculators

# Financial Calculators (Java)

This project contains three Java-based financial calculators designed to help users perform common loan and investment calculations. Each calculator takes user input via the console and outputs the result based on standard financial formulas.

---

## 📌 Calculators Included

### 1. Mortgage Calculator

This calculator determines:

* Monthly loan payment
* Total interest paid over the life of the loan

**Inputs:**

* Loan principal (amount borrowed)
* Annual interest rate (in %)
* Loan term (in years)

**Formula Used:**

```
M = P × [ i(1 + i)^n / ((1 + i)^n − 1) ]
Total Interest = (M × n) − P
```

---

### 2. (Optional / If implemented) Additional Calculator

*(You can rename or remove this section if you only have 2 calculators so far.)*

---

### 3. Present Value of an Ordinary Annuity Calculator

This calculator determines how much money must be invested today to fund a series of future monthly payments.

**Inputs:**

* Monthly payout (PMT)
* Annual interest rate (in %)
* Number of years

**Formula Used:**

```
PV = PMT × [1 − (1 + i)^(-n)] / i
```

---
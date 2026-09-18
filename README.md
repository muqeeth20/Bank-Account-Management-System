# 🏦 Bank Account Management System

<p align="center">

### 💳 A Simple & Modular Banking Application Built with Java

A console-based banking system designed to demonstrate **Java Object-Oriented Programming, modular design, ArrayList, transaction handling, and input validation.**

</p>

---

## 🌟 Overview

The **Bank Account Management System** is a menu-driven Java application that simulates basic banking operations.

It allows users to create and manage customer accounts, perform deposits and withdrawals, check account balances, and view transaction history.

The project is organized into **separate Java classes**, making the application easier to understand, maintain, and extend.

---

## ✨ Features

| Feature                    | Description                                  |
| -------------------------- | -------------------------------------------- |
| 👤 **Customer Management** | Store and manage customer information        |
| 🏦 **Account Creation**    | Create new bank accounts                     |
| 💰 **Deposit**             | Deposit money into an account                |
| 💸 **Withdrawal**          | Withdraw money with balance verification     |
| 💳 **Balance Inquiry**     | Check the current account balance            |
| 🔎 **Account Search**      | Find accounts using account number           |
| 📜 **Transaction History** | Maintain deposit and withdrawal records      |
| 🛡️ **Input Validation**   | Validate user inputs and transaction amounts |

---

## 🛠️ Technologies Used

```text
☕ Java
🧱 Object-Oriented Programming
📋 ArrayList
⌨️ Scanner
🔄 Loops & Conditional Statements
🛡️ Input Validation
```

---

## 🧠 Java Concepts Demonstrated

This project helped me practice and implement:

* ✅ Classes & Objects
* ✅ Constructors
* ✅ Encapsulation
* ✅ Private Data Members
* ✅ Getter Methods
* ✅ Methods
* ✅ ArrayList
* ✅ Loops
* ✅ Conditional Statements
* ✅ Switch-Case
* ✅ Input Validation
* ✅ Modular Programming

---

## 📂 Project Structure

```text
Bank-Account-Management-System/
│
├── 📄 Main.java
├── 📄 Bank.java
├── 📄 Account.java
├── 📄 Customer.java
├── 📄 Transaction.java
├── 📄 Utils.java
├── 📄 .gitignore
└── 📄 README.md
```

### 📌 Class Responsibilities

#### `Main.java`

Handles the menu-driven interface and user interaction.

#### `Bank.java`

Manages accounts and transactions using `ArrayList`.

#### `Account.java`

Stores account details and handles deposit, withdrawal, and balance operations.

#### `Customer.java`

Stores customer information such as name, phone number, and email.

#### `Transaction.java`

Records transaction details including transaction type, amount, and date/time.

#### `Utils.java`

Contains reusable methods for input validation.

---

## 🔄 Application Workflow

```text
                    👤 Customer
                        │
                        ▼
                🏦 Create Account
                        │
                        ▼
                 💳 Account Created
                        │
             ┌──────────┴──────────┐
             ▼                     ▼
        💰 Deposit             💸 Withdraw
             │                     │
             └──────────┬──────────┘
                        ▼
                 💳 Balance Updated
                        │
                        ▼
                📜 Transaction Saved
```

---

## 🖥️ Application Menu

```text
====================================
     BANK ACCOUNT MANAGEMENT
====================================

1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Account
5. Display All Accounts
6. Transaction History
7. Exit

Enter your choice:
```

---

## 🚀 Getting Started

### Prerequisites

Make sure Java is installed on your system.

Check your Java version:

```bash
java --version
```

Check the Java compiler:

```bash
javac --version
```

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the repository

```bash
git clone https://github.com/muqeeth20/Bank-Account-Management-System.git
```

### 2️⃣ Navigate to the project

```bash
cd Bank-Account-Management-System
```

### 3️⃣ Compile the project

```bash
javac *.java
```

### 4️⃣ Run the application

```bash
java Main
```

---

## 💡 Example Operations

### Creating an Account

```text
Enter customer name: Rahul
Enter phone number: 9876543210
Enter email: rahul@gmail.com
Enter account type: Savings
Enter initial deposit: 5000

Account created successfully.
```

### Depositing Money

```text
Enter account number: 1001
Enter amount: 2000

Amount deposited successfully.
```

### Withdrawing Money

```text
Enter account number: 1001
Enter amount: 100
```

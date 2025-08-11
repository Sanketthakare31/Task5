# Task5
Bank Transaction logic .

**Java OOP Bank Account Simulation**
A simple console-based banking system implemented in Java, demonstrating object-oriented programming principles such as encapsulation, class design, and transaction tracking.

Features
Account Class

Complete with deposit(amount), withdraw(amount), and getBalance() methods.

Maintains balance privately with validation to prevent negative deposits or over-withdrawals.

Transaction History

Logs all transactions in a list.

Each entry records type (Deposit or Withdraw), amount, timestamp, and the resulting balance.

Console Interface

Interactive menu via terminal (works with VS Code, IntelliJ, etc.).

User-driven flow: deposit funds, withdraw, view balance, review transaction history, and exit.

/src
  ├── Main.java
  ├── Account.java
  └── Transaction.java
README.md

Code Executation :


1: Deposit | 2: Withdraw | 3: Balance | 4: History | 5: Exit
Choose: 1
Amount to deposit: 5000
Deposited: 5000.0

1: Deposit | 2: Withdraw | 3: Balance | 4: History | 5: Exit
Choose: 2
Amount to withdraw: 6000
Invalid or insufficient funds.

1: Deposit | 2: Withdraw | 3: Balance | 4: History | 5: Exit
Choose: 2
Amount to withdraw: 2000
Withdrew: 2000.0

1: Deposit | 2: Withdraw | 3: Balance | 4: History | 5: Exit
Choose: 3
Current Balance: 3000.0

1: Deposit | 2: Withdraw | 3: Balance | 4: History | 5: Exit
Choose: 4
Transaction History:
2025-08-11T21:31:15.158488579 | DEPOSIT | 5000.0 | Balance: 5000.0
2025-08-11T21:31:33.607198258 | WITHDRAW | 2000.0 | Balance: 3000.0

1: Deposit | 2: Withdraw | 3: Balance | 4: History | 5: Exit
Choose: 5
Goodbye!


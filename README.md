# Task5
**Bank Transaction logic .**

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

code : 
package com.Task;
// Main.java
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Account account = new Account();
        boolean exit = false;

        while (!exit) {
        	
            System.out.println("\n1: Deposit | 2: Withdraw | 3: Balance | 4: History | 5: Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 : {
                    System.out.print("Amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                }
                case 2 : {
                    System.out.print("Amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;
                }
                
                case 3 : 
                	System.out.println("Current Balance: " + account.getBalance());
                	break;
               
                case 4 : 
                	account.printTransactionHistory();
                	break; 
                	
                case 5 :
                	exit = true;
                break;
                
                default : System.out.println("Invalid choice.");
            }
        }

        sc.close();
        System.out.println("Goodbye!");
    }
}

package com.Task;
// Account.java
import java.util.ArrayList;
import java.util.List;

public class Account {
	
    private double balance = 0;
    
    private List<Transaction> transactions = new ArrayList<>();

    public void deposit(double amount) {
    	
        if (amount > 0) {
        	
            balance += amount;
            
            transactions.add(new Transaction("DEPOSIT", amount, balance));
            
            System.out.println("Deposited: " + amount);
            
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
    	
        if (amount > 0 && amount <= balance) {
        
        	balance -= amount;
            
        	transactions.add(new Transaction("WITHDRAW", amount, balance));
            
        	System.out.println("Withdrew: " + amount);
        } else {
            
        	System.out.println("Invalid or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
    	
        System.out.println("Transaction History:");
        
        for (Transaction t : transactions) {
        
        	System.out.println(t);
        }
    }
}


package com.Task;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timestamp;
    private double postBalance;

    public Transaction(String type, double amount, double postBalance) {
        this.type = type;
        this.amount = amount;
        this.postBalance = postBalance;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return timestamp + " | " + type + " | " + amount + " | Balance: " + postBalance;
    }
}

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


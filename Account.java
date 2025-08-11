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

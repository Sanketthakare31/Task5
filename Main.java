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

package module2;

import java.util.ArrayList;
import module1.Account;

public class TransactionManager{
    private ArrayList<Transaction>transactions;
     
    public TransactionManager(){
        transactions = new ArrayList<>();
    }

    public void deposit(Account account, double amount){
        if(amount > 0){
            account.deposit(amount);
            Transaction transaction = new Transaction ( transactions.size() +1,
        "Deposit", amount, account);
        transactions.add(transaction);
            System.out.println("Transaction recorded successfully.");
        } else { 
            System.out.println("Invalid deposit amount.");
        
        }
    }

    public void withdraw(Account account, double amount){
         if(amount > 0 && amount <= account.getBalance()){
            account.withdraw(amount);
            Transaction transaction = new Transaction( transactions.size() +1 ,"Withdrawal", amount, account);
            transactions.add(transaction);

            System.out.println("Transaction recorded successful.");
         } else {
            System.out.println("Insufficient balance or invalid amount.");
         }
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
        System.out.println("Transaction record added.");
    }
     public void displayTransactions(){
        System.out.println("\n====TRANSACTION HISTORY====");

        if(transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for(Transaction transaction : transactions){
            transaction.displayTransaction();
            System.out.println("----------------------------");
        }
     }

     public void transfer(Account fromAccount, Account toAccount, double amount) {
        if(amount > 0 && amount <= fromAccount.getBalance()) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);

            Transaction senderTransaction = new Transaction( transactions.size() + 1, "Transfer", amount, fromAccount);
            transactions.add(senderTransaction);
            System.out.println("₹" +amount +"transaferred successfully.");
            System.out.println("From Account :" +fromAccount.getAccountNumber());
            System.out.println("To Account :" + toAccount.getAccountNumber());
        } else { 
            System.out.println("insufficient balance or invalid amount.");
         }
     }

     public void checkBalance(Account account) {
        System.out.println("\n==== ACCOUNT BALANCE ====");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Current Balance: ₹" + account.getBalance());
     }
}
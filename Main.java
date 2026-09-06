import module1.Account;
import module1.Bank;
import module1.Customer;
import module2.TransactionManager;

public class Main{
    public static void main(String[]args)
    { 
        Bank bank1 = new Bank();

        Customer c1 = new Customer(
            101,
            "Rahul",
            "9326475831"
        );

        Customer c2 = new Customer(102,"priya","7488605941");

        bank1.registerCustomer(c1);
        bank1.registerCustomer(c2);

        Account a1 = new Account(1001, c1);
        Account a2 = new Account(1002, c2);

        bank1.createAccount(a1);
        bank1.createAccount(a2);

        TransactionManager tm = new TransactionManager();

        System.out.println("\n==== DEPOSIT ====");
        tm.deposit(a1,5000);
        tm.checkBalance(a1);

        System.out.println("\n==== WITHDRAWAL ====");
        tm.withdraw(a1, 1000);
        tm.checkBalance(a1);

        System.out.println("\n==== SECOND ACCOUNT DEPOSIT ====");
        tm.deposit(a2, 2000);

        System.out.println("\n==== TRANSFER ====");
        tm.transfer(a1, a2, 1000);
        
        System.out.println("\n===== FINAL BALANCES ======");
        tm.checkBalance(a1);
        tm.checkBalance(a2);
        tm.displayTransactions();
    }
}
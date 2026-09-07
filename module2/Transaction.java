package module2;
import module1.Account;

public class Transaction {
     
    private int transactionId;
    private String transactionType;
    private double amount;
    private Account account;

    //Default Constructor
    public Transaction() {
        transactionId = 0;
        transactionType = "";
        amount = 0.0;
        account = null; 
    }
    
    //Parameterized Constructor
    public Transaction(int transactionId, String transactionType, double amount, Account account) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.account = account;
    }
   
    //Copy Constructor
    public Transaction(Transaction t) {
        this.transactionId = t.transactionId;
        this.transactionType = t.transactionType;
        this.amount = t.amount;
        this.account = t.account;
    }

    //Getters
    public int getTransactionId() {
        return transactionId;
    }

    public String getTransactionType(){
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public Account getAccount(){
        return account;
    }
  
    //Display Transaction
    public void displayTransaction(){
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Transaction Type :" + transactionType);
        System.out.println("Amount :₹" + amount);

        if(account != null){
            System.out.println("Account Number : " +account.getAccountNumber());
        }
    }
 
}

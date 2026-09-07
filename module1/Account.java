package module1;

public class Account {

    private int accountNumber;
    private Customer customer;
    private double balance;

    public Account() {
       accountNumber = 0;
       customer = null;
       balance = 0.0;
    }

    public Account(int accountNumber, Customer customer){
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
    }

    public Account(Account a) {
        this.accountNumber = a.accountNumber;
        this.customer = a.customer;
        this.balance = a.balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void displayAccount(){
        System.out.println("Account Number :" + accountNumber);
         
        if (customer != null){
            System.out.println("Customer ID :" + customer.getCustomerId());
            System.out.println("Customer Name :" + customer.getName());
        } else {
            System.out.println("Customer : Not assigned");
        }
        System.out.println("Balance :₹" +balance);
    }

    //Deposit Money
    public void deposit(double amount){
      if(amount>0){
         balance += amount;
         System .out.println("₹" + amount + "deposited successfully.");
      } else {
         System.out.println("Invalid deposit amount.");
      }
   }

   //Withdraw Money    
   public void withdraw(double amount) {
      if(amount > 0 && amount <=balance) {
         balance -= amount;
         System.out.println("₹" +amount + "withdrawn succesfully.");
      } else{
         System.out.println("Insufficient balance or invalid amount.");
      }
    }

}

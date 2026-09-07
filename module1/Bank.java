package module1;

import java.util.ArrayList;

public class Bank{

    //Data members
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;

    //Default constructor
    public Bank() {
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    //Register Customer
    public void registerCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer registered successfully.");
    }

    //Create Account
    public void createAccount(Account account){
        accounts.add(account);
        System.out.println("Account created successfully.");
    }


    //View Customerr Details
    public void viewCustomerDetails(int customerId) {
        for (Customer customer : customers){
            if (customer.getCustomerId() == customerId) {
                customer.viewCustomerDetails();
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    //Update Customer
    public void  updateCustomer(int customerId, String name, String phone) {
        for(Customer customer : customers) {
            if(customer.getCustomerId() == customerId){ 
                 customer.setName(name);
                 customer.setphone(phone);

                 System.out.println("Customer updated successfully.");
                 return;
            }
        }
        System.out.println("Customer not found.");
    }

    //Display Account
    public void displayAccount(int accountNumber) {
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                account.displayAccount();
                return;
            }
        }
        System.out.println("Account not found.");
    }
}
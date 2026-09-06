package module1;

import java.util.ArrayList;

public class Bank{
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;

    public Bank() {
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer registered successfully.");
    }

    public void createAccount(Account account){
        accounts.add(account);
        System.out.println("Account created successfully.");
    }

    public void viewCustomerDetails(int customerId) {
        for (Customer customer : customers){
            if (customer.getCustomerId() == customerId) {
                customer.viewCustomerDetails();
                return;
            }
        }
        System.out.println("Customer not found.");
    }
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
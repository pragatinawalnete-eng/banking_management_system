package module1;

public class Customer {

    //Data members - Encapsulation
    private int customerId;
    private String name;
    private String phone;
    
    //Dfault constructor
    public Customer() {
        customerId = 0;
        name = "";
        phone = "";
    }

    //parameterized constructor
    public Customer(int customerId, String name, String phone){
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
    }

    //Getters
    public int getCustomerId() {
        return customerId;
    }

    public String getName(){
        return name;
    }

    public String getphone(){
        return phone;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    //Diplay customer details
    public void viewCustomerDetails(){
        System.out.println("Customer ID :" +customerId);
        System.out.println("Name :" +name);
        System.out.println("Phone :" +phone);
    }
}
package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        // Normal Java Function
        greetCustomer(new Customer("Maria", "999"));

        // Consumer Functional Interface
        greetCustomerConsumer.accept(new Customer("John", "111"));

        // Bi Consumer Functional Interface
        greetCustomerConsumerV2.accept(new Customer("Dave", "911"), true);
        greetCustomerConsumerV2.accept(new Customer("Sam", "111"), false);
    }


    // Normal Java Function
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }


    // Consumer Functional Interface
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
                    + customer.customerPhoneNumber);


    // Bi Consumer Functional Interface
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "***"));




    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}

package com.amigoscode.fonctionnelle;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal java function
        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);
        System.out.println("****uses ConsumerInterface with one arg******");
        // change apply with accept when we talk about void function
        greetCustomerConsumer.accept(maria);
        System.out.println("****uses ConsumerInterface with two args******");
        // change apply with accept when we talk about void function
        greetCustomerConsumerV2.accept(maria, true);
        greetCustomerConsumerV2.accept(maria, false);

    }
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2=(customer, showPhone) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
                    + (showPhone ? customer.customerPhoneNumber : "**********"));

    static Consumer<Customer> greetCustomerConsumer= customer ->
            System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number "
            + customer.customerPhoneNumber);
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number "
                + (customer.customerPhoneNumber));
    }
    static  class Customer{
        private final String customerName;
        private final String customerPhoneNumber;
        Customer(String c,String p){
            this.customerName=c;
            this.customerPhoneNumber=p;
        }
    }
}

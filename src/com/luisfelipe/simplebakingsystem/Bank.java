package com.luisfelipe.simplebakingsystem;
/**
 * Main class that simulates the operation of a banking system.
 * It creates customers and performs deposit, transfer, and display of information.
 *
 * @author Luís Felipe
 * @version 1.0
 * @since 2025-03-04
 */
public class Bank {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        Client client1 = new Client("John", "123-12-12345", bankAccount1);

        BankAccount bankAccount2 = new BankAccount();
        Client client2 = new Client("Mary", "321-21-54321", bankAccount2);

        bankAccount1.deposit(200);
        bankAccount2.deposit(150);

        System.out.println(client1.displayInformations());
        System.out.println(client2.displayInformations());

        bankAccount1.transfer(200, bankAccount2);

        System.out.println("AFTER TRANSFER");

        System.out.println(client1.displayInformations());
        System.out.println(client2.displayInformations());

    }
}

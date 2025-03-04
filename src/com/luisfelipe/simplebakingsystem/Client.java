package com.luisfelipe.simplebakingsystem;
/**
 * Class that represents a customer with a bank account.
 * It provides methods to display customer information and access their bank account balance.
 *
 * @author Luís Felipe
 * @version 1.0
 * @since 2025-03-04
 */
public class Client {

    private String name;
    private String ssn;
    private BankAccount account;

    public double getAccountBalance() {
        return this.account.getAccountBalance();
    }

    public Client(String name, String ssn, BankAccount account) {
        this.name = name;
        this.ssn = ssn;
        this.account = account;
    }

    public String displayInformations(){
        return "\n--------------------------------------------------"+
                "\n | NAME: "+ name +
                "\n | SSN (SOCIAL SECURITY NUMBER): " + ssn +
                "\n | ACCOUNT BALANCE: US$" + getAccountBalance() +
                "\n--------------------------------------------------";
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}

package com.luisfelipe.simplebakingsystem;
/**
 * Class that represents a bank account and is responsible for
 * performing operations such as deposit, withdrawal, and transfer
 * between accounts.
 *
 * @author Luís Felipe
 * @version 1.0
 * @since 2025-03-04
 */
public class BankAccount {

    private double AccountBalance;

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.AccountBalance = accountBalance;
    }

    public void deposit(double value) {
        if (value >= 0) {
            AccountBalance += value;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive!");
        }
    }

    public void withdraw(double value) {
        if (value >= 0 && value <= AccountBalance) {
            AccountBalance -= value;
        } else {
            throw new IllegalArgumentException("You cannot withdraw this amount!");
        }
    }

    public void transfer(double value, BankAccount destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }
}

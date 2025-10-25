package com.pluralsight.MixAssertions;

import org.junit.jupiter.api.function.Executable;

public class BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance < amount) {
            throw new IllegalArgumentException("Not enough funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

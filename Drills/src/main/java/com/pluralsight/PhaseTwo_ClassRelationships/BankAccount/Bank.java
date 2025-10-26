package com.pluralsight.PhaseTwo_ClassRelationships.BankAccount;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addAccount(int accNum, double balance) {
        accounts.add(new Account(accNum, balance));
    }

    public void getAccByNum(int accNum) {
        for(Account acc : accounts) {
            if(acc.getAccountNumber() == accNum) {
                System.out.printf("Account number: %d, Balance: %.2f", acc.getAccountNumber(), acc.getBalance());
            }
        }
    }

    public void depositToAccount(int accNum, double amount) {
        for(Account acc : accounts) {
            if(acc.getAccountNumber() == accNum) {
                acc.deposit(amount);
            }
        }
    }

    public void getAllAccounts() {
        for(Account acc : accounts) {
            System.out.printf("%d, %.2f\n", acc.getAccountNumber(), acc.getBalance());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

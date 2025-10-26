package com.pluralsight.PhaseTwo_ClassRelationships.BankAccount;

public class BankProgram {
    public static void main(String[] args) {
        Bank bank = new Bank("Richie's Bank");

        bank.addAccount(12345, 9000);
        bank.addAccount(67890, 450000);
        bank.addAccount(7126, 839450);
        bank.addAccount(1, 0);

        bank.depositToAccount(1, 50);
        System.out.printf("\n");
        bank.getAccByNum(1);
        System.out.printf("\n");
        bank.getAllAccounts();
    }
}

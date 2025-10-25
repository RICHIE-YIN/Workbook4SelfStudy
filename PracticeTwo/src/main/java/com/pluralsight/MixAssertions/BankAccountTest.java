package com.pluralsight.MixAssertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount();
    }

    @Test
    void depositMoney_updateBalance() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void withdrawMoney_updateBalance() {
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    void overdraftError() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(50000));
    }
}

package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        AccountHolder andre = new AccountHolder("Andrea", "Rossi", 1);
        AccountHolder alex = new AccountHolder("Alex", "bianchi", 2);
        BankAccount and = new SimpleBankAccount(1, 0);
        BankAccount ale = new StrictBankAccount(2, 0);
        and.deposit(1, 10000);
        ale.deposit(2, 10000);
        and.withdraw(1, 15000);
        ale.withdraw(2, 15000);
        and.printInfo();
        ale.printInfo();
        and.deposit(1, 10000);
        ale.deposit(2, 10000);
        and.chargeManagementFees(1);
        ale.chargeManagementFees(2);
        and.printInfo();
        ale.printInfo();
    }
}

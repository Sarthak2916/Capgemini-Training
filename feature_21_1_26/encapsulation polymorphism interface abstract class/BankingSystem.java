package feature_21_1_26.encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;
import java.util.List;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    protected BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumberMasked() {
        if (accountNumber == null || accountNumber.length() < 4) return "****";
        return "****" + accountNumber.substring(accountNumber.length() - 4);
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) return;
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }

    public abstract double calculateInterest();

    public void displayAccount() {
        System.out.println("Account: " + getAccountNumberMasked());
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    private double annualInterestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double annualInterestRate) {
        super(accountNumber, holderName, balance);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * annualInterestRate;
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return getBalance() >= 5000 && amount <= getBalance() * 5;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Loan Approved for amount: " + amount);
        } else {
            System.out.println("Loan Rejected for amount: " + amount);
        }
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double annualInterestRate;
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double annualInterestRate, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.annualInterestRate = annualInterestRate;
        this.overdraftLimit = overdraftLimit;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) return;
        if (amount > getBalance() + overdraftLimit) {
            System.out.println("Overdraft limit exceeded");
            return;
        }
        setBalance(getBalance() - amount);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * annualInterestRate;
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return getBalance() >= 10000 && amount <= (getBalance() + overdraftLimit) * 3;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Loan Approved for amount: " + amount);
        } else {
            System.out.println("Loan Rejected for amount: " + amount);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB1234567890", "Sarthak", 20000, 0.04));
        accounts.add(new CurrentAccount("CA9876543210", "Rahul", 15000, 0.02, 5000));

        for (BankAccount acc : accounts) {
            acc.displayAccount();

            double interest = acc.calculateInterest();
            System.out.println("Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                l.applyForLoan(30000);
            }
        }
    }
}


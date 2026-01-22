package feature_22_1_26.object_modeling;

import java.util.ArrayList;

public class Bank {

    String bankName;
    ArrayList<Customer> customers;

    Bank(String bankName){
        this.bankName= bankName;
        customers= new ArrayList<>();
    }

    void openAccount(Customer customer, Account account){
        if(!customers.contains(customer)) customers.add(customer);
        account.bank=this;
    }


}

class Customer{

    int customerId;
    String customerName;
    ArrayList<Account> accounts;


    Customer(int customerId, String customerName){
        this.customerId= customerId;
        this.customerName= customerName;
        accounts= new ArrayList<>();
    }

    void addAccount(Account account){
        if(account!=null) accounts.add(account);
    }
    void viewBalance(){
        System.out.println("Customer Name: "+customerName);
        if(accounts.isEmpty()) System.out.println("No Accounts Available");
        else for (Account a: accounts){
            System.out.println("Acc NO.: "+a.accountNumber+"\nBank Name: "+a.bank.bankName+"\nBank Balance: "+a.balance);
        }
    }

}

class Account{

    long accountNumber;
    double balance;
    Bank bank;

    Account(long accountNumber, double balance){
        this.accountNumber= accountNumber;
        this.balance= balance;
    }
}

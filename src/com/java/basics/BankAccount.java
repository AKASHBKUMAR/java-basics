package com.java.basics;

//Implementing a Banking Application
abstract class User {
    private final int accountNumber;
    private final String accountIfscCode;
    protected double interestRate;
    private String accountHolderFirstName;
    private String accountHolderLastName;
    private String accountBranch;
    private boolean hasAtmCard;
    private boolean hasCreditCard;
    private int balance;

    User() {
        accountNumber = 0;
        accountIfscCode = null;
        hasAtmCard = false;
        hasCreditCard = false;
        balance = 0;
    }

    abstract void calculateInterest();

    abstract void showBalance();


}

class CommercialUser extends User {
    private double accountBalance;

    CommercialUser() {

    }

    @Override
    void calculateInterest() {
        accountBalance = accountBalance * interestRate;
    }

    @Override
    void showBalance() {
        System.out.println("Your Current Balance is: " + accountBalance);
    }
}

class CorporateUser extends User {
    private double accountBalance;

    CorporateUser() {
        interestRate = 15.00;
    }

    @Override
    void calculateInterest() {
        accountBalance = accountBalance * interestRate;
    }

    @Override
    void showBalance() {
        System.out.println("Your Current Balance is: " + accountBalance);
    }
}

public class BankAccount {


}

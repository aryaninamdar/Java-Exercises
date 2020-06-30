package com.company;

import java.util.Scanner;

public class Member {
    private String name;
    private String bankName;
    private int accountNumber;
    private int accountPassword;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(int accountPassword) {
        this.accountPassword = accountPassword;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Member (String name, String bankName, int accountNumber, int accountPassword, int balance) {
        this.name = name;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
        this.balance = balance;
    }

    public String toString() {
        return ("\nName: " + name + "\nBank Name: " + bankName + "\nBalance: " + balance);
    }
}

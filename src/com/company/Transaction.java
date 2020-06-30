package com.company;

import java.util.Scanner;

public class Transaction {
    public void makeTransaction(Member member) {
        Scanner transScan = new Scanner(System.in);
        System.out.println(member.getName() + ", do you want to make a transaction?");
        String choice = transScan.next();
        while (true) {
            if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
                System.out.println("1. Deposit\n2. Withdrawl\n3. Check Balance");
                System.out.println("What kind of transaction do you want to make (type quit to exit)?");
                String transChoice = transScan.next();
                if (transChoice.equals("1") || transChoice.equalsIgnoreCase("deposit")) {
                    System.out.println("Enter an amount that you want to deposit: ");
                    int depositInput = transScan.nextInt();
                    member.setBalance(member.getBalance() + depositInput);
                }
                else if (transChoice.equals("2") || transChoice.equalsIgnoreCase("withdrawl")) {
                    System.out.println("Enter an amount that you want to withdraw: ");
                    int withdrawInput = transScan.nextInt();
                    member.setBalance(member.getBalance() - withdrawInput);
                }
                else if (transChoice.equals("3") || transChoice.equalsIgnoreCase("check") || transChoice.equalsIgnoreCase("balance")) {
                    System.out.println("Balance: " + member.getBalance());
                }
                else if (transChoice.equalsIgnoreCase("quit")){
                    System.out.println("Balance: " + member.getBalance());;
                    System.exit(0);
                }
            }
            else if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")) {
                System.out.println("Balance: " + member.getBalance());
                System.exit(0);
            }
        }
    }
}

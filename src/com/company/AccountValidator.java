package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class AccountValidator {
    public void validateAccountDetails(List<Member> members, Member member) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNumberInput = scanner.nextInt();
        System.out.println("Enter account password: ");
        int accountPasswordInput = scanner.nextInt();
        if (accountNumberInput != member.getAccountNumber()) {
            System.out.println("Invalid account details entered.");
            System.exit(0);
        }
        else if (accountPasswordInput != member.getAccountPassword()) {
            System.out.println("Invalid account details entered.");
            System.exit(0);
        }
        else {
            List<Member> filteredList = members.stream()
                    .filter(m -> m.getAccountNumber() == accountNumberInput)
                    .filter(m -> m.getAccountPassword() == accountPasswordInput)
                    .collect(Collectors.toList());
            System.out.println("Here are your account details: " + filteredList.toString());
        }
    }
}

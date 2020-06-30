package com.company;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Validator {
    public void validateAccount(List<DataUser> dataUsers, DataUser dataUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String userNameInput = scanner.next();
        if (userNameInput.equalsIgnoreCase(dataUser.getName())) {
            List<DataUser> filteredDataUser = dataUsers.stream()
                    .filter(d -> d.getName().equalsIgnoreCase(userNameInput))
                    .collect(Collectors.toList());
            System.out.println("Here are your account details:\n" + filteredDataUser.toString());
        }
        else {
            System.out.println("This name is not registered under this data provider.\nACCESS DENIED");
            System.exit(0);
        }
    }
}

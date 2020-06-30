package com.company;

import java.util.ArrayList;
import java.util.List;

public class Verizon {
    public static void main(String[] args) {
        List<DataUser> dataUsers = new ArrayList<>();
        DataUser dataUser1 = new DataUser("Aryan Inamdar", 40, 100, 2.0);
        DataUser dataUser2 = new DataUser("Dhananjay Inamdar", 90, 60, 2.4);
        DataUser dataUser3 = new DataUser("Jasmina Desai", 120, 10, 1.8);
        dataUsers.add(dataUser1);
        dataUsers.add(dataUser2);
        dataUsers.add(dataUser3);
        for (DataUser dataUser: dataUsers) {
            Validator validator = new Validator();
            validator.validateAccount(dataUsers, dataUser);
            UpdateAccount updateAccount = new UpdateAccount();
            updateAccount.updateAccountDetails(dataUser);
        }
    }
}

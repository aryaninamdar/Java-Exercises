package com.company;
import java.util.Scanner;

public class UpdateAccount {
    public void updateAccountDetails(DataUser dataUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of call minutes used this month: ");
        int callInput = scanner.nextInt();
        dataUser.setCallMinutes(dataUser.getCallMinutes() + callInput);
        System.out.println("Enter number of text minutes used this month: ");
        int textInput = scanner.nextInt();
        dataUser.setTextMinutes(dataUser.getTextMinutes() + textInput);
        int totalMinutes = callInput + textInput;
        double moreGBUsed = totalMinutes/100;
        System.out.println("You used " + moreGBUsed + " more GB this month.");
        System.out.println("You have now used a total of " + (dataUser.getGbUsed() + moreGBUsed) + " GB");
        dataUser.setGbUsed(dataUser.getGbUsed() + moreGBUsed);
        System.out.println("Here are your updated account details:\n" + dataUser.toString());
    }

}
